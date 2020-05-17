package com.vegetto.recode.domain.dto;

import com.vegetto.recode.domain.Type;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;

public class FactionDTO {

    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String viewName;
    private String factionLogo;
    private ZonedDateTime createdDateTime;
    private TypeDTO type;
    private FactionDTO faction;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ZonedDateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(ZonedDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    public String getFactionLogo() {
        return factionLogo;
    }

    public void setFactionLogo(String factionLogo) {
        this.factionLogo = factionLogo;
    }

    public TypeDTO getType() {
        return type;
    }

    public void setType(TypeDTO type) {
        this.type = type;
    }

    public FactionDTO getFaction() {
        return faction;
    }

    public void setFaction(FactionDTO faction) {
        this.faction = faction;
    }
}
