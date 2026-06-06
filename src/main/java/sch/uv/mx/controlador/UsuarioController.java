package sch.uv.mx.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sch.uv.mx.modelo.Estudiante;
import sch.uv.mx.modelo.Institucion;
import sch.uv.mx.modelo.Usuario;
import sch.uv.mx.repositorios.UsuarioRepository;
import sch.uv.mx.servicios.InstitucionService;
import sch.uv.mx.servicios.UsuarioService;

import java.util.Optional;

@RestController
@RequestMapping("/usr")
public class UsuarioController
{
    @Autowired
    private final UsuarioService usrServ;

    public UsuarioController(UsuarioService usrServ)
    {
        this.usrServ = usrServ;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> buscarPorId(@PathVariable Integer id)
    {
        Optional<Usuario> found = this.usrServ.buscarPorId(id);
        return ResponseEntity.ok(found.orElse(null));
    }

    @GetMapping("/list/{usrname}")
    public ResponseEntity<Usuario> buscarPorNombreUsuario(@PathVariable String usrname)
    {
        Optional<Usuario> found = this.usrServ.buscarPorNombreUsuario(usrname);
        System.out.println(found.orElse(null));
        return ResponseEntity.ok(found.orElse(null));
    }

    @PostMapping
    public ResponseEntity<Usuario> agregarUsuario(@RequestBody Usuario usuario)
    {
        Usuario usr = this.usrServ.crearUsuario(usuario);
        System.out.println(usr);
        return ResponseEntity.ok(usr);
    }
}