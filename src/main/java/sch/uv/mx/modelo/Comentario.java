package sch.uv.mx.modelo;

import org.bson.types.ObjectId;

import java.io.Serializable;

public class Comentario extends ObjetoMongo implements Serializable
{
    private static final long serialVersionUID = 1L;
    private int ID_Comentario;
    private String Contenido;
    private int rating;
    private Estudiante autor;

    public Comentario()
    {
    }

    public Comentario(int ID_Comentario, String contenido, int rating, Estudiante autor)
    {
        this.ID_Comentario = ID_Comentario;
        Contenido = contenido;
        this.rating = rating;
        this.autor = autor;
    }

    public Comentario(ObjectId oid, int ID_Comentario, String contenido, int rating, Estudiante autor)
    {
        super(oid);
        this.ID_Comentario = ID_Comentario;
        Contenido = contenido;
        this.rating = rating;
        this.autor = autor;
    }

    public int getID_Comentario()
    {
        return ID_Comentario;
    }

    public void setID_Comentario(int ID_Comentario)
    {
        this.ID_Comentario = ID_Comentario;
    }

    public String getContenido()
    {
        return Contenido;
    }

    public void setContenido(String contenido)
    {
        Contenido = contenido;
    }

    public int getRating()
    {
        return rating;
    }

    public void setRating(int rating)
    {
        this.rating = rating;
    }

    public Estudiante getAutor()
    {
        return autor;
    }

    public void setAutor(Estudiante autor)
    {
        this.autor = autor;
    }
}
