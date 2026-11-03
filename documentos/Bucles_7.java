import java.util.Scanner;

public class Bucles_7 {
    public static void main(String[]args){

        Scanner num1=new Scanner(System.in);
        int contra=0;
        System.out.println("Introduce la contraseña");
        contra=num1.nextInt();

        while (contra!=1234) {
            System.out.println("Contraseña incorrecta, vuelve a intentarlo");
            contra = num1.nextInt();
        }
        System.out.println("Acceso permitido");
    }
}
