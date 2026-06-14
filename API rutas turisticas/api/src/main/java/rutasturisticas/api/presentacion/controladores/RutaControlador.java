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

import rutasturisticas.api.aplicacion.servicios.RutaServicio;
import rutasturisticas.api.dominio.entidades.Ruta;

@RestController
@RequestMapping("/api/rutas")
public class RutaControlador {

    private final RutaServicio servicio;
    
    RutaControlador(RutaServicio servicio) {
        this.servicio = servicio;
    }

    @GetMapping("/")
    public List<Ruta> listar() {
        return servicio.listar();
    }

    @GetMapping("/{id}")
    public Ruta get(@PathVariable int id) {
        return servicio.get(id);
    }

    @PostMapping("/")
    public Ruta agregar(@RequestBody Ruta ruta) {
        return servicio.agregar(ruta);
    }

    @PutMapping("/")
    public Ruta modificar(@RequestBody Ruta ruta) {
        return servicio.modificar(ruta);
    }

    @DeleteMapping("/{id}")
    public boolean eliminar(@PathVariable int id) {
        return servicio.eliminar(id);
    }
    
    @GetMapping("/ciudad/{idCiudad}")
    public List<Ruta> listarPorCiudad(@PathVariable int idCiudad) {
        return servicio.listarPorCiudad(idCiudad);
}

}
