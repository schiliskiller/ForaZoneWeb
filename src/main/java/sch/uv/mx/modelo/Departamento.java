package sch.uv.mx.modelo;

import org.bson.types.ObjectId;

import java.io.Serializable;

public class Departamento extends Vivienda implements Serializable
{
    private static final long serialVersionUID = 1L;
    private int numeroHabitaciones;
    private double cuotaMantenimiento;

    public Departamento(int ratingTotal, double[] geopunto, String descripcion, double precio, Duenio duenio, Direccion dir)
    {
        super(ratingTotal, geopunto, descripcion, precio, duenio, dir);
    }

    public Departamento(int ratingTotal, double[] geopunto, String descripcion, double precio, Duenio duenio, Direccion dir, int numeroHabitaciones, double cuotaMantenimiento)
    {
        super(ratingTotal, geopunto, descripcion, precio, duenio, dir);
        this.numeroHabitaciones = numeroHabitaciones;
        this.cuotaMantenimiento = cuotaMantenimiento;
    }

    public Departamento(ObjectId oid, int ratingTotal, double[] geopunto, String descripcion, double precio, Duenio duenio, Direccion dir, int numeroHabitaciones, double cuotaMantenimiento)
    {
        super(oid, ratingTotal, geopunto, descripcion, precio, duenio, dir);
        this.numeroHabitaciones = numeroHabitaciones;
        this.cuotaMantenimiento = cuotaMantenimiento;
    }

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
