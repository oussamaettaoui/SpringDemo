package com.lus.dawm.model;
import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Produit implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String designation, description;
	private int qte;
	private double prix;
	@ManyToOne
	@JoinColumn(name = "categorie_id")
	private Categorie categorie;
	@OneToMany(mappedBy = "produit")
	private List<LigneCommade> ligneCommades;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	public List<LigneCommade> getLigneCommades() {
		return ligneCommades;
	}

	public void setLigneCommades(List<LigneCommade> ligneCommades) {
		this.ligneCommades = ligneCommades;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

}
