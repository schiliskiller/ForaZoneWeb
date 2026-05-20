package sch.uv.mx.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Institucion extends ObjetoMongo implements Serializable
{
    private static final long serialVersionUID = 1L;
    private int ID_Institucion;
    private String NombreInstitucion;
    private String dominioCorreo;
}
