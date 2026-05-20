package sch.uv.mx.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Estudiante extends Usuario implements Serializable
{
    private static final long serialVersionUID = 1L;
    transient Image CredEstudiantil;
    transient Image CredElector;
    private String correoInstitucional;
    private Institucion inst;
}
