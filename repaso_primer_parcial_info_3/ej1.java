import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * ej1 Hacer un método que reciba una lista y una pila, el método deberá modificar
la lista original, eliminando las posiciones indicadas por cada nodo de la pila.
Lista -> 2 ->4 ->6 ->8 ->9 ->3
Pila -> 2 5
Lista nueva-> 2 ->6 ->8 ->9
 */
public class ej1 {
    public static void main(String[] args) {
        
        List <Integer> lista = new ArrayList<>();

        Stack <Integer> pila = new Stack<>();

        Scanner scan = new Scanner(System.in);

        Boolean exit = false;

        System.out.println("Ingrese numeros en la lista");
        System.out.println("Si desea salir ingrese una letra");

        lista.add(2);
        lista.add(4);
        lista.add(6);
        lista.add(8);
        lista.add(9);
        lista.add(3);

        pila.add(2);
        pila.add(5);

        lista = eliminar(lista, pila);

        for (int i = 0; i < lista.size(); i++) {
            
            System.out.println(lista.get(i) + "-" );

        }

       /*  
        int x = 0;      

        while (exit == false) { 
            
            x = scan.nextInt();
            
            lista.add(x);

            try {
               
                
            } catch (Exception e) {
                exit = true;
            }
        }

        exit = false;

        System.out.println("Ingrese las posiciones que debe borrar");
        System.out.println("Si desea salir ingrese una letra");

        while (exit == false) { 
            
            x = scan.nextInt();
            
            pila.push(x);

            try {
               
                
            } catch (Exception e) {
                exit = true;
            }
        }

        scan.close();
*/
    }
    
    public static List<Integer> eliminar(List<Integer> lista, Stack<Integer> pila){

        while (!pila.isEmpty()) {

            lista.remove(lista.get((pila.pop())-1));
        }
        
        return lista;

    }



}