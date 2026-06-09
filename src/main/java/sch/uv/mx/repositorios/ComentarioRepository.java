package sch.uv.mx.repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import sch.uv.mx.modelo.Comentario;
import sch.uv.mx.modelo.Estudiante;
import sch.uv.mx.modelo.Usuario;
import sch.uv.mx.modelo.Vivienda;

import java.util.List;

@Repository
public interface ComentarioRepository extends MongoRepository<Comentario, String>
{
    List<Comentario> findByAutor(Estudiante autor);
    List<Comentario> findByVivienda(Vivienda vivienda);
}
