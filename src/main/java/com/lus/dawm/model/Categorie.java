package com.lus.dawm.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Categorie implements Serializable {
	private static final long serialVersionUID = 1L;
    //
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String designation;
	private String description;
	@OneToMany(mappedBy = "categorie")
	private List<Produit> produits;

	private Categorie parenCategorie;

	private List<Categorie> subCategories;

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

	public Categorie getParenCategorie() {
		return parenCategorie;
	}

	public void setParenCategorie(Categorie parenCategorie) {
		this.parenCategorie = parenCategorie;
	}

	public List<Categorie> getSubCategories() {
		return subCategories;
	}

	public void setSubCategories(List<Categorie> subCategories) {
		this.subCategories = subCategories;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

}
