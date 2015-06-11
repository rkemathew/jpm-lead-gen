package com.jpm.leadgen.core.services;

import com.jpm.leadgen.core.models.entities.Account;
import com.jpm.leadgen.core.models.entities.Blog;
import com.jpm.leadgen.core.services.util.AccountList;
import com.jpm.leadgen.core.services.util.BlogList;

/**
 * Created by Chris on 6/28/14.
 */
public interface AccountService {
    public Account findAccount(Long id);
    public Account createAccount(Account data);
    public Blog createBlog(Long accountId, Blog data);
    public BlogList findBlogsByAccount(Long accountId);
    public AccountList findAllAccounts();
    public Account findByAccountName(String name);
}
