package com.batcronologia.batcronologiaback.dto.bookchrono;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SaveBookChronoDTO {
    private Long orderNumber;
    private Date datePublish;
    private String name;
    private String description;
    private String urlCover;
    private List<Long> issuesIds;
}
