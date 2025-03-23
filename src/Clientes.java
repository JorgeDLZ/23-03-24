public class Clientes {
    protected String nombre;
    protected String cedula;
    protected String licenciaC;

    public Clientes() {
    }

    public Clientes(String nombre, String cedula, String licenciaC) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.licenciaC = licenciaC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getLicenciaC() {
        return licenciaC;
    }

    public void setLicenciaC(String licenciaC) {
        this.licenciaC = licenciaC;
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", licenciaC='" + licenciaC + '\'' +
                '}';
    }

}
