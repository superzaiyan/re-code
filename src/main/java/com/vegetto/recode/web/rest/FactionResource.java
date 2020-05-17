package com.vegetto.recode.web.rest;

import com.vegetto.recode.domain.dto.FactionDTO;
import com.vegetto.recode.service.FactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/faction")
public class FactionResource {

    @Autowired
    private FactionService factionService;

    @GetMapping
    public ResponseEntity<Set<FactionDTO>> getAllFactions() {
        return new ResponseEntity<>(factionService.getAllFactions(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FactionDTO> getFaction(@PathVariable Long id) {
        if (id != null)
            return new ResponseEntity<>(factionService.getFactions(id), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
