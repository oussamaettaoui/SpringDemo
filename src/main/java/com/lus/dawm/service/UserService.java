package com.lus.dawm.service;

import com.lus.dawm.model.Utilisateur;
import com.lus.dawm.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public Utilisateur addUser(Utilisateur user){
        return userRepository.save(user);
    }
    public List<Utilisateur> getAllUsers(){
        return userRepository.findAll();
    }
    public Utilisateur updateUser(Long id, Utilisateur updateUser){
        Utilisateur utilisateur = userRepository.findById(id).orElse(null);
        if(utilisateur != null){
            utilisateur.setNom(updateUser.getNom());
            utilisateur.setPrenom(updateUser.getPrenom());
            utilisateur.setUsername(updateUser.getUsername());
            return userRepository.save(utilisateur);
        }
        return null;
    }
    public Optional<Utilisateur> getUserById(Long id){
        return userRepository.findById(id);
    }
    public void deleteUserById(Long id){
        if(userRepository.existsById(id)){
            userRepository.deleteById(id);
        }
    }
    public Utilisateur findByUsername(String username){
        return userRepository.findByUsername(username);
    }
}
