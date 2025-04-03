package Aserciones;
import java.util.Scanner;
import java.util.InputMismatchException;
public class aserciones {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Ingresame un número: ");
            int numero = scanner.nextInt();
            System.out.println("El número ingresado es: " + numero);
        }catch (InputMismatchException e) {
            System.out.println("Número invalido");
        } finally {
            scanner.close();
            System.out.println("Programa finalizado");

        }

    }
}
