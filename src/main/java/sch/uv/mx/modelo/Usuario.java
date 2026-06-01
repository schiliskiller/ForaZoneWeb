package sch.uv.mx.modelo;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Date;

@Document(collection = "usuarios")
public abstract class Usuario extends ObjetoMongo implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    private   int    IDUsuario;
    @Field("NombreUsuario")
    private   String nombreUsuario;
    @Field("Fecha_Nacimiento")
    private   Date   fechaNacimiento;
    @Field("contrEncriptada")
    transient String contrEncriptada;

    public Usuario()
    {
    }

    public Usuario(ObjectId oid, Date fecha_Nacimiento, String nombre_Usuario)
    {
        super(oid);
        fechaNacimiento = fecha_Nacimiento;
        nombreUsuario = nombre_Usuario;
    }

    public Usuario(ObjectId oid)
    {
        super(oid);
    }

    public Usuario(ObjectId oid, String nombre_Usuario, Date fecha_Nacimiento, String contrEncriptada)
    {
        super(oid);
        nombreUsuario = nombre_Usuario;
        fechaNacimiento = fecha_Nacimiento;
        this.contrEncriptada = contrEncriptada;
    }

    public int getIDUsuario()
    {
        return IDUsuario;
    }

    public void setIDUsuario(int ID_Usuario)
    {
        this.IDUsuario = ID_Usuario;
    }

    public String getNombreUsuario()
    {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombre_Usuario)
    {
        nombreUsuario = nombre_Usuario;
    }

    public Date getFechaNacimiento()
    {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fecha_Nacimiento)
    {
        fechaNacimiento = fecha_Nacimiento;
    }

    public String getContrEncriptada()
    {
        return contrEncriptada;
    }

    public String encriptar(String contr)
    {
        return "";
    }
}
