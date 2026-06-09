package sch.uv.mx.modelo.DTO;

import sch.uv.mx.modelo.Direccion;

public record PensionDTO(
        Integer ratingTotal,
        Double[] geopunto,
        String descripcion,
        Double precio,
        String duenioId,
        Direccion direccion,
        String type,
        Boolean incluyeAlimentos,
        Integer numeroComidasAlDia
) implements ViviendaDTO {}
