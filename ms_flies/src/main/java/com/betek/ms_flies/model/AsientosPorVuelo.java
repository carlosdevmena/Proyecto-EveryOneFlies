package com.betek.ms_flies.model;

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
@Table(name = "ASIENTOS_POR_VUELOS")
@SequenceGenerator(name = "asientos_seq", sequenceName = "asientos_sequence", allocationSize = 50)
public class AsientosPorVuelo {

    @Id
    @Column(name = "ID_ASIENTO_POR_VUELO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "asientos_seq")
    private int idAsientoPorVuelo;

    @Column(name = "ECONOMICOS")
    private int contadorEconomicos;

    @Column(name = "ECONOMICOS_PREMIUN")
    private int contadorEconomicosPremiun;

    @Column(name = "BUSINESS")
    private int contadorBusiness;

    @Column(name = "PRIMERA_CLASE")
    private int contadorPrimeraClase;

    @OneToOne(mappedBy = "asientosPorVuelo")
    private Vuelo vuelo;
}
