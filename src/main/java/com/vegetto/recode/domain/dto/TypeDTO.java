package com.vegetto.recode.domain.dto;

import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;

public class TypeDTO {
    private Long id;
    @NotNull
    private String title;
    private ZonedDateTime createdDateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ZonedDateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(ZonedDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
    }
}
