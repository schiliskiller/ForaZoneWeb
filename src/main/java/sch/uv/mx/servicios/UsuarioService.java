package sch.uv.mx.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sch.uv.mx.modelo.Usuario;
import sch.uv.mx.repositorios.UsuarioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService
{
    @Autowired
    private UsuarioRepository repository;

    public UsuarioService(UsuarioRepository rep)
    {
        this.repository = rep;
    }

    public Usuario crearUsuario(Usuario usr)
    {
        return this.repository.save(usr);
    }

    public Usuario buscarPorNombreUsuario(String usrname)
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
