package com.batcronologia.batcronologiaback.dto.character;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SaveCharacterDTO {
    private String name;
    private String aliases;
    private List<Long> bookChronoIds;
}
