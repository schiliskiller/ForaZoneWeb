package sch.uv.mx.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Direccion extends ObjetoMongo implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String Calle;
    private String NumExt;
    private String NumInt;
    private int CodigoPostal;
    private String Colonia;
}
