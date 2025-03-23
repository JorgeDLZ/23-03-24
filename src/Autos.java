public class Autos extends Vehiculos {
    protected String numeroPuertas;

    public Autos(String marca, String modelo, String anio, double precioxdia, boolean disponib, String numeroPuertas) {
        super(marca, modelo, anio, precioxdia, disponib);
        this.numeroPuertas = numeroPuertas;
    }

    public String getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(String numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return "Autos{" +
                "numeroPuertas='" + numeroPuertas + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio='" + anio + '\'' +
                ", precioxdia=" + precioxdia +
                ", disponible=" + disponible +
                '}';
    }





}
