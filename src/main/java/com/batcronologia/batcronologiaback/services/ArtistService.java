package com.batcronologia.batcronologiaback.services;

import com.batcronologia.batcronologiaback.entities.Artist;
import com.batcronologia.batcronologiaback.repositories.ArtistRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class ArtistService {

    private final ArtistRepository artistRepository;

    public ArtistService(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    public Artist saveArtist(Artist artist){
        return this.artistRepository.save(artist);
    }

    public Page<Artist> listArtist(Pageable pageable){
        return this.artistRepository.findAll(pageable);
    }

    public Page<Artist> listArtistByIssue(Pageable pageable, Long idIssue){
        return this.artistRepository.findByIssues_Id(idIssue, pageable);
    }

    public Artist findByArtist(Long id){
        Optional<Artist> artistOptional = this.artistRepository.findById(id);
        return artistOptional.orElseThrow(() -> new EntityNotFoundException("Artist not found"));
    }

    public Artist updateArtist(Artist artist, Long id){
        Artist artistFound = this.findByArtist(id);
        artist.setId(id);
        return this.artistRepository.save(artist);
    }

    public void removeArtist(Long id){
        Artist artistFound = this.findByArtist(id);
        this.artistRepository.delete(artistFound);
    }
}
