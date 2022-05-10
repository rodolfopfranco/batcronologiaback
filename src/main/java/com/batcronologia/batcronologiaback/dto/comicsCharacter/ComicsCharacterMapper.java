package com.batcronologia.batcronologiaback.dto.comicsCharacter;

import com.batcronologia.batcronologiaback.dto.bookchrono.BookChronoMapper;
import com.batcronologia.batcronologiaback.entities.ComicsCharacter;

public class ComicsCharacterMapper {

    public static ComicsCharacter fromDTO(SaveComicsCharacterDTO dto){
        return new ComicsCharacter(
                null,
                dto.getName(),
                dto.getAliases(),
                BookChronoMapper.fromLongListToEntityList(dto.getBookChronoIds())
        );
    }

    public static GetComicsCharacterDTO fromEntity(ComicsCharacter comicsCharacter){
        return new GetComicsCharacterDTO(
                comicsCharacter.getId(),
                comicsCharacter.getName(),
                comicsCharacter.getAliases(),
                BookChronoMapper.fromEntityListToLvl1DTOList(comicsCharacter.getAppearances())
        );
    }

    public static GetLvl1ComicsCharacterDTO fromEntityToLvl1DTO(ComicsCharacter comicsCharacter){
        return new GetLvl1ComicsCharacterDTO(
                comicsCharacter.getId(),
                comicsCharacter.getName(),
                comicsCharacter.getAliases()
        );
    }
}
