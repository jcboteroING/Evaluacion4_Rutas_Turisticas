package rutasturisticas.api.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;


import rutasturisticas.api.dominio.entidades.Tipo;


public interface ITipoRepositorio extends JpaRepository<Tipo, Integer> {

}
