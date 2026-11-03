import java.util.Scanner;
public class Condicionales_2 {
    public static void main(String[]args){
        Scanner num1=new Scanner(System.in);
        System.out.println("Dime una letra y te dire si es mayuscula o minuscula");
        char letra =num1.next().charAt(0);
        if (letra>=65&&letra<=90){
            System.out.println("La letra introducida es mayuscula");
        }
        else{
            System.out.println("La letra introducida es minuscula");
        }
    }
}
