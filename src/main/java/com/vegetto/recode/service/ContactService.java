package com.vegetto.recode.service;

import com.vegetto.recode.domain.Contact;
import com.vegetto.recode.domain.dto.ContactDTO;
import com.vegetto.recode.domain.mapper.CustomMapper;
import com.vegetto.recode.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepostory;

    public Set<ContactDTO> getAllContacts() {
        return contactRepostory.findAll().stream().map(t-> CustomMapper.INSTANCE.contactToContactDTO(t)).collect(Collectors.toSet());
    }

    public ContactDTO getContacts(Long id) {
        return CustomMapper.INSTANCE.contactToContactDTO(contactRepostory.findById(id).orElse(new Contact()));
    }
}
