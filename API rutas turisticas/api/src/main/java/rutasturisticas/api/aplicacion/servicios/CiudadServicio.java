package rutasturisticas.api.aplicacion.servicios;

import java.util.List;
import org.springframework.stereotype.Service;
import rutasturisticas.api.dominio.entidades.Ciudad;
import rutasturisticas.api.infraestructura.repositorios.ICiudadRepositorio;


@Service
public class CiudadServicio {

    private final ICiudadRepositorio repositorio;

    CiudadServicio(ICiudadRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public List<Ciudad> listar() {
        return repositorio.findAll();
    }

    public Ciudad get(int id) {
        return repositorio.findById(id).get();
    }

    public Ciudad agregar(Ciudad ciudad) {
        ciudad.setId(0);
        return repositorio.save(ciudad);
    }

    public Ciudad modificar(Ciudad ciudad) {
        return repositorio.findById(ciudad.getId()).isPresent() ? repositorio.save(ciudad) : null;
    }

    public boolean eliminar(int id) {
        try {
            repositorio.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    

}
