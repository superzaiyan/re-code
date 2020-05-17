package com.vegetto.recode.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "amount", nullable = false)
    @NotNull
    private BigDecimal amount;

    @Column(name = "description", nullable = false)
    @NotNull
    private String description;

    @Column(name = "notes")
    private String notes;

    @Column(name = "created_date_time")
    private ZonedDateTime createdDateTime;

    @Column(name = "transaction_date_time")
    private ZonedDateTime transactionDateTime;

    @ManyToOne
    private Contact contact;

    @ManyToOne
    private Faction faction;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public ZonedDateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(ZonedDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public ZonedDateTime getTransactionDateTime() {
        return transactionDateTime;
    }

    public void setTransactionDateTime(ZonedDateTime transactionDateTime) {
        this.transactionDateTime = transactionDateTime;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Faction getFaction() {
        return faction;
    }

    public void setFaction(Faction faction) {
        this.faction = faction;
    }
}
