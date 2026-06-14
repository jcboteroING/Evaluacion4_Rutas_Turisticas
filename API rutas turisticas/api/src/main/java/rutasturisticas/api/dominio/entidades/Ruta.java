package rutasturisticas.api.dominio.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "ruta")

public class Ruta {

    @ManyToOne
    @JoinColumn(name = "id_tipo", referencedColumnName = "id", nullable = false)
    private Tipo tipo;

    @ManyToOne
    @JoinColumn(name = "id_ciudad", referencedColumnName = "id", nullable = false)
    private Ciudad ciudad;

    @Column(name = "descripcion", length = 250, nullable = false)
    private String descripcion;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_ruta")
    @SequenceGenerator(name = "secuencia_ruta", sequenceName = "secuencia_ruta", allocationSize = 1)

    @Column(name = "id")
    private int id;

    @Column(name = "ruta", length = 250, nullable = false)
    private String nombre;

    public Ruta() {
    }

    public Ruta(Tipo tipo, Ciudad ciudad, String descripcion, int id, String nombre) {
        this.tipo = tipo;
        this.ciudad = ciudad;
        this.descripcion = descripcion;
        this.id = id;
        this.nombre = nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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



 

}
