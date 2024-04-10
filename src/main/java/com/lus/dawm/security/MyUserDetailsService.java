package com.lus.dawm.security;

import com.lus.dawm.model.Utilisateur;
import com.lus.dawm.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class MyUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;
    public MyUserDetailsService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Utilisateur> utilsateur = Optional.ofNullable(userRepository.findByUsername(username));
        return null;
    }
}
