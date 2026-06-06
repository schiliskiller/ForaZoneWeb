package sch.uv.mx.modelo;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Document(collection = "viviendas")
@TypeAlias("casa_compartida")
public class CasaCompartida extends Vivienda implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Field("NumeroPisos")
    private int numeroPisos;
    @Field("TienePatio")
    private boolean tienePatio;

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
