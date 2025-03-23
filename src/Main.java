import java.util.*;

public class Main {
    public static void main(String[] args) {
        boolean estado=true;
        int op;
        double dias;

        List<Vehiculos> lstvehiculos=new ArrayList<>();
        List<Clientes> lstclientes=new ArrayList<>();

        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("""
                    1. REGISTRAR VEHICULO
                    2. REGISTRAR CLIENTE
                    3. REALIZAR ALQUILER
                    4. COSTO FINAL ALQUILER
                    5. LISTA VEHICULOS DISPONIBLES
                    6. REGISTRAR DEVOLUCION
                    7. SALIR
                    """);
            op=scanner.nextInt();

            switch (op){
                case 1 ->{
                    System.out.println("""
                            1. AUTOMOVIL
                            2. CAMIONETA
 
                            """);
                    op=scanner.nextInt();
                    switch (op){
                        case 1->{
                            System.out.println("AUTOMOVIL");
                            System.out.println("MARCA: ");
                            String marca=scanner.next();
                            System.out.println("MODELO: ");
                            String modelo=scanner.next();
                            System.out.println("AÑO: ");
                            String anio=scanner.next();
                            System.out.println("PRECIO POR DÍA: ");
                            double precioxdia=scanner.nextDouble();
                            System.out.println("DISPONIBILIDAD (TRUE/FALSE): ");
                            boolean dispon=scanner.nextBoolean();
                            System.out.println("NUMERO DE PUERTAS: ");
                            String numeroPuertas=scanner.next();

                            lstvehiculos.add(new Autos(marca,modelo,anio,precioxdia,dispon,numeroPuertas));

                        }
                        case 2->{
                            System.out.println("CAMIONETA");
                            System.out.println("MARCA: ");
                            String marca=scanner.next();
                            System.out.println("MODELO: ");
                            String modelo=scanner.next();
                            System.out.println("AÑO: ");
                            String anio=scanner.next();
                            System.out.println("PRECIO POR DÍA: ");
                            double precioxdia=scanner.nextDouble();
                            System.out.println("DISPONIBILIDAD (TRUE/FALSE): ");
                            boolean dispon=scanner.nextBoolean();
                            System.out.println("CAPACIDAD DE CARGA (KG): ");
                            String capacidadCarga=scanner.next();

                            lstvehiculos.add(new Camionetas(marca,modelo,anio,precioxdia,dispon,capacidadCarga));

                        }
                        default -> {
                            System.out.println("Opcion no valida");
                        }
                    }
                }
                case 2->{
                    System.out.println("INGRESE SU NOMBRE: ");
                    String nom=scanner.next();
                    System.out.println("INGRESE SU CEDULA: ");
                    String cc=scanner.next();
                    System.out.println("INGRESE SU N° LICENCIA DE CONDUCIR: ");
                    String licCon=scanner.next();

                    lstclientes.add(new Clientes(nom,cc,licCon));
                }
                case 3 -> {
                    System.out.println("""
                            DESEA ALQUILAR
                            1. AUTOMOVIL
                            2. CAMIONETA
                            """);
                    op=scanner.nextInt();
                    if(op==1){
                        Autos.realizarAlquiler(lstvehiculos, lstclientes, scanner);
                    } else if (op==2) {
                        Camionetas.realizarAlquiler(lstvehiculos,lstclientes,scanner);
                    } else {
                        System.out.println("Opción no válida");
                    }
                    System.out.println("ingrese su nombre: ");
                    String nom =scanner.next();
                    System.out.println("Ingrese la cantidad de dias del alquiler: ");
                    dias=scanner.nextDouble();

                }
                case 4 ->{
                    if (dias>7){
                        dias = dias*precioxdia-(precioxdia*0.10);
                        System.out.println("EL COSTO TOTAL ES: "+ dias);
                    }else if (dias<=7){
                        dias=dias*precioxdia;
                        System.out.println("EL COSTO TOTAL ES: "+ dias);
                    }
                }
            }



        } while(estado);




    }
}