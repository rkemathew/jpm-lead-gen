package com.jpm.leadgen.rest.resources.asm;

import com.jpm.leadgen.core.services.util.BlogList;
import com.jpm.leadgen.rest.mvc.BlogController;
import com.jpm.leadgen.rest.resources.BlogListResource;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

/**
 * Created by Chris on 7/1/14.
 */
public class BlogListResourceAsm extends ResourceAssemblerSupport<BlogList, BlogListResource> {

    public BlogListResourceAsm()
    {
        super(BlogController.class, BlogListResource.class);
    }

    @Override
    public BlogListResource toResource(BlogList blogList) {
        BlogListResource res = new BlogListResource();
        res.setBlogs(new BlogResourceAsm().toResources(blogList.getBlogs()));
        return res;
    }
}
