import java.util.Scanner;

public class Bucles_16 {
    public static void main (String[] args){

        Scanner num1=new Scanner(System.in);
        System.out.println("Dime 2 numeros y te dire el cociente y el resto del primero por el segundo");

        int dividendo = num1.nextInt();
        int divisor = num1.nextInt();
        int cociente =0;

        while (dividendo<0||divisor<0){
            System.out.println("Uno de los valores ingresados es negativo, vuelve a introducirlos");
            dividendo= num1.nextInt();
            divisor= num1.nextInt();
        }
        
        while (divisor<dividendo){
            dividendo=dividendo-divisor;
            cociente++;
        }

        System.out.println("El cociente es "+cociente+" y el resto es "+dividendo);
    }
}
