package com.backend.apartamentos.services;

import com.backend.apartamentos.dtos.users.response.PublicCreateUserDTO;
import com.backend.apartamentos.dtos.users.response.PublicUserDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsersServices {
    private List<PublicUserDTO> users= new ArrayList<>(
            List.of(
                    new PublicUserDTO(1,"Jairo",50),
                    new PublicUserDTO(2,"edex",20),
                    new PublicUserDTO(3,"Crida",19),
                    new PublicUserDTO(4,"Kevin",19),
                    new PublicUserDTO(5,"Joel",12)
            )
    );
    public List<PublicUserDTO> Listar(){
        return users;
    }
    private int counter_id = 5;
    public PublicUserDTO create(PublicCreateUserDTO new_User){


        PublicUserDTO new_user = new PublicUserDTO(++counter_id,new_User.name(),new_User.age());
        users.add(new_user);
        return new_user;
    }
}
