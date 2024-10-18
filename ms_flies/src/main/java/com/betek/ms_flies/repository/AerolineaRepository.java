package com.betek.ms_flies.repository;

import com.betek.ms_flies.model.Aerolinea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AerolineaRepository extends JpaRepository<Aerolinea, Integer> {

    Optional<Aerolinea> findByNombre(String nombre);

    List<Aerolinea> findAll();

}
