package sch.uv.mx.repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import sch.uv.mx.modelo.Duenio;
import sch.uv.mx.modelo.Estudiante;
import sch.uv.mx.modelo.Usuario;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, String>
{
    <T extends Usuario> Optional<T> findByNombreUsuario(String usrname);
    <T extends Estudiante> Optional<T> findByCorreoInstitucional(String correo);
    <T extends Duenio> Optional<T> findByCorreoElectronico(String correo);
}
