package com.batcronologia.batcronologiaback.dto.issue;

import com.batcronologia.batcronologiaback.dto.volume.GetVolumeDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetLvl1IssueDTO {
    private Long id;
    private Long number;
    private String urlCover;
    private GetVolumeDTO volume;
}
