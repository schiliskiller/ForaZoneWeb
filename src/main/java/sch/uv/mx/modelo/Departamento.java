package sch.uv.mx.modelo;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Document(collection = "viviendas")
@TypeAlias("departamento")
public class Departamento extends Vivienda implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Field("NumeroHabitantes")
    private Integer numeroHabitaciones;
    @Field("CuotaMantenimiento")
    private Double cuotaMantenimiento;

    public int getNumeroHabitaciones()
    {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones)
    {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public double getCuotaMantenimiento()
    {
        return cuotaMantenimiento;
    }

    public void setCuotaMantenimiento(double cuotaMantenimiento)
    {
        this.cuotaMantenimiento = cuotaMantenimiento;
    }
}
