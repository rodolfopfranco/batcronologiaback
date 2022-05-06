package com.batcronologia.batcronologiaback.controllers;

import com.batcronologia.batcronologiaback.dto.artist.ArtistMapper;
import com.batcronologia.batcronologiaback.dto.artist.GetArtistDTO;
import com.batcronologia.batcronologiaback.dto.artist.SaveArtistDTO;
import com.batcronologia.batcronologiaback.entities.Artist;
import com.batcronologia.batcronologiaback.services.ArtistService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("{id}")
    public ResponseEntity<GetArtistDTO> findArtist(@PathVariable Long id){
        Artist artist = this.artistService.findyArtist(id);
        return ResponseEntity.ok(ArtistMapper.fromEntity(artist));
    }

    @PostMapping
    public ResponseEntity<GetArtistDTO>  saveArtist(@RequestBody SaveArtistDTO dto){
        Artist artist = this.artistService.saveArtist(ArtistMapper.fromDTO(dto));
        return ResponseEntity.ok(ArtistMapper.fromEntity(artist));
    }

    @PutMapping("{id}")
    public ResponseEntity<GetArtistDTO> updateArtist(@RequestBody SaveArtistDTO dto, @PathVariable Long id){
        try{
            Artist artist = artistService.updateArtist(ArtistMapper.fromDTO(dto), id);
            return ResponseEntity.ok(ArtistMapper.fromEntity(artist));
        } catch (RuntimeException e){
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<GetArtistDTO> removeArtist(@PathVariable Long id){
        try{
            this.artistService.removeArtist(id);
            return ResponseEntity.ok().build();
        } catch (RuntimeException e){
            return ResponseEntity.notFound().build();
        }
    }

}
