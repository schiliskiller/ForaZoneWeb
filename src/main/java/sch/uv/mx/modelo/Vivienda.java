package sch.uv.mx.modelo;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = CasaCompartida.class, name = "casa_compartida"),
        @JsonSubTypes.Type(value = Departamento.class, name = "departamento"),
        @JsonSubTypes.Type(value = Pension.class, name = "pension")
})
@Document(collection = "viviendas")
public class Vivienda implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    private String ID_Vivienda;
    @Field("RatingTotal")
    private int ratingTotal;
    @Field("Geopunto")
    private double[] geopunto;
    @Field("Descripcion")
    private String descripcion;
    @Field("Precio")
    private double precio;
    @Field("Duenio")
    private Duenio duenio;
    @Field("Direccion")
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

    public Vivienda(String ID_Vivienda, int ratingTotal, double[] geopunto, String descripcion, double precio, Duenio duenio, Direccion dir)
    {
        this.ID_Vivienda = ID_Vivienda;
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

    public String getID_Vivienda()
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
