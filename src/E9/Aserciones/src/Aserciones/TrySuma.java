package Aserciones;
import  java.util.Scanner;
import java.util.InputMismatchException;
public class TrySuma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Ingresé un número > 5");
            int numero = scanner.nextInt();
            if (numero > 5) {
                System.out.println("Es menor que 5, número ingresado: " + numero);
            } else {
                System.out.println("Número válido" + numero);
            };
        }catch (Exception e){
            System.out.println("Dato ingresado no válido");
        } finally {
            scanner.close();
            System.out.println("Programa finalizado");
        }
    }
}
