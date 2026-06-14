package rutasturisticas.api.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;


import rutasturisticas.api.dominio.entidades.Parada;


public interface IParadaRepositorio extends JpaRepository<Parada, Integer> {

}
