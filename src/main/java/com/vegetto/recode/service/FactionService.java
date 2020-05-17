package com.vegetto.recode.service;

import com.vegetto.recode.domain.Faction;
import com.vegetto.recode.domain.dto.FactionDTO;
import com.vegetto.recode.domain.mapper.CustomMapper;
import com.vegetto.recode.repository.FactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class FactionService {

    @Autowired
    private FactionRepository factionRepostory;

    public Set<FactionDTO> getAllFactions() {
        return factionRepostory.findAll().stream().map(t-> CustomMapper.INSTANCE.factionToFactionDTO(t)).collect(Collectors.toSet());
    }

    public FactionDTO getFactions(Long id) {
        return CustomMapper.INSTANCE.factionToFactionDTO(factionRepostory.findById(id).orElse(new Faction()));
    }
}
