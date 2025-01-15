package com.school.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.dto.CredsDto;
import com.school.entity.Creds;
import com.school.mapper.CredsMapper;
import com.school.repository.CredsRepository;
import com.school.service.CredsServicee;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@AllArgsConstructor
@NoArgsConstructor

public class CredsServiceImpl implements CredsServicee {

    @Autowired
    private CredsRepository credsRepository;

    @Override
    public CredsDto createCred(CredsDto credsDto){
        Creds creds=CredsMapper.maptoCreds(credsDto);
        Creds savedCred=this.credsRepository.save(creds);

        CredsDto x=CredsMapper.mapToCredsDto(savedCred);
        return x;
    }

    public CredsDto getCreds(String email){
        Creds c=credsRepository.findByEmail(email);
        return CredsMapper.mapToCredsDto(c);
    }
}
