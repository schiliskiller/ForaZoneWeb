package sch.uv.mx.modelo;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Estudiante.class, name = "estudiante"),
        @JsonSubTypes.Type(value = Duenio.class, name = "duenio")
})
@Document(collection = "usuarios")
public abstract class Usuario implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    private   String    IDUsuario;
    @Field("NombreUsuario")
    private   String    nombreUsuario;
    @Field("Fecha_Nacimiento")
    private   LocalDate fechaNacimiento;
    @Field("contrEncriptada")
    private   String    contrEncriptada;

    public Usuario()
    {
    }

    public Usuario(LocalDate fecha_Nacimiento, String nombre_Usuario)
    {
        fechaNacimiento = fecha_Nacimiento;
        nombreUsuario = nombre_Usuario;
    }

    public Usuario(String nombre_Usuario, LocalDate fecha_Nacimiento, String contrEncriptada)
    {
        nombreUsuario = nombre_Usuario;
        fechaNacimiento = fecha_Nacimiento;
        this.contrEncriptada = contrEncriptada;
    }

    public String getIDUsuario()
    {
        return IDUsuario;
    }

    public void setIDUsuario(String ID_Usuario)
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

    public LocalDate getFechaNacimiento()
    {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fecha_Nacimiento)
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
