package rutasturisticas.api.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import rutasturisticas.api.dominio.entidades.CiudadId;


public interface ICiudadRepositorio extends JpaRepository<ICiudadRepositorio, CiudadId> {

}
