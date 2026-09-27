package com.cibertec.T1_FeignGrupo08.client;

import com.cibertec.T1_FeignGrupo08.dto.FakeUserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="fakeUserClient", url = "https://fakestoreapi.com")
public interface FakeUserClient {

    @GetMapping("/users")
    List<FakeUserDto> getUsers();
}
