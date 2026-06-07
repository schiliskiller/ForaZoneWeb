package sch.uv.mx.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sch.uv.mx.modelo.*;
import sch.uv.mx.modelo.DTO.CasaCompartidaDTO;
import sch.uv.mx.modelo.DTO.DepartamentoDTO;
import sch.uv.mx.modelo.DTO.PensionDTO;
import sch.uv.mx.modelo.DTO.ViviendaDTO;
import sch.uv.mx.repositorios.ViviendaRepository;

import java.util.List;

@Service
public class ViviendaService
{
    @Autowired
    private final ViviendaRepository viviendaRepository;
    @Autowired
    private final UsuarioService usuarioService;

    public ViviendaService(ViviendaRepository repo, UsuarioService serv)
    {
        this.viviendaRepository = repo;
        this.usuarioService = serv;
    }

    public Vivienda agregarVivienda(ViviendaDTO vivi)
    {
        Vivienda newVivienda = null;

        if (vivi instanceof DepartamentoDTO deptDTO)
        {
            Departamento dept = new Departamento();
            dept.setNumeroHabitaciones(deptDTO.numeroHabitaciones());
            dept.setCuotaMantenimiento(deptDTO.cuotaMantenimiento());

            newVivienda = dept;
        }
        else if (vivi instanceof PensionDTO pensDTO)
        {
            Pension pens = new Pension();
            pens.setIncluyeAlimentos(pensDTO.incluyeAlimentos());
            pens.setNumeroComidasAlDia(pensDTO.numeroComidasAlDia());

            newVivienda = pens;
        }
        else if (vivi instanceof CasaCompartidaDTO casaDTO)
        {
            CasaCompartida casa = new CasaCompartida();
            casa.setNumeroPisos(casaDTO.numeroPisos());
            casa.setTienePatio(casaDTO.tienePatio());

            newVivienda = new CasaCompartida();
        }

        if (newVivienda == null)
        {
            return null;
        }

        newVivienda.setRatingTotal(vivi.ratingTotal());
        newVivienda.setDescripcion(vivi.descripcion());
        newVivienda.setGeopunto(vivi.geopunto());
        newVivienda.setPrecio(vivi.precio());
        newVivienda.setDireccion(vivi.direccion());
        newVivienda.setDuenio(
                (Duenio) this.usuarioService.buscarPorId(vivi.duenioId())
                             .orElse(null)
        );

        return this.viviendaRepository.save(newVivienda);
    }

    public List<Vivienda> buscarTodoPorCiudad(String ciudad)
    {
        return this.viviendaRepository.findAllByDireccion_Ciudad(ciudad);
    }

    public List<Vivienda> buscarTodoPorCodigoPostal(Integer codPostal)
    {
        return this.viviendaRepository.findAllByDireccion_CodPostal(codPostal);
    }

    public List<Vivienda> buscarTodoPorColonia(String colonia)
    {
        return this.viviendaRepository.findAllByDireccion_Colonia(colonia);
    }

    public List<Vivienda> buscarTodo()
    {
        return this.viviendaRepository.findAll();
    }
}
