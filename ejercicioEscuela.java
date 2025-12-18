import java.util.Scanner;

public class ejercicioEscuela {
    public static void main(String[] args) {

        int edad;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la edad del alumno");

        edad = teclado.nextInt();

        if (edad >= 4 && edad <= 6) {

            System.out.println("Kinder (Lunes y miercoles de 16 a 17)");
        } else {

            if (edad >= 7 && edad <= 8) {

                System.out.println("Primer año (Martes y jueves de 16:30 a 17:30 ) ");
            }

            else {

                if (edad >= 9 && edad <= 10) {

                    System.out.println("Segundo año (Martes y jueves de 16:30 a 17:30 ) ");
                }

                else {

                    if (edad >= 11 && edad <= 13) {

                        System.out.println("Tercer año (Lunes y miercoles de 17 a 18:30");

                    }

                    else {

                        System.out.println("Ingreso una edad invalida5");
                    }

                }

            }
        }

        teclado.close();

    }

}
