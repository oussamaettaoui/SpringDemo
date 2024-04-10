package com.lus.dawm.model;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@DiscriminatorColumn(name = "ROLE")
public class Utilisateur implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected long id;
	protected String nom, prenom, username, password;
	@Column(name = "ROLE" ,insertable = false,updatable = false)
	protected String role;


}
