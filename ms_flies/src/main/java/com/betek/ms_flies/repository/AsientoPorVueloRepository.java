package com.betek.ms_flies.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.betek.ms_flies.model.AsientosPorVuelo;
import org.springframework.stereotype.Repository;

@Repository
public interface AsientoPorVueloRepository extends JpaRepository<AsientosPorVuelo, Integer> {
}
