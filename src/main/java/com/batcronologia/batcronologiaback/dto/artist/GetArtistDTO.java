package com.batcronologia.batcronologiaback.dto.artist;

import com.batcronologia.batcronologiaback.dto.issue.GetLvl1IssueDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetArtistDTO {
    private Long id;
    private String name;
    private String role;
    private List<GetLvl1IssueDTO> issues;
}
