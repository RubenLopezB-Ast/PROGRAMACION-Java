package E4;

import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        //Crea una constante llamada GRAVEDAD con el valor 9.81 y muestra su valor por pantalla.
        final double GRAVEDAD = 9.81; // Constante de tipo double
        System.out.println("El valor de la gravedad es: " + GRAVEDAD);

        // Declara dos variables a = 25 y b = 7. Realiza todas las operaciones aritméticas entre ellas e imprime los resultados.
        int a = 25;
        int b = 7;
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        System.out.println("Módulo: " + (a % b)); // Resto
        System.out.println("División con decimales: " + (double) a / b); //Duplicado a
        System.out.println("División con decimales otra formula: " + (a / (double) b));//Duplicado b


// Declara una variable edad e imprime si la persona es mayor de edad (>= 18) o menor de edad (< 18).

        var edad = 18;
        String mensajeEdad = (edad >= 18) ? "Quédate con nosotros tienes más de 18 años " : "Ehyyy vuelve dentro de un tiempo baby aún no tienes 18 años ";
        System.out.println(mensajeEdad);// Ir variando la edad de la variable.
// Crea un programa que reciba dos números y determine cuál es mayor, menor o si son iguales.

        int numberA = 112;
        int numberB = 12;
        if (numberA > numberB) {
            System.out.println("El mayor es el número A: " + numberA);
        } else if (numberA < numberB) {
            System.out.println("El mayor es el número B: " + numberB);
        } else {
            System.out.println("Pero si son iguales");
        }
        //Basado en lo anterior a continuación voy a crear un programa que en el que el usuario pueda escribir los números.

        Scanner nm = new Scanner(System.in);
        int n1, n2;
        System.out.println("Venga pon el primer número: ");
        n1 = nm.nextInt();
        System.out.println("Ahora el segundo: ");
        n2 = nm.nextInt();
        if (n1 > n2) {
            System.out.println("El mayor es el primer número : " + n1);
        } else if (n1 < n2) {
            System.out.println("El mayor es el segundo número : " + n2);
        } else {
            System.out.println("Pero si son iguales");
        }

// Escribe un programa que evalúe la siguiente expresión lógica: (5 > 3) && (10 < 20). ¿Cuál es el resultado?

        // Recuerda dar valores al ejercicio anterior para poder seguir a este. Está dentro de la misma clase.

        boolean resEval = (5>3)&&(10<20); // Este booleano debería dar True
        System.out.println("Esta expresión es: " + resEval);

        // Vamos a cambiar true por verdadera y false por falsa para la expresión del ejercicio
        boolean resul = (5>3)&&(10<20); // Este booleano debería dar True
        if (resul) {
            System.out.println("La expresión es verdadera.");
        }else{
            System.out.println("La expresión es falsa. ");
        }

        // Recuerda dar valores al ejercicio anterior para poder seguir a este. Está dentro de la misma clase.

// Modifica el programa anterior y evalúa también (5 > 3) || (10 > 20). Explica los resultados obtenidos.

        boolean resEval2 = (5>3)||(10<20); // Este booleano debería dar True
        System.out.println("Esta expresión es: " + resEval2);

        // Vamos a cambiar true por verdadera y false por falsa para la expresión del ejercicio
        boolean resul2 = (5>3)||(10<20); // Con el operador OR con que uno sea verdadero debería dar True.
        if (resul2) {
            System.out.println("La expresión es verdadera.");
        }else{
            System.out.println("La expresión es falsa. ");
        }

        // Recuerda dar valores al ejercicio anterior para poder seguir a este. Está dentro de la misma clase.

        // Declara tres variables x = 10, y = 20, z = 30. Compara x + y con z utilizando operadores relacionales.

        int x=10, y=20, z=30;
        System.out.println("¿X más Y, es igual a Z? " + (x+y==z)); // El resultado debe de ser true.

        // Recuerda dar valores al ejercicio anterior para poder seguir a este. Está dentro de la misma clase.

// Crea un programa que pida al usuario dos números y evalúe si son múltiplos (num1 % num2 == 0).

        Scanner m = new Scanner(System.in);
        int num1, num2;
        System.out.println("Venga pon el primer número: ");
        num1 = m.nextInt();
        System.out.println("Ahora el segundo: ");
        num2 = m.nextInt();
        if (num1 % num2 == 0) {
            System.out.println(num1 + " Es múltiplo de " + num2);
        } else if (num2 % num1 == 0) {
            System.out.println(num2 + " Es múltiplo de " + num1);
        } else if (num1 % num2 != 0){
            System.out.println(num1 + " no es múltiplo de " + num2);
        }else if (num1 % num2 != 0){
            System.out.println(num2 + " no es múltiplo de " + num1);
        }

        // Recuerda dar valores al ejercicio anterior para poder seguir a este. Está dentro de la misma clase.

        // Escribe un código que reciba un número e indique si es par o impar usando el operador módulo (%).

        Scanner poi = new Scanner(System.in);
        int nu1;
        System.out.println("Vamos escribe un número: ");
        nu1 = poi.nextInt();
        if (nu1 % 2 == 0) { // Si dividimos entre dos y el resto da o es un número PAR
            System.out.println(" El número " + nu1 + " es un número PAR");
        } else if (nu1 % 2 != 0) { // Si al dividir entre dos nos da un número diferente de cero es IMPAR
            System.out.println(" El número  " + nu1 + " es un número IMPAR");
        }

        // Recuerda dar valores al ejercicio anterior para poder seguir a este. Está dentro de la misma clase.

        // Define una constante TASA_CAMBIO con el valor 1.12 (dólar a euro). Convierte una cantidad de dólares ingresada por el usuario a euros.

        final double TASA_CAMBIO = 1.12; // 1 $ = 1.12€.
        Scanner cam = new Scanner(System.in);
        double Dollar;
        System.out.println("Cantidad en dollares $" );
        Dollar=cam.nextInt();
        double resultadoEuros = (Dollar / TASA_CAMBIO);
        System.out.println(Dollar + " son " + resultadoEuros + "€ .");
    }

}

