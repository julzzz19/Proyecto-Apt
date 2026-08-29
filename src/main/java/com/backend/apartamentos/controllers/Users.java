package com.backend.apartamentos.controllers;

import com.backend.apartamentos.dtos.users.response.PublicUserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class Users {
    @GetMapping("/get")
    public PublicUserDTO get_users(){
        return new PublicUserDTO(1L,"Julian",40);
    }
}
