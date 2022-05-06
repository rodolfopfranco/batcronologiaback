package com.batcronologia.batcronologiaback.dto.bookchrono;

import com.batcronologia.batcronologiaback.dto.issue.GetLvl1IssueDTO;
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
public class GetBookChronoDTO {
    private Long id;
    private Long order;
    private Date date;
    private String name;
    private String description;
    private String urlCover;
    private List<GetLvl1IssueDTO> issues;
}
