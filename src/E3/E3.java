package E3;
import javax.xml.transform.Source;
public class E3 {


        public static void main(String[] args) {
            //DECLARAS UNA CONSTANTE CON L PALABRA FINAL
            final double PI = 3.1416;
            final int mayoriaEdad = 18;

            System.out.print("Est es pi: " + PI);
            System.out.print("La veradera edad adulta es " + mayoriaEdad);

            int numero1 = 5;
            int numero2 = 7;
            int suma = numero1 + numero2;
            //Operadores relacionales
            int x = 10;
            int y = 20;

            System.out.println("¿Es x igual a y?" + (x==y));
            System.out.println("¿Es diferente x de y?" + (x!=y));
            System.out.println("¿Es x mayor de y?" + (x>y));
            System.out.println("¿Es x menor que y?" + (x<y));
            //Operadores lógios. Es aquel que combina expresiones logicas
            boolean a = true;
            boolean b = false;

            System.out.println("a AND b: " + (a && b)); //y
            System.out.println("a OR b" +(a || b));
            System.out.println("NOT a" + (!a));

            int resultado = (10 + 5) * 2/3;
            int resultado2 = 10+5*2/3;
            System.out.println("El resultado de la expresión es: " + resultado);
            System.out.println("El resultado de la expresión es " + resultado2);
        }
    }
