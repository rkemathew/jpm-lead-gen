package com.jpm.leadgen.rest.resources;

import org.springframework.hateoas.ResourceSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chris on 7/22/14.
 */
public class ProposalSessionListResource extends ResourceSupport {
    private List<ProposalSessionResource> proposalSessions = new ArrayList<ProposalSessionResource>();

    public List<ProposalSessionResource> getProposalSessions() {
        return proposalSessions;
    }

    public void setCustomers(List<ProposalSessionResource> proposalSessions) {
        this.proposalSessions = proposalSessions;
    }
}
