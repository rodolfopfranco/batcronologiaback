package com.batcronologia.batcronologiaback.controllers;

import com.batcronologia.batcronologiaback.dto.volume.GetVolumeDTO;
import com.batcronologia.batcronologiaback.dto.volume.SaveVolumeDTO;
import com.batcronologia.batcronologiaback.dto.volume.VolumeMapper;
import com.batcronologia.batcronologiaback.entities.Volume;
import com.batcronologia.batcronologiaback.services.VolumeService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/volumes")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class VolumeController {

    private final VolumeService volumeService;

    public VolumeController(VolumeService volumeService) {
        this.volumeService = volumeService;
    }

    @GetMapping
    public ResponseEntity<Page<GetVolumeDTO>> findAllVolumes(@PageableDefault Pageable pageable){
        return ResponseEntity.ok(
                this.volumeService.listVolume(pageable)
                        .map(VolumeMapper::fromEntity)
        );
    }

    @GetMapping("{id}")
    public ResponseEntity<GetVolumeDTO> findVolume(@PathVariable Long id){
        Volume volume = this.volumeService.findyVolume(id);
        return ResponseEntity.ok(VolumeMapper.fromEntity(volume));
    }

    @PostMapping
    public ResponseEntity<GetVolumeDTO>  saveVolume(@RequestBody SaveVolumeDTO dto){
        Volume volume = this.volumeService.saveVolume(VolumeMapper.fromDTO(dto));
        return ResponseEntity.ok(VolumeMapper.fromEntity(volume));
    }

    @PutMapping("{id}")
    public ResponseEntity<GetVolumeDTO> updateVolume(@RequestBody SaveVolumeDTO dto, @PathVariable Long id){
        try{
            Volume volume = volumeService.updateVolume(VolumeMapper.fromDTO(dto), id);
            return ResponseEntity.ok(VolumeMapper.fromEntity(volume));
        } catch (RuntimeException e){
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<GetVolumeDTO> removeVolume(@PathVariable Long id){
        try{
            this.volumeService.removeVolume(id);
            return ResponseEntity.ok().build();
        } catch (RuntimeException e){
            return ResponseEntity.notFound().build();
        }
    }
}
