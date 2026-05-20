package sch.uv.mx.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Duenio extends Usuario implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String Nombre;
    private String ApPat;
    private String ApMat;
    private String correoElectronico;
    private float reputacion;
}
