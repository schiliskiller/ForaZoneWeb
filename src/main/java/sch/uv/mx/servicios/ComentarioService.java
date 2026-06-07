package sch.uv.mx.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sch.uv.mx.modelo.Comentario;
import sch.uv.mx.modelo.Estudiante;
import sch.uv.mx.repositorios.ComentarioRepository;

import java.util.List;

@Service
public class ComentarioService
{
    @Autowired
    private final ComentarioRepository comentarioRepository;
    @Autowired
    private final UsuarioService usuarioService;

    public ComentarioService(ComentarioRepository repo, UsuarioService serv)
    {
        this.comentarioRepository = repo;
        this.usuarioService = serv;
    }

    public Comentario agregarComentario(Comentario comentario)
    {
        return this.comentarioRepository.save(comentario);
    }

    public List<Comentario> buscarPorAutor(String nomAutor)
    {
        return this.comentarioRepository.findByAutor(
                (Estudiante) usuarioService.buscarPorNombreUsuario(nomAutor)
                              .orElse(null)
        );
    }

    public Comentario buscarPorId(String id)
    {
        return this.comentarioRepository.findById(id).orElse(null);
    }

    public List<Comentario> buscarTodo()
    {
        return this.comentarioRepository.findAll();
    }
}
