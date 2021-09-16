package pilas_colas_con_listas;

import estructuras.ListQueue;
import estructuras.Queue;
import estructuras.ListStack;
import estructuras.Stack;
import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the string");
        String s = scan.nextLine();

        palindrome(s);

    }

    private static boolean palindrome(String s) {

        Queue<Character> queue = new ListQueue<>();

        for (int i = 0; i < s.length(); i++) {
            
            switch (s.charAt(i)) {
                case ' ':
                    break;
                
                case '.':
                    break;

                case ',':
                    break;

                default: queue.enqueue(s.charAt(i));
                    break;
            }
        }



        while (!queue.isEmpty()) {

            try {
                
                if (queue.dequeue() != queue.getFront()) {
                    return false;
                }

            } catch (Exception e) {
                return true;
            }


            
            
        }    
        return true;
    }
}
