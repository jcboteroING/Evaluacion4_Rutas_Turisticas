package rutasturisticas.api.aplicacion.servicios;

import java.util.List;
import org.springframework.stereotype.Service;
import rutasturisticas.api.dominio.entidades.Ruta;
import rutasturisticas.api.infraestructura.repositorios.IRutaRepositorio;

@Service
public class RutaServicio {

    private final IRutaRepositorio repositorio;

    RutaServicio(IRutaRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public List<Ruta> listar() {
        return repositorio.findAll();
    }

    public Ruta get(int id) {
        return repositorio.findById(id).get();
    }

    public Ruta agregar(Ruta ruta) {
        ruta.setId(0);
        return repositorio.save(ruta);
    }

    public Ruta modificar(Ruta ruta) {
        return repositorio.findById(ruta.getId()).isPresent() ? repositorio.save(ruta) : null;
    }

    public boolean eliminar(int id) {
        try {
            repositorio.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Ruta> listarPorCiudad(int idCiudad) {
        return repositorio.findByCiudadId(idCiudad);
    }

}
