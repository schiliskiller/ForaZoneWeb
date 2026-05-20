package sch.uv.mx.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comentario extends ObjetoMongo implements Serializable
{
    private static final long serialVersionUID = 1L;
    private int ID_Comentario;
    private String Contenido;
    private int rating;
    private Estudiante autor;
}
