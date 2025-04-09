package Ejercicios;
import java.util.Scanner;
//Objetivo: Añadir manejo de ArrayIndexOutOfBoundsException
//Instrucción: Usa try-catch para evitar error si se ingresa una posición
//incorrecta (como 5 o -1).
public class ArrayAcceso {
    public static void main(String[] args) {
        String[] frutas = {"Manzana", "Banana", "Naranja"};

        Scanner sc3 = new Scanner(System.in);
        System.out.print("Introduce un número entre 0 y 2: ");
        try {
            int posicion = sc3.nextInt();

            System.out.println("Fruta seleccionada: " + frutas[posicion]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Introduce una posición válida");
        }finally {
            System.out.println("Fin");
        }
        sc3.close();
    }
}
