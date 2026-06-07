package sch.uv.mx.modelo;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.springframework.data.mongodb.core.mapping.Field;

import java.awt.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Document(collection = "usuarios")
@TypeAlias("estudiante")
public class Estudiante extends Usuario implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Field("token")
    private String token;
    @Field("correoInstitucional")
    private String correoInstitucional;
    @DocumentReference
    private Institucion institucion;
    @Field("listaDeseos")
    private ListaDeseos lista;

    public Estudiante()
    {
    }

    public Estudiante(String nombre_Usuario, LocalDate fecha_Nacimiento, String contrEncriptada, String token, String correoInstitucional, Institucion inst)
    {
        super(nombre_Usuario, fecha_Nacimiento, contrEncriptada);
        this.token = token;
        this.correoInstitucional = correoInstitucional;
        this.institucion = inst;
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

    public Institucion getInstitucion()
    {
        return institucion;
    }

    public void setInstitucion(Institucion inst)
    {
        if (inst == null) return;
        this.institucion = inst;
    }
}
