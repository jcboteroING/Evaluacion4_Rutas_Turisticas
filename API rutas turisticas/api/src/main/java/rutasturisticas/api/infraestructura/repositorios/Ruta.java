package rutasturisticas.api.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rutasturisticas.api.dominio.entidades.RutaId;

@Repository
public interface Ruta extends JpaRepository<Ruta, RutaId> {

}
