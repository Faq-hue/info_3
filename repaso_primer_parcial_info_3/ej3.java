
/* Ej3 Escribir una función recursiva que tenga un parámetro que sea entero
positivo y despliegue en la pantalla ese número de asteriscos: “*”, todos en
una línea.
*/

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        
        System.out.println("Ingrese el aprametro");
        
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();

        asterisco(n);
    }

    private static void asterisco(int n) {

        if(n == 0){
            return;
        }

        System.out.print("*");

        asterisco(n-1);

    }

}
