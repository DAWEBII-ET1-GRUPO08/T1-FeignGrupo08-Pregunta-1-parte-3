package com.cibertec.T1_FeignGrupo08.controller;

import com.cibertec.T1_FeignGrupo08.dto.FakeUserDto;
import com.cibertec.T1_FeignGrupo08.service.FakeUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FakeUserController {

    @Autowired
    private FakeUserService fakeUserService;

    @GetMapping("/api/fake-users/filtered")
    public List<FakeUserDto> getFilteredUsers() {
        return fakeUserService.getFilteredUsers();
    }

}
