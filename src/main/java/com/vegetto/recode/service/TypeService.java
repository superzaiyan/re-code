package com.vegetto.recode.service;

import com.vegetto.recode.domain.Type;
import com.vegetto.recode.domain.dto.TypeDTO;
import com.vegetto.recode.domain.mapper.CustomMapper;
import com.vegetto.recode.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class TypeService {

    @Autowired
    private TypeRepository typeRepostory;

    public Set<TypeDTO> getAllTypes() {
        return typeRepostory.findAll().stream().map(t-> CustomMapper.INSTANCE.typeToTypeDTO(t)).collect(Collectors.toSet());
    }

    public TypeDTO getTypes(Long id) {
        return CustomMapper.INSTANCE.typeToTypeDTO(typeRepostory.findById(id).orElse(new Type()));
    }
}
