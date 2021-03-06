package com.batcronologia.batcronologiaback.dto.comicsCharacter;

import com.batcronologia.batcronologiaback.dto.bookchrono.GetLvl1BookChronoDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetComicsCharacterDTO {
    private Long id;
    private String name;
    private String aliases;
    private List<GetLvl1BookChronoDTO> appearances;
}
