import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        int opcion;
        
        String diaDeLaSemana;


        System.out.println("Ingrese un numero del 1 al 7");

        Scanner teclado = new Scanner(System.in);

        opcion = teclado.nextInt();

        switch (opcion){
            case 1: diaDeLaSemana="Lunes";

                
                break;

            case 2: diaDeLaSemana ="Martes";
                
                break;
            case 3: diaDeLaSemana = "Miercoles";

                
                break;
            case 4: diaDeLaSemana = "Jueves";
                
                break;
            case 5: diaDeLaSemana = "Viernes";

                
                break;
            case 6: diaDeLaSemana = "Sabado";
                
                break;
            case 7: diaDeLaSemana = "Domingo";
                
                break;

            default: diaDeLaSemana = "día de la semana incorrecto";
                
        
                




        




        }


        System.out.println("El día de la semana es: " + diaDeLaSemana);
        teclado.close();





        
    }
}
