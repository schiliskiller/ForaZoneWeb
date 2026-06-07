package sch.uv.mx.modelo.DTO;

import sch.uv.mx.modelo.Direccion;

public record DepartamentoDTO(
        Integer ratingTotal,
        Double[] geopunto,
        String descripcion,
        Double precio,
        String duenioId,
        Direccion direccion,
        Integer numeroHabitaciones,
        Double cuotaMantenimiento
) implements ViviendaDTO {}
