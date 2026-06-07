package sch.uv.mx.modelo;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Document(collection = "comentarios")
public class Comentario implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    private String ID_Comentario;
    @Field("Contenido")
    private String contenido;
    @Field("Rating")
    private Integer rating;
    @DocumentReference
    private Estudiante autor;

    public Comentario()
    {
    }

    public Comentario(String ID_Comentario, String contenido, Integer rating, Estudiante autor)
    {
        this.ID_Comentario = ID_Comentario;
        this.contenido = contenido;
        this.rating = rating;
        this.autor = autor;
    }

    public String getID_Comentario()
    {
        return ID_Comentario;
    }

    public void setID_Comentario(String ID_Comentario)
    {
        this.ID_Comentario = ID_Comentario;
    }

    public String getContenido()
    {
        return contenido;
    }

    public void setContenido(String contenido)
    {
        this.contenido = contenido;
    }

    public Integer getRating()
    {
        return rating;
    }

    public void setRating(Integer rating)
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
