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

import rutasturisticas.api.aplicacion.servicios.PaisServicio;
import rutasturisticas.api.dominio.entidades.Pais;

@RestController
@RequestMapping("/api/paises")
public class PaisControlador {

    private final PaisServicio servicio;

    PaisControlador(PaisServicio servicio) {
        this.servicio = servicio;
    }

    @GetMapping("/")
    public List<Pais> listar() {
        return servicio.listar();
    }

    @GetMapping("/{id}")
    public Pais get(@PathVariable int id) {
        return servicio.get(id);
    }

    @PostMapping("/")
    public Pais agregar(@RequestBody Pais pais) {
        return servicio.agregar(pais);
    }

    @PutMapping("/")
    public Pais modificar(@RequestBody Pais pais) {
        return servicio.modificar(pais);
    }

    @DeleteMapping("/{id}")
    public boolean eliminar(@PathVariable int id) {
        return servicio.eliminar(id);
    }
    



}
