import java.util.Scanner;

public class merceria {
    public static void main(String [] arg){

        int cantidad;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de productos");

        cantidad = teclado.nextInt();

        if (cantidad < 5){
            if (cantidad<0){

                System.out.println("No se permiten numeros negativos");

            }

            System.out.println("No se permiten compras inferior a 5 productos");

        }

        else{

            if (cantidad>=5 && cantidad<=15) {
                
                System.out.println("El costo del envio es de 10$");

            }
            else{

                System.out.println("El envio es gratis");   

                
            }





        }
        teclado.close();





        
    }


    
}
