package sch.uv.mx.modelo;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Document(collection = "usuarios")
@TypeAlias("duenio")
public class Duenio extends Usuario implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Field("Nombre")
    private String nombre;
    @Field("ApPat")
    private String apPat;
    @Field("ApMat")
    private String apMat;
    @Field("correoElectronico")
    private String correoElectronico;
    @Field("reputacion")
    private float reputacion;

    public Duenio()
    {
    }

    public Duenio(String nombre_Usuario, LocalDate fecha_Nacimiento, String contrEncriptada, String nombre, String apPat, String apMat, String correoElectronico, float reputacion)
    {
        super(nombre_Usuario, fecha_Nacimiento, contrEncriptada);
        this.nombre = nombre;
        this.apPat = apPat;
        this.apMat = apMat;
        this.correoElectronico = correoElectronico;
        this.reputacion = reputacion;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApPat()
    {
        return apPat;
    }

    public void setApPat(String apPat)
    {
        this.apPat = apPat;
    }

    public String getApMat()
    {
        return apMat;
    }

    public void setApMat(String apMat)
    {
        this.apMat = apMat;
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
