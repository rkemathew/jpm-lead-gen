package com.jpm.leadgen.core.repositories;

import com.jpm.leadgen.core.models.entities.Blog;

import java.util.List;

/**
 * Created by Chris on 7/10/14.
 */
public interface BlogRepo {
    public Blog createBlog(Blog data);
    public List<Blog> findAllBlogs();
    public Blog findBlog(Long id);
    public Blog findBlogByTitle(String title);
    public List<Blog> findBlogsByAccount(Long accountId);
}
