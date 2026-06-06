package sch.uv.mx.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sch.uv.mx.modelo.Vivienda;
import sch.uv.mx.repositorios.ViviendaRepository;

import java.util.List;

@Service
public class ViviendaService
{
    @Autowired
    private final ViviendaRepository viviendaRepository;

    public ViviendaService(ViviendaRepository repo)
    {
        this.viviendaRepository = repo;
    }

    public Vivienda agregarVivienda(Vivienda vivi)
    {
        return this.viviendaRepository.save(vivi);
    }

    public List<Vivienda> buscarTodoPorCiudad(String ciudad)
    {
        return this.viviendaRepository.findAllByDireccionCiudad(ciudad);
    }

    public List<Vivienda> buscarTodoPorCodigoPostal(String codPostal)
    {
        return this.viviendaRepository.findAllByDireccionCodPostal(codPostal);
    }

    public List<Vivienda> buscarTodoPorColonia(String colonia)
    {
        return this.viviendaRepository.findAllByDireccionColonia(colonia);
    }
}
