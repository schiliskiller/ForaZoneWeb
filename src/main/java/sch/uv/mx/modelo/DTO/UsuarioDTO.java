package sch.uv.mx.modelo.DTO;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import sch.uv.mx.modelo.Duenio;
import sch.uv.mx.modelo.Estudiante;

import java.time.LocalDate;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = EstudianteDTO.class, name = "estudiante"),
        @JsonSubTypes.Type(value = DuenioDTO.class, name = "duenio")
})
public interface UsuarioDTO
{
    String usuarioId();
    String nombreUsuario();
    LocalDate fechaNacimiento();
    String contrEncriptada();
}
