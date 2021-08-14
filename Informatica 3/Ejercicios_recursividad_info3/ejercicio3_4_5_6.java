import java.util.Scanner;

public class ejercicio3_4_5_6 {
    public static void main(String[] args) {
        // ej 3
        // System.out.println(multiplicacion(5, 5));

        // ej 4
        // System.out.println(division(125, 5,1));

        // ej 5
        // int arr[] = { 1, 2, 3, 4, 5 };
        // ordenador(arr, arr.length - 1);

        // ej 6

        // ej 7
        Scanner scanner = new Scanner(System.in);

        Integer n = scanner.nextInt();

        System.out.println(separador(n));

        scanner.close();

    }

    public static int multiplicacion(int a, int b) {

        return b == 0 ? 0 : a + multiplicacion(a, b - 1);
    }

    public static int division(int a, int b, int x) {

        if (a == b) {
            return x;
        }

        if (a > b) {
            a = a - b;
            x++;
        }

        if (a < b) {
            return x;
        }

        return division(a, b, x);

    }

    public static void ordenador(int arr[], int length) {

        if (length < 0) {

            return;
        }

        System.out.println(arr[length]);

        ordenador(arr, length - 1);

    }

    public static int separador(int n) {

        if (n/10 == 0) {

            return n%10;
        }  

        System.out.println(n%10);

        separador(n/10);

        return n%10;

    }

}
