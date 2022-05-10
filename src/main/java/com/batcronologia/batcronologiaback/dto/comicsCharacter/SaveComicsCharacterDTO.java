package com.batcronologia.batcronologiaback.dto.comicsCharacter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SaveComicsCharacterDTO {
    private String name;
    private String aliases;
    private List<Long> bookChronoIds;
}
