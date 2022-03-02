package com.batcronologia.batcronologiaback.dto.artist;

import com.batcronologia.batcronologiaback.dto.issue.IssueMapper;
import com.batcronologia.batcronologiaback.entities.Artist;

import java.util.ArrayList;
import java.util.List;

public class ArtistMapper {
    public static Artist fromDTO(SaveArtistDTO dto){
        return new Artist(
                null,
                dto.getName(),
                dto.getRole(),
                IssueMapper.fromLongListToEntityList(dto.getIssuesId())
        );
    }

    public static GetArtistDTO fromEntity(Artist artist){
        return new GetArtistDTO(
                artist.getId(),
                artist.getName(),
                artist.getRole(),
                IssueMapper.fromEntityListToLvl1DtoList(artist.getIssues())
        );
    }

    public static GetLvl1ArtistDTO fromEntityToLvl1(Artist artist){
        return new GetLvl1ArtistDTO(
                artist.getId(),
                artist.getName(),
                artist.getRole()
        );
    }

    public static List<GetLvl1ArtistDTO> fromEntityListToLvl1DtoList(List<Artist> artists){
        List<GetLvl1ArtistDTO> artistsDTO = new ArrayList<>();
        for (Artist artist: artists) {
            artistsDTO.add(ArtistMapper.fromEntityToLvl1(artist));
        }
        return artistsDTO;
    }
}
