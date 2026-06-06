package sch.uv.mx.repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import sch.uv.mx.modelo.Comentario;
import sch.uv.mx.modelo.Usuario;

import java.util.List;

@Repository
public interface ComentarioRepository extends MongoRepository<Comentario, String>
{
    List<Comentario> findByAutor(Usuario autor);
}
