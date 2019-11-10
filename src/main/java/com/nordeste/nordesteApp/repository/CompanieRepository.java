package com.nordeste.nordesteApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nordeste.nordesteApp.model.Companie;

@Repository
public interface CompanieRepository extends JpaRepository<Companie, Long> {

}
