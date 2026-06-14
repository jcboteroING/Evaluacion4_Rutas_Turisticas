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

import rutasturisticas.api.aplicacion.servicios.CiudadServicio;
import rutasturisticas.api.dominio.entidades.Ciudad;


@RestController
@RequestMapping("/api/ciudades")
public class CiudadControlador {

    private final CiudadServicio servicio;

    CiudadControlador(CiudadServicio servicio) {
        this.servicio = servicio;
    }


    @GetMapping("/")
    public List<Ciudad> listar() {
        return servicio.listar();
    }

    @GetMapping("/{id}")
    public Ciudad get(@PathVariable int id) {
        return servicio.get(id);
    }

    @PostMapping("/")
    public Ciudad agregar(@RequestBody Ciudad ciudad) {
        return servicio.agregar(ciudad);
    }

    @PutMapping("/")
    public Ciudad modificar(@RequestBody Ciudad ciudad) {
        return servicio.modificar(ciudad);
    }

    @DeleteMapping("/{id}")
    public boolean eliminar(@PathVariable int id) {
        return servicio.eliminar(id);
    }
    

    


}
