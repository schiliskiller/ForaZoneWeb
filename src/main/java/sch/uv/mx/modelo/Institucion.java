package sch.uv.mx.modelo;

import org.bson.types.ObjectId;

import java.io.Serializable;

public class Institucion extends ObjetoMongo implements Serializable
{
    private static final long serialVersionUID = 1L;
    private int ID_Institucion;
    private String NombreInstitucion;
    private String dominioCorreo;

    public Institucion(ObjectId oid, int ID_Institucion, String nombreInstitucion, String dominioCorreo)
    {
        super(oid);
        this.ID_Institucion = ID_Institucion;
        NombreInstitucion = nombreInstitucion;
        this.dominioCorreo = dominioCorreo;
    }

    public Institucion()
    {
    }

    public Institucion(String nombreInstitucion, String dominioCorreo)
    {
        NombreInstitucion = nombreInstitucion;
        this.dominioCorreo = dominioCorreo;
    }

    public int getID_Institucion()
    {
        return ID_Institucion;
    }

    public void setID_Institucion(int ID_Institucion)
    {
        this.ID_Institucion = ID_Institucion;
    }

    public String getNombreInstitucion()
    {
        return NombreInstitucion;
    }

    public void setNombreInstitucion(String nombreInstitucion)
    {
        NombreInstitucion = nombreInstitucion;
    }

    public String getDominioCorreo()
    {
        return dominioCorreo;
    }
}
