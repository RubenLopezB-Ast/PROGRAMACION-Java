package E5;
//NIVEL BAJO(FACIL)
// Ejercicio 1: Clasificación de edad
//    Pide al usuario su edad e imprime si es menor de edad, adulto o adulto mayor.}
//import javax.swing.*;
//import java.util.Scanner;
//public class E5 {
//    public static void main(String[] args) {
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
//import java.util.Scanner;
//public class E5 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Escribe una palabra");
//        String palabra = scanner.nextLine().toUpperCase().replace("Á","A").replace("É","E").replace("Í","I").replace("Ó","O").replace("Ú","U");// todo a mayusculas
//// Y SIN ACENTOS
//        int contador = 0;
//        for (int i = 0; i < palabra.length(); i++){
//            char letra = palabra.charAt(i);
//            if ("AEIOU".indexOf(letra) != -1) {
//                contador++;
//            }
//        }
//        System.out.println("El número de vocales de la palabra es: " + contador);
//        scanner.close();
//    }
//}
//Ejercicios de Nivel Medio (Intermedio)
//Ejercicio 3: Simulación de una calculadora
//Crea un menú que permita sumar, restar, multiplicar y dividir dos números ingresados por el usuario.
//import java.util.Scanner;
//public class E5 {
//    public static void main(String[] args) {
//        Scanner Calcu = new Scanner(System.in);
//        System.out.println("Manú:");
//        System.out.println("1. Sumar");
//        System.out.println("2. Restar");
//        System.out.println("3. Multiplicar");
//        System.out.println("4. Dividir");
//        System.out.println("5. Resto");
//        System.out.println("Elige un opción:  ");
//
//        int operacion = Calcu.nextInt();
//
//        System.out.println("Número A");
//        double numA = Calcu.nextDouble();
//        System.out.println("Número B");
//        double numB = Calcu.nextDouble();
//
//        switch (operacion){
//            case 1:
//                System.out.println("Resultado de la suma: " + (numA + numB));
//                break;
//            case 2:
//                System.out.println("Resultado de la resta: " + (numA - numB));
//                break;
//            case 3:
//                System.out.println("Resultado de la multiplicación: " + (numA*numB));
//                break;
//            case 4:
//                if (numB !=0){
//                    System.out.println("Resultado de la división: " +(numA/numB));
//                }else{
//                    System.out.println("Error no se puede dividir entre cero");
//                }
//                break;
//            case 5:
//                if (numB !=0){
//                System.out.println("Resultado del resto de la división entre: "+numA+" y "+numB+" = " +(numA % numB));
//                }else{
//                    System.out.println("Error no se puede dividir entre cero");
//                }
//                break;
//        }
//Calcu.close();
//    }
//}
//
//Ejercicio 4: Números pares hasta N
//Pide un número al usuario y muestra todos los números pares desde 1 hasta ese número.
//import java.util.Scanner;
//public class E5 {
//    public static void main(String[] args) {
//        Scanner pares = new Scanner(System.in);
//        System.out.println("Escribe un número: ");
//        int numero_recogido = pares.nextInt();
//        for (int i = 2; i <= numero_recogido; i += 2) {
//            System.out.println(i + " ");
//        }
//        pares.close();
//    }
//}
//Ejercicio 5: Contraseña con intentos limitados
//Pide al usuario una contraseña. Solo tiene 3 intentos antes de bloquearse.
//import java.util.Scanner;
//public class E5 {
// public static void main(String[] args) {
//  Scanner contra = new Scanner(System.in);
//  String contraCorrecta = "Asturias";
//  int intentos = 3;
//  while (intentos>0) {
//   System.out.println("Introduce tu contraseña: ");
//   String contrasena = contra.nextLine();
//
//   if (contrasena.equals(contraCorrecta)) {
//    System.out.println("Acceso permitido");
//    return;
//   } else {
//    intentos--;
//    System.out.println("Contraseña erronea. Te quedan " + intentos + " intentos");
//   }
//  }
// System.out.println("Acceso bloqueado comunícate con un administrador.");
// contra.close();
//
// }
//}
//Ejercicio 6: Adivina el número
//Genera un número aleatorio entre 1 y 100 y deja que el usuario lo adivine con pistas.
//import java.util.Scanner;
//import java.util.Random;
//public class E5 {
// public static void main(String[] args){
//  Scanner adivina = new Scanner(System.in);
//  Random rand = new Random();
//  int numeroAleatorio = rand.nextInt(100)+1;
//  int intento;
//  do {
//   System.out.println("Venga adivina el numero entre uno y cien: ");
//   intento = adivina.nextInt();
//
//   if (intento < numeroAleatorio) {
//    System.out.println("Tu número es demasiado bajo.");
//   } else if (intento > numeroAleatorio) {
//    System.out.println("Tu número es demasiado alto.");
//   }
//  }while (intento != numeroAleatorio);
//  System.out.println("Wow has adividado el número, que evidentemente era " + intento);
//  adivina.close();
//
//   }
//  }
//Ejercicio 7: Serie Fibonacci
//Pide un número n y muestra los primeros n términos de la serie de Fibonacci.

import java.util.Scanner;
public class E5 {
    public static void main (String[] args){
        Scanner fibonacci = new Scanner(System.in);

        System.out.println("Escribe un número: ");
        int n = fibonacci.nextInt();
        int a = 0, b = 1, c;
        for (int i=0;i<n; i++){
            System.out.println(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
        fibonacci.close();
    }
}

//Hola Joa