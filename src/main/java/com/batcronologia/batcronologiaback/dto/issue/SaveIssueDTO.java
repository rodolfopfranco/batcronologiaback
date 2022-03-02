package com.batcronologia.batcronologiaback.dto.issue;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SaveIssueDTO {
    private Long number;
    private String urlCover;
    private Long volumeId;
    private List<Long> artistsId;
    private List<Long> booksBrId;
}
