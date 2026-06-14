package rutasturisticas.api.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import rutasturisticas.api.dominio.entidades.Ciudad;


public interface ICiudadRepositorio extends JpaRepository<Ciudad, Integer> {

}
