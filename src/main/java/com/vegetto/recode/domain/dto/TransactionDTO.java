package com.vegetto.recode.domain.dto;

import com.vegetto.recode.domain.Contact;
import com.vegetto.recode.domain.Faction;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.ZonedDateTime;

public class TransactionDTO {

    private Long id;
    @NotNull
    private BigDecimal amount;
    @NotNull
    private String description;
    private String notes;
    private ZonedDateTime createdDateTime;
    @NotNull
    private ZonedDateTime transactionDateTime;
    private ContactDTO contact;
    private FactionDTO faction;

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

    public ContactDTO getContact() {
        return contact;
    }

    public void setContact(ContactDTO contact) {
        this.contact = contact;
    }

    public FactionDTO getFaction() {
        return faction;
    }

    public void setFaction(FactionDTO faction) {
        this.faction = faction;
    }
}
