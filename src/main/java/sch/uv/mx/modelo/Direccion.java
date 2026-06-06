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
    private int codigoPostal;
    private String colonia;

    public Direccion()
    {
    }

    public Direccion(String calle, String numExt, String numInt, int codigoPostal, String colonia)
    {
        this.calle = calle;
        this.numExt = numExt;
        this.numInt = numInt;
        this.codigoPostal = codigoPostal;
        this.colonia = colonia;
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

    public int getCodigoPostal()
    {
        return this.codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal)
    {
        this.codigoPostal = codigoPostal;
    }

    public String getColonia()
    {
        return this.colonia;
    }

    public void setColonia(String colonia)
    {
        this.colonia = colonia;
    }
}
