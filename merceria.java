import java.util.Scanner;

public class merceria {
    public static void main(String [] arg){

        int cantidad;
        double montoTotal,diferencia,montoConDescuento,descuento;


        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de productos");

        cantidad = teclado.nextInt();

        if (cantidad < 5){
            if (cantidad<0){

                System.out.println("No se permiten numeros negativos");

            }

            

            else{


            System.out.println("No se permiten compras inferior a 5 productos");

            }

        }

        else{


            System.out.println("Ingrese el monto total");

            teclado = new Scanner(System.in);

            montoTotal = teclado.nextDouble();



            if (cantidad>=5 && cantidad<=15) {
                
                System.out.println("El costo del envio es de 10$");
                montoTotal = montoTotal + 10;

            }
            else{

                System.out.println("El envio es gratis");   

                
            }

            if (montoTotal<100){


                diferencia = 100 - montoTotal;

                

                System.out.println("No hay promoción. Necesita " + diferencia + "$ para entrar en promo");

                



            }
            else{

                if (montoTotal >= 100 && montoTotal < 300){

                    descuento = (montoTotal * 5) / 100;

                    montoConDescuento = montoTotal - descuento;


                    System.out.println("Como supera los 100$, posee un descuento del 5% que es: " + descuento + "$. El monto total es: " + montoConDescuento + "$");




                }

                else{

                    descuento = (montoTotal * 10) / 100;

                    montoConDescuento = montoTotal - descuento;


                    System.out.println("Como supera los 300$, Posee un descuento del 10%, que es: " + descuento + "$. El monto total con el descuento queda como: " + montoConDescuento + "$");



                }







            }
            




        }
        teclado.close();





        
    }


    
}
