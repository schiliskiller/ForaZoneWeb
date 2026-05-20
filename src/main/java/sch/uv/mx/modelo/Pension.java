package sch.uv.mx.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pension extends Vivienda implements Serializable
{
    private static final long serialVersionUID = 1L;
    private boolean incluyeAlimentos;
    private int numeroComidasAlDia;
}
