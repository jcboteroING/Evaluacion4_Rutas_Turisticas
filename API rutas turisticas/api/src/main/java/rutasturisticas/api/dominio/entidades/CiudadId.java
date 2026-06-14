package rutasturisticas.api.dominio.entidades;

public class CiudadId {

    private int ciudad;

    public CiudadId() {}

    public CiudadId(int ciudad) {
        this.ciudad = ciudad;
    }

    public int getCiudad() {
        return ciudad;
    }
    public void setCiudad(int ciudad) {
        this.ciudad = ciudad;
    }

}
