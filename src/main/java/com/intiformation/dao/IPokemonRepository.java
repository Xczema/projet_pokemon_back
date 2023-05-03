package com.intiformation.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intiformation.modele.Pokemon;

public interface IPokemonRepository extends JpaRepository<Pokemon, Long> {

}
