package rutasturisticas.api.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rutasturisticas.api.dominio.entidades.CiudadId;

@Repository
public interface Ciudad extends JpaRepository<Ciudad, CiudadId> {

}
