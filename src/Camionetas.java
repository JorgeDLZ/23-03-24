public class Camionetas extends Vehiculos{

    protected String capacidadCarga;

    public Camionetas(String marca, String modelo, String anio, double precioxdia, boolean disponib, String capacidadCarga) {
        super(marca, modelo, anio, precioxdia, disponib);
        this.capacidadCarga = capacidadCarga;
    }

    public String getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(String capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return "Camionetas{" +
                "capacidadCarga='" + capacidadCarga + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio='" + anio + '\'' +
                ", precioxdia=" + precioxdia +
                ", disponible=" + disponible +
                '}';
    }


}
