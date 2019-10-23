package com.stardev.kmerconcour.entity;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Astuce {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idastuce;
	private String titre;
	private String description;
	private String image;
	private String contenue;
	
	@ManyToOne
	private Categorie categorie;
	public Categorie getCategorie() {
		return categorie;
	}
}
