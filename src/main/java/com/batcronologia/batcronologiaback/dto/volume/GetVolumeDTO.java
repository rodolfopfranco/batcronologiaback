package com.batcronologia.batcronologiaback.dto.volume;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetVolumeDTO {
    private Long id;
    private String name;
}
