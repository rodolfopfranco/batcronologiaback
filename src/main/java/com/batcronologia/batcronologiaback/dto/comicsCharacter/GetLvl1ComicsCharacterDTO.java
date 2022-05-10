package com.batcronologia.batcronologiaback.dto.comicsCharacter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetLvl1ComicsCharacterDTO {
    private Long id;
    private String name;
    private String aliases;
}
