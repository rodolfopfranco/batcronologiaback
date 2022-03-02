package com.batcronologia.batcronologiaback.dto.artist;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SaveArtistDTO {
    private String name;
    private String role;
    private List<Long> issuesId;
}
