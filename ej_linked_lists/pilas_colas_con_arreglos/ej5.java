package pilas_colas_con_arreglos;

import estructuras.ArrayQueue;
import estructuras.Queue;
import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        Queue<String> queue = new ArrayQueue<>();

        showMenu();

        String selection = scan.nextLine();

        while (!selection.equals("0")) {
            
            
            switch (selection) {
                case "1": add(queue, scan);
                    break;

                case "2": attend(queue);
                    break;

                case "3": view(queue);      
                    break;
            }

            showMenu();
            selection = scan.nextLine();

        }

        scan.close();

    }

    private static void view(Queue<String> queue) {
        Queue <String> tmp = new ArrayQueue<>();
        String name;

        try {
            
            while(!queue.isEmpty()){
                name = queue.dequeue();

                System.out.println("Appointment: " + name);

                tmp.enqueue(name);
            }
            
            while (!tmp.isEmpty()) {
                
                queue.enqueue(tmp.dequeue());

            }


        } catch (Exception e) {
            System.out.println("Error Skynet is here, run");
        }


    
    
    }

    private static void attend(Queue<String> queue) {
        System.out.println("You attended: ");
        try {
            System.out.println(queue.dequeue());
        } catch (Exception e) {
            System.out.println("There are not scheduled shifts");
        }
    
    }

    private static void add(Queue<String> queue, Scanner scan) {
        System.out.println("Name: ");
        queue.enqueue(scan.nextLine());
    
    }

    private static void showMenu() {

        System.out.println("MENU");
        System.out.println("\n1) Add appointment");
        System.out.println("2) Attend appointment");
        System.out.println("3) View appointmens");
        System.out.println("0) Exit");
    }
    
}
