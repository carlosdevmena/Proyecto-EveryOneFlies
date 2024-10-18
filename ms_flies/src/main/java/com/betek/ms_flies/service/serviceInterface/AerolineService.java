package com.betek.ms_flies.service.serviceInterface;

import com.betek.ms_flies.dto.DeleteResponse;
import com.betek.ms_flies.model.Aerolinea;

import java.util.List;

public interface AerolineService {

    Aerolinea createAerolinea(Aerolinea aerolinea);

    <T> DeleteResponse<T> deleteById(Aerolinea aerolinea);

    Aerolinea updateAerolinea(Aerolinea aerolinea);

    List<Aerolinea> getAerolineas();

    Aerolinea getAerolineaByName(String name);
}
