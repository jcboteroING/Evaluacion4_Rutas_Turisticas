package rutasturisticas.api.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;


import rutasturisticas.api.dominio.entidades.Ruta;


public interface IRutaRepositorio extends JpaRepository<Ruta, Integer> {

}
