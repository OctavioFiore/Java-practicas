import java.util.Scanner;

public class ejercicio {

    public static void main(String[] args) {

        int edad;

        Scanner teclado = new Scanner(System.in); 

        System.out.println("Ingrese su edad");

        edad = teclado.nextInt();

        if (edad > 18){
            System.out.println("Sos mayor de edad");
            if (edad>40){

                System.out.println("Sos generacion x");

            }

            else {

                System.out.println("Sos mili o generacion de cristal");
            }


            

            

        }
        else{
            if(edad == 18)
                {
                System.out.println("Tiene 18 años");




            }
            else{


                System.out.println("Sos menor de edad");
            }

            

        }

        System.out.println("Llego al final");

        
    }




    
}
