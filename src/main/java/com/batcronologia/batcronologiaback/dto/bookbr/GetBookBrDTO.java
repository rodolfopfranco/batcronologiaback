package com.batcronologia.batcronologiaback.dto.bookbr;

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
public class GetBookBrDTO {
    private Long id;
    private String nome;
    private String editora;
    private Date data;
    private String urlCover;
    private List<GetLvl1IssueDTO> issues;

}
