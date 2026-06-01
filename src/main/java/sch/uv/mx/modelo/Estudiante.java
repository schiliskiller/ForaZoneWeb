package sch.uv.mx.modelo;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import java.awt.*;
import java.io.Serializable;
import java.util.Date;

@Document(collection = "usuarios")
@TypeAlias("estudiante")
public class Estudiante extends Usuario implements Serializable
{
    private static final long serialVersionUID = 1L;
    transient String token;
    private String correoInstitucional;
    private Institucion inst;

    public Estudiante()
    {
    }

    public Estudiante(ObjectId oid, String nombre_Usuario, Date fecha_Nacimiento, String contrEncriptada, String token, String correoInstitucional, Institucion inst)
    {
        super(oid, nombre_Usuario, fecha_Nacimiento, contrEncriptada);
        this.token = token;
        this.correoInstitucional = correoInstitucional;
        this.inst = inst;
    }

    public String getToken()
    {
        return token;
    }

    public void setToken(String token)
    {
        this.token = token;
    }

    public String getCorreoInstitucional()
    {
        return correoInstitucional;
    }

    public void setCorreoInstitucional(String correoInstitucional)
    {
        this.correoInstitucional = correoInstitucional;
    }

    public Institucion getInst()
    {
        return inst;
    }

    public void setInst(Institucion inst)
    {
        this.inst = inst;
    }
}
