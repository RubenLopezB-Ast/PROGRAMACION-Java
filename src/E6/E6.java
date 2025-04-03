package E6;
import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        int numero;
//
//        while(true){
//            System.out.println("Introduce un número y pon 0 para salir");
//            numero = sc.nextInt();
//            if (numero == 0){
//                //Si es cero, como pide el enunciado, salfo del bucle
//                break;
//            }
//            System.out.println("Has introducido:" + numero);
//        }
//        System.out.println("Programa finalizado.");
//        sc.close();

//        for (int i = 1; i <= 0; i++) {
//            if (i % 3 == 0) {
//                break;
//            }
//            System.out.println(i);
//
// }
//        for(int i=1;i<=20;i++){
//            if(i==7){
//                System.out.println("Has encontrado el numero 7");
//                break;
//            }
//            System.out.println("Probadno qeu se ve con: " + i);
//        }
        String palabra = "PROGRAMACION";
        for (int i = 0;i<palabra.length();i++){
            char letra = palabra.charAt(i);
            if(letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U'){
                continue;
            }
            System.out.println(letra);
        }
    }
}
