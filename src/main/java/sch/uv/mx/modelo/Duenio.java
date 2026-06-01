package sch.uv.mx.modelo;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Document(collection = "usuarios")
@TypeAlias("duenio")
public class Duenio extends Usuario implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String Nombre;
    private String ApPat;
    private String ApMat;
    private String correoElectronico;
    private float reputacion;

    public Duenio()
    {
    }

    public Duenio(ObjectId oid, String nombre_Usuario, Date fecha_Nacimiento, String contrEncriptada, String nombre, String apPat, String apMat, String correoElectronico, float reputacion)
    {
        super(oid, nombre_Usuario, fecha_Nacimiento, contrEncriptada);
        Nombre = nombre;
        ApPat = apPat;
        ApMat = apMat;
        this.correoElectronico = correoElectronico;
        this.reputacion = reputacion;
    }

    public String getNombre()
    {
        return Nombre;
    }

    public void setNombre(String nombre)
    {
        Nombre = nombre;
    }

    public String getApPat()
    {
        return ApPat;
    }

    public void setApPat(String apPat)
    {
        ApPat = apPat;
    }

    public String getApMat()
    {
        return ApMat;
    }

    public void setApMat(String apMat)
    {
        ApMat = apMat;
    }

    public String getCorreoElectronico()
    {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico)
    {
        this.correoElectronico = correoElectronico;
    }

    public float getReputacion()
    {
        return reputacion;
    }

    public void setReputacion(float reputacion)
    {
        this.reputacion = reputacion;
    }
}
