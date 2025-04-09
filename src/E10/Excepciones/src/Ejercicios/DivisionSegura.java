package Ejercicios;
//Objetivo: Añadir manejo de ArithmeticException y InputMismatchException
//Instrucción: Añade try-catch-finally para evitar que el programa falle si el divisor es cero
// o si se introduce texto.



import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el dividendo: ");
        try {                                      //Capturamos entrada de datos del scanner
            int a = sc.nextInt();

            System.out.print("Introduce el divisor: ");
            int b = sc.nextInt();

            int resultado = a / b;

            System.out.println("Resultado: " + resultado);
        } catch (InputMismatchException e) {     // Caracter no numérico
            System.out.println("Introduce un número no una letra o letras.");
        } catch (ArithmeticException e) {       // Divisor cero
            System.out.println("No se puede dividir entre 0");
        }finally {                             // No es obligatorio y siempre se ejecuta
            System.out.println("Fin del programa");
        }

        sc.close();

    }
}
