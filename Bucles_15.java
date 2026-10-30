import java.util.Scanner;
public class Bucles_15 {
    public static void main (String []args){
        Scanner num1=new Scanner(System.in);
        System.out.println("Dime una base entera y un exponente maximo y te muestro sus potencias");
        int num2=1;
        int base= num1.nextInt();
        int exponente= num1.nextInt();
        for (int i=0;i<exponente;i++){
            num2=num2*base;
            System.out.println(num2);
        }
    }
}
