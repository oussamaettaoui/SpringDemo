package com.lus.dawm.mapper;

import com.lus.dawm.dto.UserDTO;
import com.lus.dawm.model.Utilisateur;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserMapper {
    public static UserDTO toDTO(Utilisateur utilisateur){
        UserDTO userDTO = new UserDTO();
        userDTO.setId(utilisateur.getId());
        userDTO.setPrenom(utilisateur.getPrenom());
        userDTO.setNom(utilisateur.getPrenom());
        return userDTO;
    }
    public static Utilisateur toEntity(UserDTO userDTO){
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setId(userDTO.getId());
        utilisateur.setNom(userDTO.getNom());
        utilisateur.setPrenom(userDTO.getPrenom());
        return utilisateur;

    }
}
