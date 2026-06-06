package sch.uv.mx.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sch.uv.mx.modelo.Institucion;
import sch.uv.mx.repositorios.InstitucionRepository;

import java.util.Optional;

@Service
public class InstitucionService
{
    @Autowired
    private final InstitucionRepository institucionRepository;

    public InstitucionService(InstitucionRepository instRepo)
    {
        this.institucionRepository = instRepo;
    }

    public Optional<Institucion> buscarPorNombreInstitucion(String inst)
    {
        return this.institucionRepository.findByNombreInstitucion(inst);
    }

    public Optional<Institucion> buscarPorDominioCorreo(String dominio)
    {
        return this.institucionRepository.findByDominioCorreo(dominio);
    }
}
