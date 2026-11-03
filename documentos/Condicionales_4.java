import java.util.Scanner;
public class Condicionales_4 {
    public static void main(String[] args){
        Scanner num1=new Scanner(System.in);
        System.out.println("Dime un numero y te digo a que dia de la semana corresponde");
        byte dia= num1.nextByte();
        switch (dia){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Dia laboral");
                break;
            case 6:
            case 7:
                System.out.println("Fin de semana");
                break;
            default:
                System.out.println("Numero invalido");
                break;
        }
    }
}
