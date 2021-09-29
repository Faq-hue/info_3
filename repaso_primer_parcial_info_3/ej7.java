
/**Ej7 Implementar una función recursiva que sea capaz de sumar los n elementos
de un arreglo v de enteros solo si el valor es mayor a p */

public class ej7 {
    public static void main(String[] args) {
        
        int [] v = {8,1,4,10,9,2,6,11};
        int p = 0;

        System.out.println(sumador(v,p));


    }

    private static int sumador(int[] v, int p) {
        
        if (v.length == 0) {
            return 0;
        }  

        int[] aux = new int[v.length -1];
        
        for (int i = 0; i < aux.length ; i++) {
            aux[i] = v[i];

            //System.out.println(aux[i]);
        }

        if (v[v.length-1] > p) {
            
            return sumador(aux, p) + v[v.length-1];

        }else{

            return sumador(aux, p);
        }
    }
}
