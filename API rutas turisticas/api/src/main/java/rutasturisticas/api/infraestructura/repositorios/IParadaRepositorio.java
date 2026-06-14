package rutasturisticas.api.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;


import rutasturisticas.api.dominio.entidades.ParadaId;


public interface IParadaRepositorio extends JpaRepository<IParadaRepositorio, ParadaId> {

}
