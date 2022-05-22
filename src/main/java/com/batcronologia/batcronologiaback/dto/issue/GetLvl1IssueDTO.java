package com.batcronologia.batcronologiaback.dto.issue;

import com.batcronologia.batcronologiaback.dto.volume.GetVolumeDTO;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetLvl1IssueDTO {
    private Long id;
    private Long number;
    private String urlCover;
    private GetVolumeDTO volume;
}
