package com.vegetto.recode.domain.mapper;

import com.vegetto.recode.domain.Contact;
import com.vegetto.recode.domain.Faction;
import com.vegetto.recode.domain.Transaction;
import com.vegetto.recode.domain.Type;
import com.vegetto.recode.domain.dto.ContactDTO;
import com.vegetto.recode.domain.dto.FactionDTO;
import com.vegetto.recode.domain.dto.TransactionDTO;
import com.vegetto.recode.domain.dto.TypeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomMapper {
    CustomMapper INSTANCE = Mappers.getMapper(CustomMapper.class);


    TypeDTO typeToTypeDTO(Type type);

    Type typeDTOToType(TypeDTO typeDTO);

    ContactDTO contactToContactDTO(Contact contact);

    Contact contactDTOToContact(ContactDTO contactDTO);

    FactionDTO factionToFactionDTO(Faction faction);

    Faction factionDTOToFaction(FactionDTO factionDTO);

    TransactionDTO transactionToTransactionDTO(Transaction transaction);

    Transaction transactionDTOToTransaction(TransactionDTO transactionDTO);
}
