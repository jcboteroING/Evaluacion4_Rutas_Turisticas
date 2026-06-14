package rutasturisticas.api.presentacion.controladores;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import rutasturisticas.api.aplicacion.servicios.ParadaServicio;
import rutasturisticas.api.dominio.entidades.Parada;

@RestController
@RequestMapping("/api/paradas")
public class ParadaControlador {

    private final ParadaServicio servicio;

    ParadaControlador(ParadaServicio servicio) {
        this.servicio = servicio;
    }

    @GetMapping("/")
    public List<Parada> listar() {
        return servicio.listar();
    }

    @GetMapping("/{id}")
    public Parada get(@PathVariable int id) {
        return servicio.get(id);
    }

    @PostMapping("/")
    public Parada agregar(@RequestBody Parada parada) {
        return servicio.agregar(parada);
    }

    @PutMapping("/")
    public Parada modificar(@RequestBody Parada parada) {
        return servicio.modificar(parada);
    }

    @DeleteMapping("/{id}")
    public boolean eliminar(@PathVariable int id) {
        return servicio.eliminar(id);
    }
    
    @GetMapping("/ruta/{idRuta}")
    public List<Parada> listarPorRuta(@PathVariable int idRuta) {
        return servicio.listarPorRuta(idRuta);

        
    }



}
