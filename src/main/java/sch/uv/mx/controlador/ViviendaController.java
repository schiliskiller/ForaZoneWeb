package sch.uv.mx.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sch.uv.mx.modelo.DTO.ViviendaDTO;
import sch.uv.mx.modelo.Vivienda;
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
    public ResponseEntity<Vivienda> agregarVivienda(@RequestBody ViviendaDTO vivi)
    {
        return new ResponseEntity<>(
                this.viviServ.agregarVivienda(vivi),
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
