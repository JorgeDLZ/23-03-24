import java.util.*;
public class Vehiculos {

    protected String marca;
    protected String modelo;
    protected String anio;
    protected double precioxdia;
    protected boolean disponible;

    public Vehiculos() {
    }

    public Vehiculos(String marca, String modelo, String anio, double precioxdia, boolean disponib) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precioxdia = precioxdia;
        this.disponible = disponib;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public double getPrecioxdia() {
        return precioxdia;
    }

    public void setPrecioxdia(double precioxdia) {
        this.precioxdia = precioxdia;
    }

    public boolean isDisponib() {
        return disponible;
    }

    public void setDisponib(boolean disponib) {
        this.disponible = disponib;
    }

    @Override
    public String toString() {
        return "Vehiculos{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio='" + anio + '\'' +
                ", precioxdia=" + precioxdia +
                ", disponib=" + disponible +
                '}';
    }

    public static void realizarAlquiler(List<Vehiculos> lstvehiculos, List<Clientes> lstclientes, Scanner scanner) {

        System.out.println("Vehículos disponibles:");
        int cont = 0;
        for (int i = 0; i < lstvehiculos.size(); i++) {
            Vehiculos vehiculo = lstvehiculos.get(i);
            if (vehiculo.isDisponib()) {
                System.out.println(i + " - " + vehiculo.toString());
                cont++;

            } else if (cont == 0) {
                System.out.println("No hay vehículos disponibles para alquilar.");
                return;
            }


        }

    }

    public void calcularPreciofinal(){
        double dias;
        if (dias>7){
            dias = dias*precioxdia-(precioxdia*0.10);
            System.out.println("EL COSTO TOTAL ES: "+ dias);
        }else if (dias<=7){
            dias=dias*precioxdia;
            System.out.println("EL COSTO TOTAL ES: "+ dias);
        }

    }
}
