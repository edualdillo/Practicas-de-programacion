import java.util.Scanner;
public class Bucles_6 {
    public static void main(String[]args){
        Scanner num1=new Scanner(System.in);
        int contra=0;
        byte intento=5;

        while (contra!=1234&&intento>0) {
            System.out.println("Introduce la contraseña, tienes "+intento+" intentos");
            contra = num1.nextInt();
            intento--;
            if (contra!=1234&&intento!=0){
                System.out.println("Contraseña incorrecta, intentalo de nuevo");
            }
        }

        if (contra==1234){
            System.out.println("Acceso permitido");
        }
        else {
            System.out.println("Acceso denegado");
        }
    }
}
