package sch.uv.mx.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vivienda extends ObjetoMongo implements Serializable
{
    private static final long serialVersionUID = 1L;
    private int ID_Vivienda;
    private int ratingTotal;
    private double[] geopunto;
    private String descripcion;
    private double precio;
    private Duenio duenio;
    private Direccion dir;
}
