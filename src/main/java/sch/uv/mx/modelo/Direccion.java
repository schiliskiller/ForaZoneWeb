package sch.uv.mx.modelo;

import org.bson.types.ObjectId;

import java.io.Serializable;

public class Direccion extends ObjetoMongo implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String Calle;
    private String NumExt;
    private String NumInt;
    private int CodigoPostal;
    private String Colonia;

    public Direccion()
    {
    }

    public Direccion(String calle, String numExt, String numInt, int codigoPostal, String colonia)
    {
        Calle = calle;
        NumExt = numExt;
        NumInt = numInt;
        CodigoPostal = codigoPostal;
        Colonia = colonia;
    }

    public Direccion(ObjectId oid, String calle, String numExt, String numInt, int codigoPostal, String colonia)
    {
        super(oid);
        Calle = calle;
        NumExt = numExt;
        NumInt = numInt;
        CodigoPostal = codigoPostal;
        Colonia = colonia;
    }

    public String getCalle()
    {
        return Calle;
    }

    public void setCalle(String calle)
    {
        Calle = calle;
    }

    public String getNumExt()
    {
        return NumExt;
    }

    public void setNumExt(String numExt)
    {
        NumExt = numExt;
    }

    public String getNumInt()
    {
        return NumInt;
    }

    public void setNumInt(String numInt)
    {
        NumInt = numInt;
    }

    public int getCodigoPostal()
    {
        return CodigoPostal;
    }

    public void setCodigoPostal(int codigoPostal)
    {
        CodigoPostal = codigoPostal;
    }

    public String getColonia()
    {
        return Colonia;
    }

    public void setColonia(String colonia)
    {
        Colonia = colonia;
    }
}
