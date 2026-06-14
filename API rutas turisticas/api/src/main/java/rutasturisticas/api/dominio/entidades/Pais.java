package rutasturisticas.api.dominio.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "pais")

public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_pais")
    @SequenceGenerator(name = "secuencia_pais", sequenceName = "secuencia_pais", allocationSize = 1)

    @Column(name = "id")
    private int id;

    @Column(name = "pais", length = 100, nullable = false, unique = true)
    private String nombre;

    @Column(name = "codigo_alfa2", length = 2, nullable = false, unique = true)
    private String codigoAlfa2;

    public Pais() {
    }

    public Pais(int id, String nombre, String codigoAlfa2) {
        this.id = id;
        this.nombre = nombre;
        this.codigoAlfa2 = codigoAlfa2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoAlfa2() {
        return codigoAlfa2;
    }

    public void setCodigoAlfa2(String codigoAlfa2) {
        this.codigoAlfa2 = codigoAlfa2;
    }


    

}