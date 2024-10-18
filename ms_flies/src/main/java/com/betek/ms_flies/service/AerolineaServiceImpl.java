package com.betek.ms_flies.service;

import com.betek.ms_flies.dto.DeleteResponse;
import com.betek.ms_flies.exception.ResourceNotFoundException;
import com.betek.ms_flies.model.Aerolinea;
import com.betek.ms_flies.repository.AerolineaRepository;
import com.betek.ms_flies.service.serviceInterface.AerolineService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class AerolineaServiceImpl implements AerolineService {

    @Autowired
    private final AerolineaRepository repository;

    @Override
    public Aerolinea createAerolinea(Aerolinea aerolinea) {
        return repository.save(aerolinea);
    }

    @Override
    public <T> DeleteResponse<T> deleteById(Aerolinea aerolinea) {

        Aerolinea object = repository.findById(aerolinea.getIdAerolinea())
                            .orElseThrow(() -> new ResourceNotFoundException(
                            aerolinea.getClass().getSimpleName() + " con ID " +
                            aerolinea.getIdAerolinea() + " no encontrado"));

        repository.delete(aerolinea);

        return new DeleteResponse<>(object.getClass().getSimpleName(), object.getNombre());
    }

    @Override
    @Transactional
    public Aerolinea updateAerolinea(Aerolinea aerolinea) {
        Aerolinea aerolineaEncontrada = repository.findById(aerolinea.getIdAerolinea())
                                        .orElseThrow(()-> new ResourceNotFoundException(
                                        "Aerolinea con ID " + aerolinea.getIdAerolinea() + " no encontrada."));

        aerolineaEncontrada.setNombre(aerolinea.getNombre());
        aerolineaEncontrada.setSiglas(aerolinea.getSiglas());

        repository.save(aerolineaEncontrada);

        return aerolineaEncontrada;
    }

    @Override
    public List<Aerolinea> getAerolineas() {
        return repository.findAll();
    }

    @Override
    public Aerolinea getAerolineaByName(String name) {
        return repository.findByNombre(name)
                .orElseThrow(()-> new ResourceNotFoundException(
                        "Aerolinea por nombre " + name + " no encontrada."));
    }
}

