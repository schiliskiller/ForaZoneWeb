package sch.uv.mx.modelo;

import org.bson.types.ObjectId;

import java.io.Serializable;

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

    public Vivienda(int ratingTotal, double[] geopunto, String descripcion, double precio, Duenio duenio, Direccion dir)
    {
        this.ratingTotal = ratingTotal;
        this.geopunto = geopunto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.duenio = duenio;
        this.dir = dir;
    }

    public Vivienda(ObjectId oid, int ratingTotal, double[] geopunto, String descripcion, double precio, Duenio duenio, Direccion dir)
    {
        super(oid);
        this.ratingTotal = ratingTotal;
        this.geopunto = geopunto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.duenio = duenio;
        this.dir = dir;
    }

    public Vivienda(Direccion dir, Duenio duenio, double precio, String descripcion, double[] geopunto)
    {
        this.dir = dir;
        this.duenio = duenio;
        this.precio = precio;
        this.descripcion = descripcion;
        this.geopunto = geopunto;
    }

    public Vivienda(ObjectId oid, double[] geopunto, String descripcion, double precio, Duenio duenio, Direccion dir)
    {
        super(oid);
        this.geopunto = geopunto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.duenio = duenio;
        this.dir = dir;
    }

    public int getID_Vivienda()
    {
        return ID_Vivienda;
    }

    public int getRatingTotal()
    {
        return ratingTotal;
    }

    public void setRatingTotal(int ratingTotal)
    {
        this.ratingTotal = ratingTotal;
    }

    public double[] getGeopunto()
    {
        return geopunto;
    }

    public void setGeopunto(double[] geopunto)
    {
        this.geopunto = geopunto;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }

    public double getPrecio()
    {
        return precio;
    }

    public void setPrecio(double precio)
    {
        this.precio = precio;
    }

    public Duenio getDuenio()
    {
        return duenio;
    }

    public void setDuenio(Duenio duenio)
    {
        this.duenio = duenio;
    }

    public Direccion getDir()
    {
        return dir;
    }

    public void setDir(Direccion dir)
    {
        this.dir = dir;
    }

}
