package sch.uv.mx.modelo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

public class Direccion implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String calle;
    private String numExt;
    private String numInt;
    private Integer codPostal;
    private String colonia;
    private String ciudad;

    public Direccion()
    {
    }

    public String getCalle()
    {
        return this.calle;
    }

    public void setCalle(String calle)
    {
        this.calle = calle;
    }

    public String getNumExt()
    {
        return this.numExt;
    }

    public void setNumExt(String numExt)
    {
        this.numExt = numExt;
    }

    public String getNumInt()
    {
        return this.numInt;
    }

    public void setNumInt(String numInt)
    {
        this.numInt = numInt;
    }

    public Integer getCodPostal()
    {
        return this.codPostal;
    }

    public void setCodPostal(Integer codigoPostal)
    {
        this.codPostal = codigoPostal;
    }

    public String getColonia()
    {
        return this.colonia;
    }

    public void setColonia(String colonia)
    {
        this.colonia = colonia;
    }

    public String getCiudad()
    {
        return ciudad;
    }

    public void setCiudad(String ciudad)
    {
        this.ciudad = ciudad;
    }
}
