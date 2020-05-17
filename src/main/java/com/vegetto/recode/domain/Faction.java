package com.vegetto.recode.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.ZonedDateTime;

@Entity
@Table(name = "faction")
public class Faction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", nullable = false, unique = true)
    @NotNull
    private String name;

    @Column(name = "view_name", nullable = false)
    @NotNull
    private String viewName;

    @Column(name = "faction_logo")
    private String factionLogo;

    @Column(name = "created_date_time")
    private ZonedDateTime createdDateTime;

    @ManyToOne
    private Type type;

    @ManyToOne
    @JoinColumn(name = "sub_faction_id")
    private Faction subFaction;

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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Faction getFaction() {
        return subFaction;
    }

    public void setFaction(Faction subFaction) {
        this.subFaction = subFaction;
    }

    @Override
    public String toString() {
        return "Faction{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", viewName='" + viewName + '\'' +
                ", factionLogo='" + factionLogo + '\'' +
                ", createdDateTime=" + createdDateTime +
                ", type=" + type +
                ", subFaction=" + subFaction +
                '}';
    }
}
