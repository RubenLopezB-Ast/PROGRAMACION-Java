package funciones.java;

public class Main {
    public static void main(String[] args) {
        String name = "Maria";
        System.out.println(saluda2(name));
        saludar();

        saludar(name);

        saludar( "Juan");

        System.out.println(sumar());
        System.out.println(sumar(2,3,4,5,443,43,22,1));
        if(esPar(3)){
            System.out.println("Es par");
        }else {
            System.out.println("No es par");
        }
        String email = "pepe@gmail.com";

        String nombreUsuario = email.substring(0, email.indexOf("@"));
        System.out.println(nombreUsuario);

        String servidor = email.substring(email.indexOf("@")+1);
        System.out.println(servidor);

        int[] numeros = {1,12,3,44,56,7};
        System.out.println("La media es: " + calcularMedia(numeros));
    }
    //1. Imprime saludo
    public static void saludar(){
        System.out.println("Hola");
    }

    public static void saludar(String nombre)
    {
        System.out.println("Hola, " + nombre + "!");
    }

    public static String saluda2(String nombre) {
        System.out.println("Estoy componiendo...");
        return ("Hola, " + nombre);

    }

    public static int sumar(int n1, int n2) {
        return n1 + n2;
    }
    public static boolean esPar (int n1){
        if (n1 % 2 == 0){
            return true;
        }else {
            return false;
        }
    }

    public static int sumar(int... numeros) {
        int suma = 0;
        for (int n: numeros){
            suma += n;
        }
        return suma;
    }
    public static double calcularMedia(int[] numeros){
        int suma = 0;
        for (int n : numeros){
            suma += n;
        }
        return  (double) suma / numeros.length;
    }
}
