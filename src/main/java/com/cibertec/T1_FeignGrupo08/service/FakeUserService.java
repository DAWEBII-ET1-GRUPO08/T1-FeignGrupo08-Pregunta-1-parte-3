package com.cibertec.T1_FeignGrupo08.service;

import com.cibertec.T1_FeignGrupo08.client.FakeUserClient;
import com.cibertec.T1_FeignGrupo08.dto.FakeUserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FakeUserService {

    @Autowired
    private FakeUserClient fakeUserClient;

    public List<FakeUserDto> getFilteredUsers() {
        List<FakeUserDto> users = fakeUserClient.getUsers();

        return users.stream()
                .filter(user -> user.getId() % 2 == 0)                 // id par
                .filter(user -> user.getUsername().length() > 6)       // username > 6 caracteres
                .collect(Collectors.toList());
    }

}
