package sch.uv.mx.modelo.DTO;

import sch.uv.mx.modelo.Institucion;
import sch.uv.mx.modelo.ListaDeseos;

import java.time.LocalDate;

public record EstudianteDTO(
        String usuarioId,
        String nombreUsuario,
        LocalDate fechaNacimiento,
        String contrEncriptada,
        String token,
        String correoInstitucional,
        String institucionId,
        ListaDeseos lista
) implements UsuarioDTO {}
