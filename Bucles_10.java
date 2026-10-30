import java.util.Scanner;

public class Bucles_10 {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.println("Deletrea una palabra acabando con un . y te dire la palabra entera");
        StringBuilder palabra = new StringBuilder();
        char letra = num1.next().charAt(0);
        while (letra != '.') {
            palabra.append(letra);
            letra = num1.next().charAt(0);
        }
        System.out.println("La palabra completa es: " + palabra);
    }
}
