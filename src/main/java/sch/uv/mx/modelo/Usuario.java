package sch.uv.mx.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Usuario extends ObjetoMongo implements Serializable
{
    private static final long serialVersionUID = 1L;
    private   int    ID_Usuario;
    private   String Nombre_Usuario;
    private   Date   Fecha_Nacimiento;
    transient String contrEncriptada;
}
