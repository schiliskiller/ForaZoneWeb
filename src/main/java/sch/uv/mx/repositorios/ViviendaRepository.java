package sch.uv.mx.repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import sch.uv.mx.modelo.Vivienda;

import java.util.List;

@Repository
public interface ViviendaRepository extends MongoRepository<Vivienda, String>
{
    List<Vivienda> findAllByDireccion_Ciudad(String ciudad);
    List<Vivienda> findAllByDireccion_Colonia(String colonia);
    List<Vivienda> findAllByDireccion_CodPostal(Integer codPostal);
}
