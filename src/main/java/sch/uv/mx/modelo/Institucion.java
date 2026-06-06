package sch.uv.mx.modelo;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Document(collection = "instituciones")
public class Institucion implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    private String ID_Institucion;
    @Field("NombreInstitucion")
    private String nombreInstitucion;
    @Field("DominioCorreo")
    private String dominioCorreo;

    public Institucion(String ID_Institucion, String nombreInstitucion, String dominioCorreo)
    {
        this.ID_Institucion = ID_Institucion;
        this.nombreInstitucion = nombreInstitucion;
        this.dominioCorreo = dominioCorreo;
    }

    public Institucion()
    {
    }

    public Institucion(String nombreInstitucion, String dominioCorreo)
    {
        this.nombreInstitucion = nombreInstitucion;
        this.dominioCorreo = dominioCorreo;
    }

    public String getID_Institucion()
    {
        return ID_Institucion;
    }

    public void setID_Institucion(String ID_Institucion)
    {
        this.ID_Institucion = ID_Institucion;
    }

    public String getNombreInstitucion()
    {
        return nombreInstitucion;
    }

    public void setNombreInstitucion(String nombreInstitucion)
    {
        this.nombreInstitucion = nombreInstitucion;
    }

    public String getDominioCorreo()
    {
        return dominioCorreo;
    }
}
