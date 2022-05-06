package com.batcronologia.batcronologiaback.dto.bookchrono;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetLvl1BookChronoDTO {
    private Long id;
    private Long orderNumber;
    private Date datePublish;
    private String name;
    private String desccription;
    private String urlCover;
}
