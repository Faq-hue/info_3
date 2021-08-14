import java.util.Scanner;

public class ej_recursive {
    public static void main(String[] args) {
        
        //ej 2
        /*try {

            System.out.println(power(2, 3));

        } catch (Exception e) {
            System.out.println("Exception in:");
            e.printStackTrace();
        }*/
        
        // ej 3
        // System.out.println(multiplicacion(5, 5));

        // ej 4
        // System.out.println(division(125, 5));

        // ej 5
        //int arr[] = { 1, 2, 3, 4, 5 };
        //System.out.println(ordenador(arr));

        // ej 6
        //System.out.println(contador(1101));


        // ej 7
        /*Scanner scanner = new Scanner(System.in);

        Integer n = scanner.nextInt();

        System.out.println(separador(n));

        scanner.close();*/
        
    }   

    public static int power(int base, int exp) throws Exception {

        if (exp < 0) {
            throw new Exception("exp cannot be minnor to 0");
        }

        return exp == 0? 1: base* power(base, exp - 1);

    }

    public static int multiplicacion(int a, int b) {

        return b == 0 ? 0 : a + multiplicacion(a, b - 1);
    }

    public static int division(int a, int b) {
        
        if(a < b){

            return 0;
        }

        return 1 + division(a - b, b);

    }

    public static String ordenador(int arr[]) {

        if (arr.length == 1) {

            return "" + arr[0];
        }

        int arr2[] = new int [arr.length-1];

        for (int i = 0; i < arr.length-1; i++) {
        
            arr2[i] = arr[i];
        
        }

        return arr[arr.length-1]+ ", " + ordenador(arr2);
    }

    public static int contador (int bin){

        if(bin/10 == 0){

            return bin%10;
        }

        return bin%10 + contador(bin/10);
    }

    public static String separador(int n) {

        if (n/10 == 0) {

            return ""+ n%10;
        }

        return separador(n/10) + " " + n%10;

    }

}
