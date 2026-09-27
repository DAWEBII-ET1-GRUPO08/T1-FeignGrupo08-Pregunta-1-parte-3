package com.cibertec.T1_FeignGrupo08;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class T1FeignGrupo08Application {

	public static void main(String[] args) {
		SpringApplication.run(T1FeignGrupo08Application.class, args);
	}

}
