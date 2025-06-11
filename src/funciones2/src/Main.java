import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int []numeros = {2,3,343,4,2,33,2};
        System.out.println("La media es "+Math.round(calcularMedia(numeros))); // Pasar a entero o a double o a float con el round
        System.out.println("La media con dos decimales es: " + String.format("%.2f",calcularMedia(numeros))); // Se puede acotar el número de decimales con format en este caso dos

        Scanner ent = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num = ent.nextInt();

        if(esPar(num)){
            System.out.println("Es par");
        }else{
            System.out.println("No es par");
        }
        System.out.println(sumar(2,7));

        System.out.println(sumar(2,3,5,1));

        String name = "María";
        saludar();

        saludar(name);
        saludar("Juan");

        //Para ver saluda2 hay que hacer un sout
        System.out.println(saludar2(name));
    }

    //1. Imprime saludo
    public static void saludar() {
        System.out.println("Hola");
    }

    // Void para cuando no devuelve nada la función
    public static void saludar(String nombre) {
        System.out.println("Hola, " + nombre + "!");
    }

    //Ahora vamos a meter el tipo de dato que queremos que nos devuelva.
    // La salida no influye en la sobre carga.
    // Hay que cambiar los parámetros de entrada.

    public static String saludar2(String nombre) {
        //Vamos a poner un return para que nos devuelva algo
        return ("Hola, " + nombre + "!. Saludando con la función saluda2");
    }
    public static int sumar(int n1, int n2){
        return n1 + n2;
    }
    public static int sumar(int...numeros){
        int suma = 0;
        for (int n: numeros){
            suma = suma +n;
        }
        return suma;
    }
    public static boolean esPar (int n1){
        if (n1%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static double calcularMedia(int[]numeros){
        int suma = 0;
        for (int n : numeros){
            suma = suma + n;
        }
        return (double) suma / numeros.length;
    }
}



