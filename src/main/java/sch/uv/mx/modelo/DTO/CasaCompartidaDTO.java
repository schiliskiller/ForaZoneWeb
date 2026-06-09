package sch.uv.mx.modelo.DTO;

import sch.uv.mx.modelo.Direccion;

public record CasaCompartidaDTO(
        Integer ratingTotal,
        Double[] geopunto,
        String descripcion,
        Double precio,
        String duenioId,
        Direccion direccion,
        String type,
        Integer numeroPisos,
        Boolean tienePatio
) implements ViviendaDTO {}
