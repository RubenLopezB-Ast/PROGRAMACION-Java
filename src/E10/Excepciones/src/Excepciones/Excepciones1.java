package Excepciones;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Saludar\n2. Salir");
        System.out.println("Elige una opción");
        try {
            int opcion = entrada.nextInt();
            int resultado = 5 / opcion;
            switch (opcion) {
                case 1 -> {
                    System.out.println("Hola"); //dos líneas entre llaves
                    System.out.println("Hola");
                }
                case 2 ->
                        System.out.println("Saliendo..."); // una línea por case dentro de las llaves para todo el switch
                default -> System.out.println("Opción incorrecta");
            }
        } catch (
                InputMismatchException e) { //El valor que le dás a la variable no se corresponde con el que tienes que meter
            System.out.println("Debes de escribir un número");
        }catch (ArithmeticException e){
            System.out.println("División incorrecta");
    }finally{ //El finally siempre ocurre.
            System.out.println("FIN");
        }
        entrada.close();
    }
}
