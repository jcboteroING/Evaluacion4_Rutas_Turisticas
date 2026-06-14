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
@Table(name = "ciudad")
public class Ciudad {

    
    @ManyToOne
    @JoinColumn(name = "idpais", referencedColumnName = "id", nullable = false)
    private Pais pais;

    @Column(name = "longitud", nullable = false)
    private double longitud;

    @Column(name = "latitud", nullable = false)
    private double latitud;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_ciudad")
    @SequenceGenerator(name = "secuencia_ciudad", sequenceName = "secuencia_ciudad", allocationSize = 1)

    @Column(name = "id")
    private int id;

    @Column(name = "nombre", length = 150, nullable = false, unique = true)
    private String nombre;

    public Ciudad() {
    }

    public Ciudad(Pais pais, double longitud, double latitud, int id, String nombre) {
        this.pais = pais;
        this.longitud = longitud;
        this.latitud = latitud;
        this.id = id;
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
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
