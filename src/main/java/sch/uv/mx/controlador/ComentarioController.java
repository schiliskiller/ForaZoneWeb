package sch.uv.mx.controlador;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sch.uv.mx.modelo.Comentario;
import sch.uv.mx.modelo.DTO.ComentarioDTO;
import sch.uv.mx.modelo.Estudiante;
import sch.uv.mx.modelo.Usuario;
import sch.uv.mx.servicios.ComentarioService;

import java.util.List;

@Controller
@RequestMapping("/comentario")
public class ComentarioController
{
    @Autowired
    private final ComentarioService commServ;
    @Autowired
    private ComentarioService comentarioService;

    public ComentarioController(ComentarioService serv)
    {
        this.commServ = serv;
    }

    @PostMapping
    public ResponseEntity<Comentario> agregarComentario(@RequestBody ComentarioDTO comentario)
    {
        return new ResponseEntity<>(
                this.commServ.agregarComentario(comentario),
                HttpStatus.CREATED
        );
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<Comentario> buscarPorId(@PathVariable String id)
    {
        return ResponseEntity.ok(this.commServ.buscarPorId(id));
    }

    @GetMapping("/list/{nomAutor}")
    public ResponseEntity<List<Comentario>> buscarPorAutor(@PathVariable String nomAutor)
    {
        return ResponseEntity.ok(this.commServ.buscarPorAutor(nomAutor));
    }

    @GetMapping("/list")
    public ResponseEntity<List<Comentario>> buscarTodo()
    {
        return ResponseEntity.ok(this.commServ.buscarTodo());
    }

    @PostMapping("/guardar")
    public String guardarComentario(@RequestParam("idVivienda") String idVivienda,
                                    @RequestParam("texto") String texto,
                                    HttpSession session)
    {
        Usuario usr = (Usuario) session.getAttribute("sesionUsuario");
        ComentarioDTO comm = new ComentarioDTO(
                                null,
                                idVivienda,
                                texto,
                         0,
                                usr.getIDUsuario()
                        );

        if (session.getAttribute("sesionUsuario") != null
                && !comm.contenido().trim().isEmpty()) {
            this.commServ.agregarComentario(comm);
        }

        return "redirect:/homepage";
    }

    @ResponseBody
    @GetMapping("/vivienda/{id}")
    public List<Comentario> obtenerComentarios(@PathVariable String id) {
        return this.commServ.buscarPorVivienda(id);
    }
}
