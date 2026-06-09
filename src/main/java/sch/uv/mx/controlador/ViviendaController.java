package sch.uv.mx.controlador;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import sch.uv.mx.modelo.Comentario;
import sch.uv.mx.modelo.DTO.ComentarioDTO;
import sch.uv.mx.modelo.DTO.ViviendaDTO;
import sch.uv.mx.modelo.Estudiante;
import sch.uv.mx.modelo.Usuario;
import sch.uv.mx.modelo.Vivienda;
import sch.uv.mx.servicios.ComentarioService;
import sch.uv.mx.servicios.ViviendaService;

import java.util.List;

@Controller
@RequestMapping("/vivienda")
public class ViviendaController
{
    @Autowired
    private final ViviendaService viviServ;

    public ViviendaController(ViviendaService serv)
    {
        this.viviServ = serv;
    }

    @PostMapping
    @ResponseBody
    public ResponseEntity<Vivienda> agregarVivienda(@RequestBody ViviendaDTO vivi, HttpSession session)
    {
        return new ResponseEntity<>(
                this.viviServ.agregarVivienda(vivi, session),
                HttpStatus.CREATED
        );
    }

    @GetMapping("/list/ciudad/{ciudad}")
    public ResponseEntity<List<Vivienda>> buscarTodoPorCiudad(@PathVariable String ciudad)
    {
        return ResponseEntity.ok(
                this.viviServ.buscarTodoPorCiudad(ciudad)
        );
    }

    @GetMapping("/list/codpostal/{codPostal}")
    public ResponseEntity<List<Vivienda>> buscarTodoPorCodigoPostal(@PathVariable Integer codPostal)
    {
        return ResponseEntity.ok(
                this.viviServ.buscarTodoPorCodigoPostal(codPostal)
        );
    }

    @GetMapping("/list/colonia/{colonia}")
    public ResponseEntity<List<Vivienda>> buscarTodoPorColonia(@PathVariable String colonia)
    {
        return ResponseEntity.ok(
                this.viviServ.buscarTodoPorColonia(colonia)
        );
    }

    @GetMapping("/list")
    public ResponseEntity<List<Vivienda>> buscarTodo()
    {
        return ResponseEntity.ok(this.viviServ.buscarTodo());
    }
}
