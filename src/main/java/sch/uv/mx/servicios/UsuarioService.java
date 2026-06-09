package sch.uv.mx.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import sch.uv.mx.modelo.DTO.DuenioDTO;
import sch.uv.mx.modelo.DTO.EstudianteDTO;
import sch.uv.mx.modelo.DTO.UsuarioDTO;
import sch.uv.mx.modelo.Duenio;
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
    @Autowired
    private final PasswordEncoder passwordEncoder;

    public UsuarioService(UsuarioRepository rep, InstitucionService instServ, PasswordEncoder pass)
    {
        this.repository = rep;
        this.instServ = instServ;
        this.passwordEncoder = pass;
    }

    public Usuario crearUsuario(UsuarioDTO usrDTO)
    {
        Usuario usr = null;

        // La IA me recomendo utilizar Pattern Matching para evitar
        // castings con la clase Estudiante
        if (usrDTO instanceof EstudianteDTO estDTO)
        {
            Estudiante est = new Estudiante();

            String correo = estDTO.correoInstitucional();

            if (correo != null)
            {
                String dominio = correo.split("@")[1];
                Optional<Institucion> inst = this.instServ.buscarPorDominioCorreo(dominio);
                est.setInstitucion(inst.orElse(null));
            }
            est.setCorreoInstitucional(correo);
            est.setToken(estDTO.token());

            usr = est;
        }
        else if (usrDTO instanceof DuenioDTO duenioDTO)
        {
            Duenio duenio = new Duenio();

            duenio.setNombre(duenioDTO.nombre());
            duenio.setApPat(duenioDTO.apPat());
            duenio.setApMat(duenioDTO.apMat());
            duenio.setCorreoElectronico(duenioDTO.correoElectronico());
            duenio.setReputacion(duenioDTO.reputacion());

            usr = duenio;
        }

        if (usr == null)
        {
            return null;
        }

        usr.setNombreUsuario(usrDTO.nombreUsuario());
        String contrasenaEncriptada = passwordEncoder.encode(usrDTO.contrEncriptada());
        usr.setContrEncriptada(contrasenaEncriptada);
        usr.setFechaNacimiento(usrDTO.fechaNacimiento());

        return this.repository.save(usr);
    }

    public Optional<Usuario> buscarPorNombreUsuario(String usrname)
    {
        return this.repository.findByNombreUsuario(usrname);
    }

    public Optional<Usuario> buscarPorId(String id)
    {
        return this.repository.findById(id);
    }

    public void eliminarPorId(String id)
    {
        this.repository.deleteById(id);
    }

    public List<Usuario> buscarTodo()
    {
        return this.repository.findAll();
    }

    public Optional<Estudiante> buscarPorCorreo(String correo)
    {
        return this.repository.findByCorreoInstitucional(correo);
    }

    public Usuario consultarUsuario(UsuarioDTO usrDTO)
    {
        Usuario found = null;
        if (usrDTO instanceof EstudianteDTO estDTO && estDTO.correoInstitucional() != null)
        {
            found = this.repository.findByCorreoInstitucional(estDTO.correoInstitucional())
                                   .orElse(null);
        }
        else if (usrDTO instanceof DuenioDTO duenioDTO && duenioDTO.correoElectronico() != null)
        {

            found = this.repository.findByCorreoElectronico(duenioDTO.correoElectronico())
                                   .orElse(null);
        }

        if (usrDTO.nombreUsuario() != null)
        {
            found = this.repository.findByNombreUsuario(usrDTO.nombreUsuario())
                                   .orElse(null);
        }

        return usrDTO.contrEncriptada() != null
                && passwordEncoder.matches(usrDTO.contrEncriptada(), found.getContrEncriptada())
               ? found
               : null;
    }
}
