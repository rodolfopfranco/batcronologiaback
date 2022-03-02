package com.batcronologia.batcronologiaback.dto.bookbr;

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
public class SaveBookBrDTO {
    private String nome;
    private String editora;
    private Date data;
    private String urlCover;
    private List<Long> issueIds;
}
