
/* Ej2 Escriba una función void recursiva que reciba como parámetro solo un
entero positivo n y que despliegue todos los enteros impares menores a n.
*/

import java.util.Scanner;

public class ej2 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un numero para ver todos los enteros impares menores a el numero ingresado");

        int n = scan.nextInt();

        impar(n);

        scan.close();
    }

    private static void impar(int n) {
    
        if (n <= 0) {
            return;
        }

        n--;

        if ( n%2 != 0 ) {

            System.out.println(n);
        }

        impar(n);
    
    }

}
