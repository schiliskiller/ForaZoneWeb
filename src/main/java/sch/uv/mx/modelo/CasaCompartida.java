package sch.uv.mx.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CasaCompartida extends Vivienda implements Serializable
{
    private static final long serialVersionUID = 1L;
    private int numeroPisos;
    private boolean tienePatio;
}
