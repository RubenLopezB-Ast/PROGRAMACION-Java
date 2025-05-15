import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        /*CONDICIONALES AVANZADO*/
        /*
        Escriba un programa en Java que reciba tres números enteros e identifique si pueden representar los lados de un
        triángulo. Si lo son determina el tipo de triángulo:

        -Equilátero: Todos los lados son iguales a=b=c
        -Isósceles: Dos lados son iguales
        -Escaleno: Todos los lados son diferentes

        Y también comprobar si un triángulo rectángulo.
        a*a + b+b = c*c

        PSEUDOCÓDIGO

        INICIO
        1º Introducir a
        2º Introducir b
        3º Introducir c
        4º Comprobar que con a b y c se pueda formar un triángulo.  a+b>c también a+c>b y también b+a>c
        5º En caso de que no se pudiese mostraremos el texto no es un triángulo valido
        6º En caso de que si se pudiera comprobaremos el tipo de triángulo a=b=c
        8º Comprobamos si es un triángulo iosceles. a=b o a=c o b=c
        9º Comprobamos si es escaleno. Todos los lados son diferentes.
        10º Comprobamos si es un triángulo rectángulo (Teorema pitagoras) a+a + b*b = c*c

        FIN
         */
        Scanner sc = new Scanner(System.in);
        int ladoA, ladoB, ladoC;
        System.out.println("Introduce lado A: ");
        ladoA = sc.nextInt();
        System.out.println("Introduce lado B: ");
        ladoB = sc.nextInt();
        System.out.println("Introduce lado C: ");
        ladoC = sc.nextInt();

        if (ladoA + ladoB > ladoC && ladoB +ladoC> ladoA && ladoC+ladoA>ladoB){
            System.out.println("Es un tríangulo válido.");
            if (ladoA == ladoB && ladoB == ladoC) {
                System.out.println("Es un triángulo equilátero");
            }else if(ladoA == ladoB || ladoA == ladoC || ladoB == ladoC){
                System.out.println("Es un triángulo isosceles");
            }else{
                System.out.println("Es un triángulo escaleno");
            }
            if((ladoA*ladoA)+(ladoB*ladoB)==(ladoC*ladoC)||(ladoA*ladoA) + (ladoC*ladoC)==(ladoB*ladoB) || (ladoB*ladoB)+(ladoC*ladoC)==(ladoA*ladoA)){
                System.out.println("Además es un triangulo rectángulo");
            }
        }else{
            System.out.println("No es un triángulo válido.");
        }
/*
        *
        * Crear un programa en Java que lea una cadena de texto y convierta cada carácter en un número según su posición en la cadena y su código ASCII. El cifrado será una secuencia de números separados por guiones (-).
        Instrucciones:
        *
        El programa debe pedir al usuario una cadena de texto.

        Recorre la cadena carácter por carácter usando un bucle for.

        Para cada carácter:

        Calcula su código ASCII (int codigo = (int) caracter;).

        Si la posición del carácter es par, usa un while para sumar un valor extra a su código (por ejemplo, suma 1 tantas veces como la posición indique).

        Si la posición es impar, réstale 1 directamente al código.

        Une todos los valores cifrados en un solo texto, separados por guiones (-).

        Muestra la cadena cifrada al usuario.

        Usa un bucle do-while para permitir cifrar otra cadena hasta que el usuario escriba "STOP".

        Ejemplo de ejecución:

        Introduce una cadena a cifrar:
        Hola
        Cadena cifrada: 73-110-111-100

        ¿Quieres cifrar otra cadena? (escribe STOP para salir):
        Hi
        Cadena cifrada: 73-104

        ¿Quieres cifrar otra cadena? (escribe STOP para salir):
        STOP
        Programa terminado.
        *
        * */


        /*
         * INICIO
         *
         *   1. Hacemos un bucle do-while en el cual comprobamos que la palabra que nos introduzca no sea STOP. Si es STOP parar el programa.
         *   2. Pedimos la cadena a cifrar.
         *   3. Creamos un bucle for, empezando desde el 0, hasta la longitud de la cadena. Haciendo cada vuelta la traducción a codigo ASCII. (int codigo = (int) caracter;).
         *   4. Según hagamos la traducción comprobamos si es par o impar. Si es impar restar 1 al resultado.
         *   5. Si es par. Vamos a ir desde el 0 hasta la posición del codigo ASCII. H -> 10. 0<10 -> ++1. Con un bucle while
         *   6. Añadir el guión, para ello comprobamos que no sea el último caracter.
         *   7. Imprimir resultado una vez se hay hecho todo.
         *   8. Preguntar si quiero cigrar otra cadena.
         *
         * FIN
         * */

        Scanner scn = new Scanner(System.in);
        String texto, resultado = "";
        int codigo;
        char c;

        do{
            System.out.println("Intrdozca una cadena a cifrar");
            texto = scn.nextLine();

            for(int i = 0;i<texto.length();i++){
                c = texto.charAt(i); // int a = array[8]
                codigo = (int) c;
                if(i % 2 == 0){
                    int contador = 0;
                    while(contador < i){
                        codigo++;
                        contador++;
                    }

                }else{
                    codigo--;
                }

                resultado = resultado + codigo;

                if(i < texto.length() - 1){
                    resultado = resultado + "-";
                }

            }
            System.out.println("Cadena cifrada: "+resultado);

            System.out.println("¿Quieres cifrar otra cadena? (Escribe STOP para salir):");
            texto = scn.nextLine();

        }while(!texto.equals("STOP"));

    }
}
