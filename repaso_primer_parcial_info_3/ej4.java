
/*Ej4 Escribir un método que busque en una lista enlazada el valor V y lo mueva a
la primera posición. */

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        
        List<Integer> lista = new LinkedList<>();

        lista.add(2);
        lista.add(4);
        lista.add(6);
        lista.add(8);
        lista.add(9);
        lista.add(3);

        System.out.println("Ingrese el parametro");
        
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();

        mover(n, lista);

        for (int i = 0; i < lista.size(); i++) {
            
            System.out.print(lista.get(i) + "-");

        }

        scan.close();
    }

    private static void mover(int n, List<Integer> lista) {
        
        lista.remove((Integer)n);

        lista.add(0, n);
    
    }
}
