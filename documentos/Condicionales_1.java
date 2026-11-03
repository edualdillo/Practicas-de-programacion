import java.util.Scanner;
public class Condicionales_1 {
    public static void main(String[] args) {
        Scanner num1=new Scanner(System.in);
        System.out.println("Dime el importe de la compra y te dire el coste de envio");
        int coste= num1.nextInt();
        if (coste<50){
            System.out.println("el importe es de "+coste+"€, pero como es menor de 50€, hay que añadirle los 4.95€, asique se quedaria en "+coste+4.95+"€");
        }
        else {
            System.out.println("el importe es de "+coste+"€, al cual no se le añade ningun coste de envio por ser de 50€ o mas");
        }
    }
}