import java.util.Scanner;
public class Bucles_11 {
    public static void main(String[]args){
       Scanner num1=new Scanner(System.in);
       System.out.println("Dime numeros enteros y los ire sumando hasta llegar a 100");
       int suma=0;
       byte total=0;
       while (suma<=100){
           int num2=num1.nextInt();
           suma=+num2;
           System.out.println(suma);
           total++;
       }
       System.out.println("El numero final da "+suma+" y el numero de sumas realizadas es de "+total);
    }
}
