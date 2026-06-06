package sch.uv.mx.modelo;

import org.bson.types.ObjectId;

import java.io.Serializable;

public class ListaDeseos implements Serializable
{
    private static final long serialVersionUID = 1L;
    private Estudiante estudiante;
    private Vivienda viviendaBuscada;

    public ListaDeseos(Estudiante estudiante, Vivienda viviendaBuscada)
    {
        this.estudiante = estudiante;
        this.viviendaBuscada = viviendaBuscada;
    }

    public Estudiante getEstudiante()
    {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante)
    {
        this.estudiante = estudiante;
    }

    public Vivienda getViviendaBuscada()
    {
        return viviendaBuscada;
    }

    public void setViviendaBuscada(Vivienda viviendaBuscada)
    {
        this.viviendaBuscada = viviendaBuscada;
    }
}
