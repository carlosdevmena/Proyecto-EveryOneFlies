package com.betek.ms_flies.model;

import com.betek.ms_flies.model.modelEnum.TipoAsiento;
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
@Table(name = "ASIENTOS")
@SequenceGenerator(name = "asientos_seq", sequenceName = "asientos_sequence", allocationSize = 1)
public class Asiento {

    @Id
    @Column(name = "ID_ASIENTO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "asientos_seq")
    private int idAsiento;

    @Column(name = "DISPONIBILIDAD")
    private boolean disponiblidad;

    @Enumerated(EnumType.STRING)
    @Column(name = "TIPO_ASIENTO")
    private TipoAsiento tipoAsiento;
}
