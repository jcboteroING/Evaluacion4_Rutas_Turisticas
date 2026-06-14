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

import rutasturisticas.api.aplicacion.servicios.TipoServicio;
import rutasturisticas.api.dominio.entidades.Tipo;

@RestController
@RequestMapping("/api/tipos")
public class TipoControlador {

    private final TipoServicio servicio;

    TipoControlador(TipoServicio servicio) {
        this.servicio = servicio;
    }

    @GetMapping("/")
    public List<Tipo> listar() {
        return servicio.listar();
    }

    @GetMapping("/{id}")
    public Tipo get(@PathVariable int id) {
        return servicio.get(id);
    }

    @PostMapping("/")
    public Tipo agregar(@RequestBody Tipo tipo) {
        return servicio.agregar(tipo);
    }

    @PutMapping("/")
    public Tipo modificar(@RequestBody Tipo tipo) {
        return servicio.modificar(tipo);
    }

    @DeleteMapping("/{id}")
    public boolean eliminar(@PathVariable int id) {
        return servicio.eliminar(id);
    }
    

   

}
