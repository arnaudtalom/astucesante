package com.stardev.kmerconcour.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.stardev.kmerconcour.entity.Categorie;
import com.stardev.kmerconcour.entity.Astuce;
@RepositoryRestResource
@CrossOrigin(origins="*")
public interface Asticerepository extends JpaRepository<Astuce, Long>{

	

}
