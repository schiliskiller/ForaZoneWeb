package sch.uv.mx.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sch.uv.mx.modelo.Usuario;
import sch.uv.mx.repositorios.UsuarioRepository;
import sch.uv.mx.servicios.UsuarioService;

@RestController
@RequestMapping("/usr")
public class UsuarioController
{
    @Autowired
    private UsuarioService usrServ;

    public UsuarioController(UsuarioService usrServ)
    {
        this.usrServ = usrServ;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> buscarPorId(@PathVariable Integer id)
    {
        return new ResponseEntity<>(
                this.usrServ.buscarPorId(id).get(),
                HttpStatus.FOUND
        );
    }

    @GetMapping("/list/{usrname}")
    public ResponseEntity<Usuario> buscarPorNombreUsuario(@PathVariable String usrname)
    {
        Usuario found = this.usrServ.buscarPorNombreUsuario(usrname);
        System.out.println(found);
        return new ResponseEntity<>(
                found,
//                this.usrServ.buscarPorNombreUsuario(usrname),
                HttpStatus.FOUND
        );
    }

    @PostMapping
    public ResponseEntity<Usuario> agregarUsuario(@RequestBody Usuario usuario)
    {
        return new ResponseEntity<>(
                usuario,
                HttpStatus.CREATED
        );
    }
}
