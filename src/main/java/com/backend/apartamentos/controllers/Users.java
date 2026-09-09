package com.backend.apartamentos.controllers;

import com.backend.apartamentos.dtos.users.response.PublicCreateUserDTO;
import com.backend.apartamentos.dtos.users.response.PublicUserDTO;
import com.backend.apartamentos.services.UsersServices;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class Users {
    private final UsersServices usersServices;
    public Users(UsersServices usersServices){
        this.usersServices = usersServices;

    }

    @GetMapping("/get")
    public List<PublicUserDTO> get_users(){
        return usersServices.Listar();
    }
    @PostMapping("/create")
    public PublicUserDTO create_user(@RequestBody PublicCreateUserDTO new_User){
        return usersServices.create(new_User);
    }
}
