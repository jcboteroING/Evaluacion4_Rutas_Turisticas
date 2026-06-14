package rutasturisticas.api.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;


import rutasturisticas.api.dominio.entidades.RutaId;


public interface IRutaRepositorio extends JpaRepository<IRutaRepositorio, RutaId> {

}
