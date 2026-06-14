package rutasturisticas.api.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rutasturisticas.api.dominio.entidades.ParadaId;

@Repository
public interface IParadaRepositorio extends JpaRepository<IParadaRepositorio, ParadaId> {

}
