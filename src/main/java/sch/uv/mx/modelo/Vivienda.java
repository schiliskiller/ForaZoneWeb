package sch.uv.mx.modelo;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Document(collection = "viviendas")
public class Vivienda implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    private String ID_Vivienda;
    @Field("RatingTotal")
    private Integer ratingTotal;
    @Field("Geopunto")
    private Double[] geopunto;
    @Field("Descripcion")
    private String descripcion;
    @Field("Precio")
    private Double precio;
    @DocumentReference
    private Duenio duenio;
    @Field("Direccion")
    private Direccion direccion;
    @Field("EsSugerencia")
    private Boolean esSugerencia;

    public Vivienda()
    {
    }

    public String getID_Vivienda()
    {
        return ID_Vivienda;
    }

    public Integer getRatingTotal()
    {
        return ratingTotal;
    }

    public void setRatingTotal(int ratingTotal)
    {
        this.ratingTotal = ratingTotal;
    }

    public Double[] getGeopunto()
    {
        return geopunto;
    }

    public void setGeopunto(Double[] geopunto)
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

    public Double getPrecio()
    {
        return precio;
    }

    public void setPrecio(Double precio)
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

    public Direccion getDireccion()
    {
        return direccion;
    }

    public void setDireccion(Direccion dir)
    {
        this.direccion = dir;
    }

    public Boolean getEsSugerencia()
    {
        return this.esSugerencia;
    }

    public void setEsSugerencia(Boolean sug)
    {
        this.esSugerencia = sug;
    }

    @Transient // Para no guardar el atributo en un nuevo documento
    public String getTipo()
    {
        return this.getClass().getSimpleName();
    }
}
