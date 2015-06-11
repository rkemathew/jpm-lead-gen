package com.jpm.leadgen.rest.resources.asm;

import com.jpm.leadgen.core.services.util.AccountList;
import com.jpm.leadgen.rest.resources.AccountListResource;
import com.jpm.leadgen.rest.resources.AccountResource;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.jpm.leadgen.rest.mvc.AccountController;

import java.util.List;

/**
 * Created by Chris on 7/22/14.
 */
public class AccountListResourceAsm extends ResourceAssemblerSupport<AccountList, AccountListResource> {


    public AccountListResourceAsm() {
        super(AccountController.class, AccountListResource.class);
    }

    @Override
    public AccountListResource toResource(AccountList accountList) {
        List<AccountResource> resList = new AccountResourceAsm().toResources(accountList.getAccounts());
        AccountListResource finalRes = new AccountListResource();
        finalRes.setAccounts(resList);
        return finalRes;
    }
}
