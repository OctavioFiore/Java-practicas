import java.util.Scanner;

public class estacionamiento {
    public static void main(String[] args) {

        String patente = "";
        int tipoDeEstacionamiento, cantHoras, cont1 = 0, cont2 = 0, cont3 = 0;

        double valor, totalDelDia = 0;

        Scanner teclado = new Scanner(System.in);

        while (!patente.equalsIgnoreCase("fin")) {

            System.out.println("Ingrese la patente del vehiculo");
            patente = teclado.nextLine();

            if (patente.equalsIgnoreCase("fin")) {
                break;
            }

            System.out.println("Tipo de servicios:");
            System.out.println("1) Por hora");
            System.out.println("2) Media jornada (5 horas)");
            System.out.println("3) Jornada completa (hasta 10 horas)");

            tipoDeEstacionamiento = teclado.nextInt();
            teclado.nextLine(); 

            if (tipoDeEstacionamiento <= 0 || tipoDeEstacionamiento > 3) {

                System.out.println("Ingreso un tipo de servicio incorrecto");

            } else {

                if (tipoDeEstacionamiento == 1) {

                    System.out.println("Ingrese la cantidad de horas");
                    cantHoras = teclado.nextInt();
                    teclado.nextLine(); 

                    valor = cantHoras * 3;

                    System.out.println("El total de su estacionamiento es: " + valor);

                    cont1++;

                    totalDelDia = totalDelDia + valor;

                } else {

                    if (tipoDeEstacionamiento == 2) {

                        System.out.println("El servicio de media jornada corresponde a 5 hs y posee un 5% de descuento");

                        valor = 15 - (15 * 0.05);

                        totalDelDia = totalDelDia + valor;

                        System.out.println("El total de su estacionamiento es: " + valor);

                        cont2++;

                    } else {

                        System.out.println("El servicio de jornada completa corresponde a 10 hs y posee un 10% de descuento");

                        valor = 30 - (30 * 0.10);

                        System.out.println("El total de su estacionamiento es: " + valor);

                        cont3++;

                        totalDelDia = totalDelDia + valor;

                    }

                }

            }

        }

        System.out.println("Muchas gracias por su compra");
        System.out.println("Cantidad de servicio por hora es: " + cont1);
        System.out.println("Cantidad de servicio de media jornada es: " + cont2);
        System.out.println("Cantidad de servicio de jornada completa es: " + cont3);
        System.out.println("El monto total recaudado del dia es $" + totalDelDia + " USD");

        teclado.close();
    }
}
