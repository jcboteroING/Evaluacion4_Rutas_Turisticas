package rutasturisticas.api.aplicacion.servicios;

import java.util.List;
import org.springframework.stereotype.Service;
import rutasturisticas.api.dominio.entidades.Pais;
import rutasturisticas.api.infraestructura.repositorios.IPaisRepositorio;

@Service
public class PaisServicio {

    private final IPaisRepositorio repositorio;

    PaisServicio(IPaisRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public List<Pais> listar() {
        return repositorio.findAll();
    }

    public Pais get(int id) {
        return repositorio.findById(id).get();
    }

    public Pais agregar(Pais pais) {
        pais.setId(0); 
        return repositorio.save(pais);
    }

    public Pais modificar(Pais pais) {
        return repositorio.findById(pais.getId()).isPresent() ? repositorio.save(pais) : null;
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
