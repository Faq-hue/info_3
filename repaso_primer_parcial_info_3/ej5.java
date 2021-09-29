
/*Ej5 Hacer una función que dada una frase ingresada por teclado la imprima
invertida. Implementar la función con la estructura de datos vista más
adecuada. (3p)
Por Ejemplo: “una imagen vale por mil palabras” debe convertirse en
“palabras mil por vale imagen una”. */

import java.util.Scanner;
import java.util.Stack;

public class ej5 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        Stack<String> pila = new Stack<>();

        System.out.println("Ingrese la frase a invertir");

        String frase = scan.nextLine();

        String[] a = frase.split(" "); 

        for (int i = 0; i < a.length; i++) {
            
            pila.push(a[i]);

        }

        inversor(pila);

        scan.close();
    }

    private static void inversor(Stack<String> pila) {
        
        try {
            
            System.out.print(pila.pop() + " ");
        
            inversor(pila);


        } catch (Exception e) {
            //TODO: handle exception
        }

        
    }
}
