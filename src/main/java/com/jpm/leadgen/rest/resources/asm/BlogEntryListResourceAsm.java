package com.jpm.leadgen.rest.resources.asm;

import com.jpm.leadgen.rest.mvc.BlogController;
import com.jpm.leadgen.rest.resources.BlogEntryListResource;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.jpm.leadgen.core.services.util.BlogEntryList;
import com.jpm.leadgen.rest.resources.BlogEntryResource;
import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

/**
 * Created by Chris on 6/28/14.
 */
public class BlogEntryListResourceAsm extends ResourceAssemblerSupport<BlogEntryList, BlogEntryListResource> {
    public BlogEntryListResourceAsm() {
        super(BlogController.class, BlogEntryListResource.class);
    }

    @Override
    public BlogEntryListResource toResource(BlogEntryList list) {
        List<BlogEntryResource> resources = new BlogEntryResourceAsm().toResources(list.getEntries());
        BlogEntryListResource listResource = new BlogEntryListResource();
        listResource.setEntries(resources);
        listResource.add(linkTo(methodOn(BlogController.class).findAllBlogEntries(list.getBlogId())).withSelfRel());
        return listResource;
    }
}
