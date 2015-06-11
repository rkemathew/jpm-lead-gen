package com.jpm.leadgen.core.services;

import com.jpm.leadgen.core.models.entities.Blog;
import com.jpm.leadgen.core.models.entities.BlogEntry;
import com.jpm.leadgen.core.services.exceptions.BlogNotFoundException;
import com.jpm.leadgen.core.services.util.BlogList;
import com.jpm.leadgen.core.services.util.BlogEntryList;

/**
 * Created by Chris on 6/28/14.
 */
public interface BlogService {
    /**
     * @param blogId the id of the blog to add this BlogEntry to
     * @param data the BlogEntry containing the data to be used for creating the new entity
     * @return the created BlogEntry with a generated ID
     * @throws BlogNotFoundException if the blog to add to cannot be found
     */
    public BlogEntry createBlogEntry(Long blogId, BlogEntry data);

    public BlogList findAllBlogs();

    public BlogEntryList findAllBlogEntries(Long blogId); // findBlog all associated blog entries

    public Blog findBlog(Long id);
}
