package sch.uv.mx.modelo;

import org.bson.types.ObjectId;

import java.io.Serializable;
import java.util.Date;

public abstract class Usuario extends ObjetoMongo implements Serializable
{
    private static final long serialVersionUID = 1L;
    private   int    ID_Usuario;
    private   String Nombre_Usuario;
    private   Date   Fecha_Nacimiento;
    transient String contrEncriptada;

    public Usuario()
    {
    }

    public Usuario(ObjectId oid, Date fecha_Nacimiento, String nombre_Usuario)
    {
        super(oid);
        Fecha_Nacimiento = fecha_Nacimiento;
        Nombre_Usuario = nombre_Usuario;
    }

    public Usuario(ObjectId oid)
    {
        super(oid);
    }

    public Usuario(ObjectId oid, String nombre_Usuario, Date fecha_Nacimiento, String contrEncriptada)
    {
        super(oid);
        Nombre_Usuario = nombre_Usuario;
        Fecha_Nacimiento = fecha_Nacimiento;
        this.contrEncriptada = contrEncriptada;
    }

    public int getID_Usuario()
    {
        return ID_Usuario;
    }

    public void setID_Usuario(int ID_Usuario)
    {
        this.ID_Usuario = ID_Usuario;
    }

    public String getNombre_Usuario()
    {
        return Nombre_Usuario;
    }

    public void setNombre_Usuario(String nombre_Usuario)
    {
        Nombre_Usuario = nombre_Usuario;
    }

    public Date getFecha_Nacimiento()
    {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(Date fecha_Nacimiento)
    {
        Fecha_Nacimiento = fecha_Nacimiento;
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
