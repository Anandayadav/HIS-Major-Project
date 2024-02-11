package com.Project.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Project.entity.Citizenreg;

@Repository
public interface Citizenrepo extends JpaRepository<Citizenreg, Integer>{

	public Citizenreg findByEmail(String email);
	
	public boolean findByEmailAndPassword(String email,String password);
}