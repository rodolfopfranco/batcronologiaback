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
    private Long order;
    private Date date;
    private String name;
    private String desc;
    private String urlCover;
    private List<Long> issuesIds;
}
