package com.vegetto.recode.service;

import com.vegetto.recode.domain.Transaction;
import com.vegetto.recode.domain.dto.TransactionDTO;
import com.vegetto.recode.domain.mapper.CustomMapper;
import com.vegetto.recode.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepostory;

    public Set<TransactionDTO> getAllTransactions() {
        return transactionRepostory.findAll().stream().map(t-> CustomMapper.INSTANCE.transactionToTransactionDTO(t)).collect(Collectors.toSet());
    }

    public TransactionDTO getTransactions(Long id) {
        return CustomMapper.INSTANCE.transactionToTransactionDTO(transactionRepostory.findById(id).orElse(new Transaction()));
    }
}
