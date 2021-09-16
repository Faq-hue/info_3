package pilas_colas_con_listas.ej2;

import estructuras.ListStack;
import estructuras.Stack;
import java.util.Scanner;

public class ej2and3 {
    public static void main(String[] args) {
        
        Stack<Float> stack = new ListStack<>();
        Scanner scan = new Scanner(System.in);
        boolean loop = true;
        
        while (loop) {
           
            String s = scan.nextLine();
           
            switch (s) {
                case "+":
                
                case "-":

                case "*":

                case "/":

                    operate(stack, s);

                default:
                    break;
            }



        }

        scan.close();
    }

    private static void operate(Stack<Float> stack, String s) {
        Float a = null;
        Float b = null;
        Float res;
        
        try {
            b = stack.topAndPop();
            a = stack.topAndPop();
        
        } catch (Exception e) {
            if (b == null) {
                System.out.println("No hay ningun operando");
            }else{
                stack.push(b);
                System.out.println("Falta un operando");
            }
            
            return;
        
        }

        switch (s) {
            case "+": res = a + b;
                break;

            case "-": res = a - b;
                break;

            case "*": res = a * b;
                break;

            default: res = a / b;
                break;
        }

        System.out.println(res);
        stack.push(res);
    
    }
    
    
}
