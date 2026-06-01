package sch.uv.mx.repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import sch.uv.mx.modelo.Usuario;

import java.util.List;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, Integer>
{
    Usuario findByNombreUsuario(String usrname);
}
