package com.batcronologia.batcronologiaback.dto.character;

import com.batcronologia.batcronologiaback.dto.bookchrono.BookChronoMapper;
import com.batcronologia.batcronologiaback.entities.Character;

public class CharacterMapper {

    public static Character fromDTO(SaveCharacterDTO dto){
        return new Character(
                null,
                dto.getName(),
                dto.getAliases(),
                BookChronoMapper.fromLongListToEntityList(dto.getBookChronoIds())
        );
    }

    public static GetCharacterDTO fromEntity(Character character){
        return new GetCharacterDTO(
                character.getId(),
                character.getName(),
                character.getAliases(),
                BookChronoMapper.fromEntityListToLvl1DTOList(character.getAppearances())
        );
    }

    public static GetLvl1CharacterDTO fromEntityToLvl1DTO(Character character){
        return new GetLvl1CharacterDTO(
                character.getId(),
                character.getName(),
                character.getAliases()
        );
    }
}
