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
public class Categorie {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idcategorie;
	private String titre;
	private String description;
	private String image;
	@OneToMany(mappedBy="categorie",fetch=FetchType.LAZY)
	private Collection<Astuce> astuces;
	public Collection<Astuce> getCampagnes() {
		return astuces;
	}
}
