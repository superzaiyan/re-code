package com.vegetto.recode.web.rest;

import com.vegetto.recode.domain.dto.TransactionDTO;
import com.vegetto.recode.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/transaction")
public class TransactionResource {

    @Autowired
    private TransactionService transactionService;

    @GetMapping
    public ResponseEntity<Set<TransactionDTO>> getAllTransactions() {
        return new ResponseEntity<>(transactionService.getAllTransactions(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TransactionDTO> getTransaction(@PathVariable Long id) {
        if (id != null)
            return new ResponseEntity<>(transactionService.getTransactions(id), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
