package com.vegetto.recode.repository;

import com.vegetto.recode.domain.Contact;
import com.vegetto.recode.domain.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
}
