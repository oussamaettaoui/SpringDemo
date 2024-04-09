package com.lus.dawm.controller;

import com.lus.dawm.dto.UserDTO;
import com.lus.dawm.mapper.UserMapper;
import com.lus.dawm.model.Utilisateur;
import com.lus.dawm.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService){
        this.userService = userService;
    }
    @PostMapping
    public void addUser(@RequestBody UserDTO userDTO) {
        Utilisateur utilisateur = UserMapper.toEntity(userDTO);
        userService.addUser(utilisateur);
    }
    @PutMapping("/{id}")
    public Utilisateur updateUser(@PathVariable("id") Long id,@RequestBody Utilisateur utilisateur){
        return userService.updateUser(id,utilisateur);
    }
    @GetMapping("/{id}")
    public UserDTO getUserById(@PathVariable("id") Long id){
        Optional<Utilisateur> user = userService.getUserById(id);
        return UserMapper.toDTO(user);
    }
    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable Long id){
        userService.deleteUserById(id);
    }
    @GetMapping
    public List<UserDTO> getAllUsers(){
        List<Utilisateur> users = userService.getAllUsers();
        return users.stream().map(UserMapper::toDTO).toList();
    }
}
