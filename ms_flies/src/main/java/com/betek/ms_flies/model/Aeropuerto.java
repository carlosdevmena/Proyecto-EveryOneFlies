package com.betek.ms_flies.model;

import com.betek.ms_flies.model.modelEnum.Ciudades;
import com.betek.ms_flies.model.modelEnum.Pais;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "AEROPUERTOS")
@SequenceGenerator(name = "aeropueto_seq", sequenceName = "aeropuerto_sequence", allocationSize = 1)
public class Aeropuerto {

    @Id
    @Column(name = "ID_AEROPUERTO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aeropueto_seq")
    private int idAeropuerto;

    @Column(name = "CODIGO_ATA")
    private String codigoATA;

    @Column(name = "NOMBRE_AEROPUERTO")
    private String nombreAeropuerto;

    @Enumerated(EnumType.STRING)
    @Column(name = "CIUDAD")
    private Ciudades ciudad;

    @Enumerated(EnumType.STRING)
    @Column(name = "PAIS")
    private Pais pais;
}
