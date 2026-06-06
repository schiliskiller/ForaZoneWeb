package sch.uv.mx.modelo;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Document(collection = "viviendas")
@TypeAlias("pension")
public class Pension extends Vivienda implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Field("IncluyeAlimentos")
    private boolean incluyeAlimentos;
    @Field("NumeroComidasAlDia")
    private int numeroComidasAlDia;

    public Pension(Direccion dir, Duenio duenio, double precio, String descripcion, double[] geopunto, boolean incluyeAlimentos, int numeroComidasAlDia)
    {
        super(dir, duenio, precio, descripcion, geopunto);
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
