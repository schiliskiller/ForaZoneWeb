package sch.uv.mx.modelo.DTO;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import sch.uv.mx.modelo.CasaCompartida;
import sch.uv.mx.modelo.Departamento;
import sch.uv.mx.modelo.Direccion;
import sch.uv.mx.modelo.Pension;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type",
        visible = true
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = CasaCompartidaDTO.class, name = "casa_compartida"),
        @JsonSubTypes.Type(value = DepartamentoDTO.class, name = "departamento"),
        @JsonSubTypes.Type(value = PensionDTO.class, name = "pension")
})
public interface ViviendaDTO
{
    String type();
    Integer ratingTotal();
    Double[] geopunto();
    String descripcion();
    Double precio();
    String duenioId();
    Direccion direccion();
}
