import java.util.Scanner;

public class While {
    public static void main(String[] args) {


        boolean bandera = true;

        int contador = 0;


        Scanner teclado = new Scanner(System.in);

        String respuesta;
        
        /* 
        while (contador<10) {
            
            System.out.println("El numero de vuelta es: " + contador);

            contador ++;
            
        }
        */

        
        
        while (bandera == true){

            System.out.println("Queres jugar ?" + bandera);

            respuesta = teclado.next();
            if (respuesta.equalsIgnoreCase("no")){

            System.out.println("Saliendo..");

            bandera = false;
            }
            
    



        }

        
        teclado.close();


        
        
        
        
        
       













        
    

        

    }









}
