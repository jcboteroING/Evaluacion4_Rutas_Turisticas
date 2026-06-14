package rutasturisticas.api.aplicacion.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import rutasturisticas.api.dominio.entidades.Parada;
import rutasturisticas.api.infraestructura.repositorios.IParadaRepositorio;

@Service
public class ParadaServicio {

    private IParadaRepositorio repositorio;

        ParadaServicio(IParadaRepositorio repositorio) {
            this.repositorio = repositorio;
        }

    public List<Parada> listar() {
        return repositorio.findAll();
    }

    public Parada get(int id) {
        return repositorio.findById(id).get();
    }

    public Parada agregar(Parada parada) {
        parada.setId(0);
        return repositorio.save(parada);
    }

    public Parada modificar(Parada parada) {
        return repositorio.findById(parada.getId()).isPresent() ? repositorio.save(parada) : null;
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
