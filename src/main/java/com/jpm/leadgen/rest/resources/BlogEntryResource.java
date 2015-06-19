package com.jpm.leadgen.rest.resources;

import com.jpm.leadgen.core.models.entities.BlogEntry;
import org.springframework.hateoas.ResourceSupport;

/**
 * Created by Chris on 6/27/14.
 */
public class BlogEntryResource extends ModelEntityResource {
    private String title;

    private String content;

    private Long rid;

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public BlogEntry toBlogEntry() {
        BlogEntry entry = new BlogEntry();
        entry.setTitle(title);
        entry.setContent(content);
        entry.setErrorMessage(getErrorMessage());

        return entry;
    }
}
