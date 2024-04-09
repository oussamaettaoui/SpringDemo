package com.lus.dawm.repository;

import com.lus.dawm.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Utilisateur,Long> {
    List<Utilisateur> findByNomOrPrenom(String nom,String prenom);
    List<Utilisateur> findByNomOrderByPrenomAsc(String nom);

}
