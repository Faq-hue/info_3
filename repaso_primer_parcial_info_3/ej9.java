import java.util.LinkedList;

/**Ej9 Escribir un método recursivo de la clase lista que devuelva la suma de los
datos de los nodos mayores a un valor.
Ej:
Dado:
   1    2    3
3 -> 4 -> 7 -> 5
llamando a lista.sumatoria(4, inicio), devuelve 12 */

public class ej9 {
    public static void main(String[] args) {
        
        LinkedList<Integer> l = new LinkedList<>();

        l.add(3);
        l.add(4);
        l.add(7);
        l.add(5);

        System.out.println(sumatoria(5,l));
        

    }

    private static int sumatoria(int n, LinkedList<Integer> l) {

        if (l.size()-1 == 0) {
            
            return 0;
        }

        LinkedList<Integer> aux = l;

        aux.removeFirst();

        //System.out.println("Test: " + aux);

        if (l.get(0).compareTo(n) == 1) {
            
            return l.get(0) + sumatoria(n, aux);
        }else{

            return sumatoria(n, aux);
        }
    }
    
}
