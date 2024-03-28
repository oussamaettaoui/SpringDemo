package com.lus.dawm.model;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
@Entity
public class Client extends Utilisateur implements Serializable{

	private static final long serialVersionUID = 1L;
	private String adresse;
	private Date dateNaissance;
	
	
	private Panier panier;
	
	private List<Commande> commandes;
	
	

	public Panier getPanier() {
		return panier;
	}

	public void setPanier(Panier panier) {
		this.panier = panier;
	}

	public List<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}


	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

}
