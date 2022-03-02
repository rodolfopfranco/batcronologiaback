package com.batcronologia.batcronologiaback.controllers;

import com.batcronologia.batcronologiaback.dto.artist.ArtistMapper;
import com.batcronologia.batcronologiaback.dto.artist.GetArtistDTO;
import com.batcronologia.batcronologiaback.services.ArtistService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/artists")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ArtistController {

    private final ArtistService artistService;

    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @GetMapping
    public ResponseEntity<Page<GetArtistDTO>> findAllArtists(@PageableDefault Pageable pageable){
        return ResponseEntity.ok(
                this.artistService.listArtist(pageable)
                        .map(ArtistMapper::fromEntity)
        );
    }
}
