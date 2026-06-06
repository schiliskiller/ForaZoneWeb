package sch.uv.mx.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sch.uv.mx.modelo.Estudiante;
import sch.uv.mx.modelo.Institucion;
import sch.uv.mx.modelo.Usuario;
import sch.uv.mx.repositorios.UsuarioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService
{
    @Autowired
    private final UsuarioRepository repository;
    @Autowired
    private final InstitucionService instServ;

    public UsuarioService(UsuarioRepository rep, InstitucionService instServ)
    {
        this.repository = rep;
        this.instServ = instServ;
    }

    public Usuario crearUsuario(Usuario usr)
    {
        // La IA me recomendo utilizar Pattern Matching para evitar
        // castings con la clase Estudiante
        if (usr instanceof Estudiante estudiante)
        {
            String correo = estudiante.getCorreoInstitucional();

            if (correo != null)
            {
                String dominio = correo.split("@")[1];
                Optional<Institucion> inst = this.instServ.buscarPorDominioCorreo(dominio);
                estudiante.setInstitucion(inst.orElse(null));
            }
        }

        return this.repository.save(usr);
    }

    public Optional<Usuario> buscarPorNombreUsuario(String usrname)
    {
        return this.repository.findByNombreUsuario(usrname);
    }

    public Optional<Usuario> buscarPorId(Integer id)
    {
        return this.repository.findById(id);
    }

    public void eliminarPorId(Integer id)
    {
        this.repository.deleteById(id);
    }
}
