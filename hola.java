
import java.util.Scanner;
public class hola { 



    /*hola gente de yt */
    public static void main(String[] args) {

        double num1,num2,suma;

        
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número");
        
        num1 = teclado.nextFloat();

        System.out.println("Ingrese el segundo número");

        num2 = teclado.nextFloat();

        suma = num1 / num2;

        System.out.println("La suma de " + num1 + " y " + num2 + " es : " + suma);


        teclado.close();
    }
}



