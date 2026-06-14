package rutasturisticas.api.dominio.entidades;

public class RutaId {

    private int tipo;
    private int ciudad;

    public RutaId() {}

    public RutaId(int tipo, int ciudad) {
        this.tipo = tipo;
        this.ciudad = ciudad;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getCiudad() {
        return ciudad;
    }

    public void setCiudad(int ciudad) {
        this.ciudad = ciudad;
    }

}
