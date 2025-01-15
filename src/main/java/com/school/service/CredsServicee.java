package com.school.service;

import com.school.dto.CredsDto;

public interface CredsServicee {
    CredsDto createCred(CredsDto credsDto);
    CredsDto getCreds(String email);
}
