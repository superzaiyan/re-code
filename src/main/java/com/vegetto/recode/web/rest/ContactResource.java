package com.vegetto.recode.web.rest;

import com.vegetto.recode.domain.dto.ContactDTO;
import com.vegetto.recode.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/contact")
public class ContactResource {

    @Autowired
    private ContactService contactService;

    @GetMapping
    public ResponseEntity<Set<ContactDTO>> getAllContacts() {
        return new ResponseEntity<>(contactService.getAllContacts(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ContactDTO> getContact(@PathVariable Long id) {
        if (id != null)
            return new ResponseEntity<>(contactService.getContacts(id), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
