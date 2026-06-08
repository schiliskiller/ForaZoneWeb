package sch.uv.mx.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sch.uv.mx.modelo.Institucion;
import sch.uv.mx.servicios.InstitucionService;

import java.util.List;

@Controller
@RequestMapping("/institucion")
public class InstitucionController
{
    @Autowired
    private final InstitucionService institucionService;

    public InstitucionController(InstitucionService serv)
    {
        this.institucionService = serv;
    }

    @PostMapping
    public ResponseEntity<Institucion> agregarInstitucion(@RequestBody Institucion inst)
    {
        return new ResponseEntity<>(
                this.institucionService.agregarInstitucion(inst),
                HttpStatus.CREATED
        );
    }

    @GetMapping("/list")
    public ResponseEntity<List<Institucion>> buscarTodo()
    {
        return ResponseEntity.ok(this.institucionService.buscarTodo());
    }

    @GetMapping("/list/nombre/{nombre}")
    public ResponseEntity<Institucion> buscarPorNombreInstitucion(@PathVariable String nombre)
    {
        return ResponseEntity.ok(
                this.institucionService.buscarPorNombreInstitucion(nombre)
                                       .orElse(null)
        );
    }

    @GetMapping("/list/dominio/{dominio}")
    public ResponseEntity<Institucion> buscarPorDominioCorreo(@PathVariable String dominio)
    {
        System.out.println(dominio);
        return ResponseEntity.ok(
                this.institucionService.buscarPorDominioCorreo(dominio)
                                       .orElse(null)
        );
    }
}
