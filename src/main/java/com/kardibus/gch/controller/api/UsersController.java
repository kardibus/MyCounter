package com.kardibus.gch.controller.api;

import com.kardibus.gch.domain.Users;
import com.kardibus.gch.repository.UsersRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@RestController
@RequestMapping("api/users/")
public class UsersController {

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping()
    public Map<String,List<Users>> getAllUsers() {
        Map<String,List<Users>> map=new HashMap<>();
        map.put("users",usersRepository.findAll());
        return map;
    }

    @PostMapping()
    public void addUser(@RequestBody Users users){
        usersRepository.save(users);
    }

    @DeleteMapping()
    public void deleteUser(@RequestBody Users users){
        usersRepository.deleteById(users.getId());
    }

    @PutMapping
    public void updateUser(@RequestBody Users users){
        Users user = usersRepository.getById(users.getId());
        user.setActive(users.getActive());
        user.setEmail(users.getEmail());
        user.setName(users.getName());
        user.setLastActive(users.getLastActive());
        user.setRegistrationDate(users.getRegistrationDate());
        user.setSurname(users.getSurname());
        user.setSubscribe(users.getSubscribe());
        usersRepository.save(user);
    }
}
