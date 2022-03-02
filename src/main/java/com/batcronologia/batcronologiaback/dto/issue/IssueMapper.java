package com.batcronologia.batcronologiaback.dto.issue;

import com.batcronologia.batcronologiaback.dto.artist.ArtistMapper;
import com.batcronologia.batcronologiaback.dto.volume.VolumeMapper;
import com.batcronologia.batcronologiaback.entities.Artist;
import com.batcronologia.batcronologiaback.entities.BookBr;
import com.batcronologia.batcronologiaback.entities.Issue;
import com.batcronologia.batcronologiaback.entities.Volume;

import java.util.ArrayList;
import java.util.List;

public class IssueMapper {

    public static Issue fromDTO(SaveIssueDTO dto){
        return new Issue(
                null,
                dto.getNumber(),
                dto.getUrlCover(),
                new Volume(dto.getVolumeId()),
                IssueMapper.fromIdArtistList(dto.getArtistsId()),
                IssueMapper.fromIdBookBrList(dto.getBooksBrId())
        );
    }

    public static GetIssueDTO fromEntity(Issue issue){
        return new GetIssueDTO(
                issue.getId(),
                issue.getNumber(),
                issue.getUrlCover(),
                VolumeMapper.fromEntity(issue.getVolume()),
                ArtistMapper.fromEntityListToLvl1DtoList(issue.getArtists())
        );
    }

    public static GetLvl1IssueDTO fromEntityToLvl1(Issue issue){
        return new GetLvl1IssueDTO(
                issue.getId(),
                issue.getNumber(),
                issue.getUrlCover(),
                VolumeMapper.fromEntity(issue.getVolume())
        );
    }

    private static List<Artist> fromIdArtistList(List<Long> idsArtist){
        ArrayList<Artist> artists = new ArrayList<>();
        if (idsArtist.size()>0)
            for (Long idArtist : idsArtist)
                artists.add(new Artist(idArtist));
        return artists;
    }

    private static List<BookBr> fromIdBookBrList(List<Long> idsBookBr){
        ArrayList<BookBr> booksBr = new ArrayList<>();
        if (idsBookBr.size()>0)
            for (Long idBookBr : idsBookBr)
                booksBr.add(new BookBr(idBookBr));
        return booksBr;
    }

    public static List<GetLvl1IssueDTO> fromEntityListToLvl1DtoList(List<Issue> issues){
        List<GetLvl1IssueDTO> issuesDTO = new ArrayList<>();
        for (Issue issue : issues)
            issuesDTO.add(IssueMapper.fromEntityToLvl1(issue));
        return issuesDTO;
    }

    public static List<Issue> fromLongListToEntityList(List<Long> ids){
        List<Issue> issues = new ArrayList<>();
        for (Long id: ids){
            issues.add(new Issue(id));
        }
        return issues;
    }
}
