package sch.uv.mx.modelo;

import org.bson.types.ObjectId;

import java.io.Serializable;

public class CasaCompartida extends Vivienda implements Serializable
{
    private static final long serialVersionUID = 1L;
    private int numeroPisos;
    private boolean tienePatio;

    public CasaCompartida(ObjectId oid, int ratingTotal, double[] geopunto, String descripcion, double precio, Duenio duenio, Direccion dir, int numeroPisos, boolean tienePatio)
    {
        super(oid, ratingTotal, geopunto, descripcion, precio, duenio, dir);
        this.numeroPisos = numeroPisos;
        this.tienePatio = tienePatio;
    }

    public CasaCompartida(int ratingTotal, double[] geopunto, String descripcion, double precio, Duenio duenio, Direccion dir, int numeroPisos, boolean tienePatio)
    {
        super(ratingTotal, geopunto, descripcion, precio, duenio, dir);
        this.numeroPisos = numeroPisos;
        this.tienePatio = tienePatio;
    }

    public int getNumeroPisos()
    {
        return numeroPisos;
    }

    public void setNumeroPisos(int numeroPisos)
    {
        this.numeroPisos = numeroPisos;
    }

    public boolean isTienePatio()
    {
        return tienePatio;
    }

    public void setTienePatio(boolean tienePatio)
    {
        this.tienePatio = tienePatio;
    }
}
