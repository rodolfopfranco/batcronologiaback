package com.batcronologia.batcronologiaback.dto.volume;

import com.batcronologia.batcronologiaback.entities.Volume;

public class VolumeMapper {

    public static Volume fromDTO(SaveVolumeDTO dto){
        return new Volume(
                null,
                dto.getName()
        );
    }

    public static GetVolumeDTO fromEntity(Volume volume){
        return new GetVolumeDTO(
                volume.getId(),
                volume.getName()
        );
    }
}
