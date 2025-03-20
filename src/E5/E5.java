//NIVEL BAJO(FACIL)
// Ejercicio 1: Clasificación de edad
//    Pide al usuario su edad e imprime si es menor de edad, adulto o adulto
//    mayor.
//import javax.swing.*;
package E5;
import java.util.Scanner;
public class E5 {
    public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//        System.out.println("Dime tu edad:");
//        int edad = scanner.nextInt();
//        if (edad<18) {
//            System.out.println("Eres menor de edad");
//        } else if (edad>=18 && edad<=67){
//            System.out.println("Eres mayor de edad");
//        }else{
//            System.out.println("Puedes jubilarte");
//        }
//        scanner.close();
//    }
//}
//Ejercicio 2: Contador de vocales
//Pide al usuario una palabra y cuenta cuántas vocales tiene.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe una palabra");
        String palabra = scanner.nextLine().toUpperCase().replace("Á","A").replace("É","E").replace("Í","I").replace("Ó","O").replace("Ú","U");// todo a mayusculas
// Y SIN ACENTOS
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++){
            char letra = palabra.charAt(i);
            if ("AEIOU".indexOf(letra) != -1) {
                contador++;
            }
        }
        System.out.println("El número de vocales de la palabra es: " + contador);
        scanner.close();
    }
}
