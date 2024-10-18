package com.betek.ms_flies.repository;

import com.betek.ms_flies.model.Aeropuerto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AeropuestoRepository extends JpaRepository<Aeropuerto, Integer> {
}
