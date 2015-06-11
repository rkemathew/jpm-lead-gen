package com.jpm.leadgen.core.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.jpm.leadgen.core.models.entities.Blog;
import com.jpm.leadgen.core.models.entities.BlogEntry;
import com.jpm.leadgen.core.repositories.BlogEntryRepo;
import com.jpm.leadgen.core.repositories.BlogRepo;
import com.jpm.leadgen.core.services.BlogService;
import com.jpm.leadgen.core.services.exceptions.BlogNotFoundException;
import com.jpm.leadgen.core.services.util.BlogEntryList;
import com.jpm.leadgen.core.services.util.BlogList;

/**
 * Created by Chris on 7/10/14.
 */
@Service
@Transactional
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepo blogRepo;

    @Autowired
    private BlogEntryRepo entryRepo;

    @Override
    public BlogEntry createBlogEntry(Long blogId, BlogEntry data) {
        Blog blog = blogRepo.findBlog(blogId);
        if(blog == null)
        {
            throw new BlogNotFoundException();
        }
        BlogEntry entry = entryRepo.createBlogEntry(data);
        entry.setBlog(blog);
        return entry;
    }

    @Override
    public BlogList findAllBlogs() {
        return new BlogList(blogRepo.findAllBlogs());
    }

    @Override
    public BlogEntryList findAllBlogEntries(Long blogId) {
        Blog blog = blogRepo.findBlog(blogId);
        if(blog == null)
        {
            throw new BlogNotFoundException();
        }
        return new BlogEntryList(blogId, entryRepo.findByBlogId(blogId));
    }

    @Override
    public Blog findBlog(Long id) {
        return blogRepo.findBlog(id);
    }
}
