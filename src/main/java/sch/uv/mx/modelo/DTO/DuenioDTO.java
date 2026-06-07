package sch.uv.mx.modelo.DTO;

import java.time.LocalDate;

public record DuenioDTO(
        String usuarioId,
        String nombreUsuario,
        LocalDate fechaNacimiento,
        String contrEncriptada,
        String nombre,
        String apPat,
        String apMat,
        String correoElectronico,
        Float reputacion
) implements UsuarioDTO {}
