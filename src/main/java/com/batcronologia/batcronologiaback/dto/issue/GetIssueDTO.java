package com.batcronologia.batcronologiaback.dto.issue;

import com.batcronologia.batcronologiaback.dto.artist.GetLvl1ArtistDTO;
import com.batcronologia.batcronologiaback.dto.volume.GetVolumeDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetIssueDTO {
    private Long id;
    private Long number;
    private String urlCover;
    private GetVolumeDTO volume;
    private List<GetLvl1ArtistDTO> artists;
}
