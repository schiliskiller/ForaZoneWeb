package sch.uv.mx.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sch.uv.mx.modelo.Comentario;
import sch.uv.mx.modelo.DTO.ComentarioDTO;
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
    @Autowired
    private final ViviendaService viviendaService;

    public ComentarioService(ComentarioRepository repo, UsuarioService serv, ViviendaService vivi)
    {
        this.comentarioRepository = repo;
        this.usuarioService = serv;
        this.viviendaService = vivi;
    }

    public Comentario agregarComentario(ComentarioDTO commDTO)
    {
        Comentario comentario = new Comentario();

        comentario.setContenido(commDTO.contenido());
        comentario.setVivienda(this.viviendaService.buscarPorId(commDTO.viviendaId()));
        comentario.setRating(commDTO.rating());
        comentario.setAutor(
                (Estudiante) this.usuarioService.buscarPorId(commDTO.autorId())
                                                .orElse(null)
        );

        return this.comentarioRepository.save(comentario);
    }

    public List<Comentario> buscarPorAutor(String nomAutor)
    {
        return this.comentarioRepository.findByAutor(
                (Estudiante) this.usuarioService.buscarPorNombreUsuario(nomAutor)
                                                .orElse(null)
        );
    }

    public Comentario buscarPorId(String id)
    {
        return this.comentarioRepository.findById(id).orElse(null);
    }

    public List<Comentario> buscarPorVivienda(String viviendaId)
    {
        return this.comentarioRepository.findByVivienda(
                this.viviendaService.buscarPorId(viviendaId)
        );
    }

    public List<Comentario> buscarTodo()
    {
        return this.comentarioRepository.findAll();
    }
}
