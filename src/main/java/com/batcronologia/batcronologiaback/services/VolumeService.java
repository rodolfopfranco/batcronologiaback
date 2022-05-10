package com.batcronologia.batcronologiaback.services;

import com.batcronologia.batcronologiaback.entities.Volume;
import com.batcronologia.batcronologiaback.repositories.VolumeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class VolumeService {
    private final VolumeRepository volumeRepository;

    public VolumeService(VolumeRepository volumeRepository) {
        this.volumeRepository = volumeRepository;
    }

    public Volume saveVolume(Volume volume){
        return this.volumeRepository.save(volume);
    }

    public Page<Volume> listVolume(Pageable pageable){
        return this.volumeRepository.findAll(pageable);
    }

    public Volume findByVolume(Long id){
        Optional<Volume> volumeOptional = this.volumeRepository.findById(id);
        return volumeOptional.orElseThrow(() -> new EntityNotFoundException("Volume not found"));
    }

    public Volume updateVolume(Volume volume, Long id){
        Volume volumeFound = this.findByVolume(id);
        volume.setId(id);
        return this.volumeRepository.save(volume);
    }

    public void removeVolume(Long id){
        Volume volumeFound = this.findByVolume(id);
        this.volumeRepository.delete(volumeFound);
    }
}
