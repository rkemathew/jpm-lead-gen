package com.jpm.leadgen.rest.resources.asm;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.jpm.leadgen.core.models.entities.BlogEntry;
import com.jpm.leadgen.rest.mvc.BlogController;
import com.jpm.leadgen.rest.mvc.BlogEntryController;
import com.jpm.leadgen.rest.resources.BlogEntryResource;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

/**
 * Created by Chris on 6/27/14.
 */
public class BlogEntryResourceAsm extends ResourceAssemblerSupport<BlogEntry, BlogEntryResource> {

    public BlogEntryResourceAsm()
    {
        super(BlogEntryController.class, BlogEntryResource.class);
    }

    @Override
    public BlogEntryResource toResource(BlogEntry blogEntry) {
        BlogEntryResource res = new BlogEntryResource();
        res.setTitle(blogEntry.getTitle());
        res.setContent(blogEntry.getContent());
        res.setRid(blogEntry.getId());
        Link self = linkTo(BlogEntryController.class).slash(blogEntry.getId()).withSelfRel();
        res.add(self);
        if(blogEntry.getBlog() != null)
        {
            res.add((linkTo(BlogController.class).slash(blogEntry.getBlog().getId()).withRel("blog")));
        }
        return res;
    }
}
