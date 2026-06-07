package sch.uv.mx.modelo.DTO;

import sch.uv.mx.modelo.Estudiante;

public record ComentarioDTO(
    String comentarioId,
    String contenido,
    Integer rating,
    String autorId
) {}
