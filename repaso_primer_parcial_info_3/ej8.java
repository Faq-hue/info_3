
/**Ej8 Implemente una función recursiva que dado un array imprima un * si
encuentra un valor par y un # si encuentra un valor impar. La salida debe
estar en el orden del array.(2,5 pto)
Ej: array = [ 1, 2, 4, 3, 5 ]
salida: #**## */

public class ej8 {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};

        System.out.println(par_impar(arr));

    }

    private static String par_impar(int[] arr) {
        
        if (arr.length == 0) {
            return "";
        }
        
        int[] aux = new int[arr.length-1];

        for (int i = 0; i < aux.length; i++) {
            aux[i] = arr[i];
        }

        //System.out.println("TEST " + arr[arr.length-1] );

        if (arr[arr.length-1] % 2 == 0) {
            
            return par_impar(aux) + "*"; 

        }else{

            return par_impar(aux) + "#";
        }
    }
    
}
