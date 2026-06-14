package rutasturisticas.api.infraestructura.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import rutasturisticas.api.dominio.entidades.Parada;


public interface IParadaRepositorio extends JpaRepository<Parada, Integer> {

    List<Parada> findByRutaId(int idRuta);

}
