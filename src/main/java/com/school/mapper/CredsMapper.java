package com.school.mapper;

import com.school.dto.CredsDto;
import com.school.entity.Creds;

public class CredsMapper {
    public static CredsDto mapToCredsDto(Creds creds){
        return new CredsDto(
            creds.getId(),
            creds.getEmail(),
            creds.getPassword(),
            creds.getRole()
        );
    }

    public static Creds maptoCreds(CredsDto credsDto){
        return new Creds(
            credsDto.getId(),
            credsDto.getEmail(),
            credsDto.getPassword(),
            credsDto.getRole()
        );
    }
}
