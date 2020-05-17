package com.vegetto.recode.web.rest;

import com.vegetto.recode.domain.Type;
import com.vegetto.recode.domain.dto.TypeDTO;
import com.vegetto.recode.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/type")
public class TypeResource {

    @Autowired
    private TypeService typeService;

    @GetMapping
    public ResponseEntity<Set<TypeDTO>> getAllTypes() {
        return new ResponseEntity<>(typeService.getAllTypes(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TypeDTO> getType(@PathVariable Long id) {
        if (id != null)
            return new ResponseEntity<>(typeService.getTypes(id), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
