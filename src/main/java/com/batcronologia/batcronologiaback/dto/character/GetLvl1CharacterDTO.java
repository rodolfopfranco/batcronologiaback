package com.batcronologia.batcronologiaback.dto.character;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetLvl1CharacterDTO {
    private Long id;
    private String name;
    private String aliases;
}
