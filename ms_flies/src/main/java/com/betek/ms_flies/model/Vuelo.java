package com.betek.ms_flies.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "VUELOS")
@SequenceGenerator(name = "vuelo_seq", sequenceName = "vuelo_sequence", allocationSize = 50)
public class Vuelo {

    @Id
    @Column(name = "ID_VUELO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vueloseq")
    private Long idVuelo;

    @Column(name = "CODIGO")
    private String codigo;

    @ManyToOne
    @JoinColumn(name = "ID_AEROLINEA")
    private Aerolinea aerolinea;

    @OneToOne
    @JoinColumn(name = "ID_AEROPUERTO")
    private Aeropuerto Origen;

    @OneToOne
    @JoinColumn(name = "ID_AEROPUERTO")
    private Aeropuerto Destino;

    @Column(name = "FECHA_SALIDA")
    private LocalDateTime fechaSalida;

    @Column(name = "FECHA_LLEGADA")
    private LocalDateTime fechaLlegada;

    @Column(name = "PRECIO_BASE")
    private double precioBase;

    @OneToOne
    @JoinColumn(name = "ID_ASIENTO_POR_VUELO")
    private AsientosPorVuelo asientosPorVuelo;

}
