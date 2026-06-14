package rutasturisticas.api.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;


import rutasturisticas.api.dominio.entidades.Pais;


public interface IPaisRepositorio extends JpaRepository<Pais, Integer> {

}
