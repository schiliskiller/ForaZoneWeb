package sch.uv.mx.modelo;

import org.bson.types.ObjectId;

import java.io.Serializable;

public class Pension extends Vivienda implements Serializable
{
    private static final long serialVersionUID = 1L;
    private boolean incluyeAlimentos;
    private int numeroComidasAlDia;

    public Pension(Direccion dir, Duenio duenio, double precio, String descripcion, double[] geopunto, boolean incluyeAlimentos, int numeroComidasAlDia)
    {
        super(dir, duenio, precio, descripcion, geopunto);
        this.incluyeAlimentos = incluyeAlimentos;
        this.numeroComidasAlDia = numeroComidasAlDia;
    }

    public Pension(ObjectId oid, int ratingTotal, double[] geopunto, String descripcion, double precio, Duenio duenio, Direccion dir, boolean incluyeAlimentos, int numeroComidasAlDia)
    {
        super(oid, ratingTotal, geopunto, descripcion, precio, duenio, dir);
        this.incluyeAlimentos = incluyeAlimentos;
        this.numeroComidasAlDia = numeroComidasAlDia;
    }

    public boolean isIncluyeAlimentos()
    {
        return incluyeAlimentos;
    }

    public void setIncluyeAlimentos(boolean incluyeAlimentos)
    {
        this.incluyeAlimentos = incluyeAlimentos;
    }

    public int getNumeroComidasAlDia()
    {
        return numeroComidasAlDia;
    }

    public void setNumeroComidasAlDia(int numeroComidasAlDia)
    {
        this.numeroComidasAlDia = numeroComidasAlDia;
    }
}
