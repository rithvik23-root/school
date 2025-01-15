package com.school.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.dto.CredsDto;
import com.school.service.CredsServicee;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@AllArgsConstructor
@RestController
@RequestMapping("/api/creds")
public class CredsController {
    
    
    private CredsServicee credsService;

    @PostMapping
    public ResponseEntity<CredsDto> createCred(@RequestBody CredsDto credsDto) {
        CredsDto s=credsService.createCred(credsDto);
        return new ResponseEntity<>(s,HttpStatus.CREATED);
    }

    @GetMapping("{email}")
    public ResponseEntity<CredsDto> getCreds(@PathVariable("email") String email) {
        CredsDto s=credsService.getCreds(email);
        return new ResponseEntity<>(s,HttpStatus.OK);
    }
 
}
