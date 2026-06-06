package sch.uv.mx.repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import sch.uv.mx.modelo.Institucion;

import java.util.List;
import java.util.Optional;

@Repository
public interface InstitucionRepository extends MongoRepository<Institucion, String>
{
    Optional<Institucion> findByNombreInstitucion(String institucion);
    Optional<Institucion> findByDominioCorreo(String dominio);
}