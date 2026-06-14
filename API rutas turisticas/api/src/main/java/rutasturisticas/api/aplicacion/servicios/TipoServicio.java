package rutasturisticas.api.aplicacion.servicios;

import java.util.List;

import org.springframework.stereotype.Service;


import rutasturisticas.api.dominio.entidades.Tipo;
import rutasturisticas.api.infraestructura.repositorios.ITipoRepositorio;

@Service
public class TipoServicio {

    private ITipoRepositorio repositorio;
    
    TipoServicio(ITipoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

       public List<Tipo> listar() {
        return repositorio.findAll();
    }

    public Tipo get(int id) {
        return repositorio.findById(id).get();
    }

    public Tipo agregar(Tipo tipo) {
        tipo.setId(0);
        return repositorio.save(tipo);
    }

    public Tipo modificar(Tipo tipo) {
        return repositorio.findById(tipo.getId()).isPresent() ? repositorio.save(tipo) : null;
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
