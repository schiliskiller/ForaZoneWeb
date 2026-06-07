package sch.uv.mx.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sch.uv.mx.modelo.DTO.UsuarioDTO;
import sch.uv.mx.modelo.Estudiante;
import sch.uv.mx.modelo.Institucion;
import sch.uv.mx.modelo.Usuario;
import sch.uv.mx.repositorios.UsuarioRepository;
import sch.uv.mx.servicios.InstitucionService;
import sch.uv.mx.servicios.UsuarioService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class UsuarioController
{
    @Autowired
    private final UsuarioService usrServ;

    public UsuarioController(UsuarioService usrServ)
    {
        this.usrServ = usrServ;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> buscarPorId(@PathVariable String id)
    {
        return ResponseEntity.ok(
                this.usrServ.buscarPorId(id)
                            .orElse(null)
        );
    }

    @GetMapping("/list/{usrname}")
    public ResponseEntity<Usuario> buscarPorNombreUsuario(@PathVariable String usrname)
    {
        return ResponseEntity.ok(
                this.usrServ.buscarPorNombreUsuario(usrname)
                            .orElse(null)
        );
    }

    @GetMapping("/list")
    public ResponseEntity<List<Usuario>> buscarTodo()
    {
        return ResponseEntity.ok(this.usrServ.buscarTodo());
    }

    @PostMapping
    public ResponseEntity<Usuario> agregarUsuario(@RequestBody UsuarioDTO usuario)
    {
        return new ResponseEntity<>(
                this.usrServ.crearUsuario(usuario),
                HttpStatus.CREATED
        );
    }
}