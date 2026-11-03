import java.util.Scanner;
public class Condicionales_3 {
    public static void main(String[]args){
        Scanner num1=new Scanner(System.in);
        System.out.println("Dime las horas que el coche ha estado en el aparcamiento y te dire el importe a pagar");
        int horas= num1.nextInt();
        double coste=0;
        while(horas<0){
            System.out.println("El numero de horas introducidas son negativas, reintroduce el valor");
            horas=num1.nextInt();
        }
        if (horas>8){
            coste=12;
        }
        else {
            coste=(horas*1.5)+0.5;
        }
        System.out.println("El coste a pagar por "+horas+" horas es de "+coste+"€");
    }
}
