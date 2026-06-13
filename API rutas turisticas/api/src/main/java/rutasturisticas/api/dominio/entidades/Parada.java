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
@Table(name = "parada")

public class Parada {

    @ManyToOne
    @JoinColumn(name = "id_ruta", referencedColumnName = "id", nullable = false)
    private Ruta ruta;

    @Column(name = "longitud", nullable = false)
    private double longitud;

    @Column(name = "latitud", nullable = false)
    private double latitud;

    @Column(name = "tiempo", nullable = false)
    private double tiempo;

    @Column(name = "descripcion", length = 250)
    private String descripcion;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_parada")
    @SequenceGenerator(name = "secuencia_parada", sequenceName = "secuencia_parada", allocationSize = 1)

    @Column(name = "id")
    private int id;

    @Column(name = "parada", length = 250, nullable = false)
    private String nombre;

    @Column(name = "orden", nullable = false)
    private int orden;

    public Parada() {
    }

    public Parada(Ruta ruta, double longitud, double latitud, double tiempo, String descripcion, int id, String nombre,
            int orden) {
        this.ruta = ruta;
        this.longitud = longitud;
        this.latitud = latitud;
        this.tiempo = tiempo;
        this.descripcion = descripcion;
        this.id = id;
        this.nombre = nombre;
        this.orden = orden;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
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

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
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

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }





}
