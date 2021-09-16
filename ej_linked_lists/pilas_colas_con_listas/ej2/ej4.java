package pilas_colas_con_listas.ej2;

import estructuras.ListStack;
import estructuras.Stack;

public class ej4 {
    public static void main(String[] args) {
        
        String s = new String();

        balance(s);


    }

    private static boolean balance(String s) {
        Stack<Character> stack = new ListStack<>();
        
        for (int i = 0; i < s.length(); i++) {
            
            switch(s.charAt(i)){

                case '{':
                    stack.push('}');
                    break;

                case '[':
                    stack.push(']');

                case '(': 
                    stack.push(')');

                case '}':
                case ']':
                case ')':

                    try {
                        
                        if(stack.topAndPop().compareTo(s.charAt(i)) != 0){
                            return false;
                        }

                    } catch (Exception e) {
                        return false;
                    }
                break;


            }


        }

        return stack.isEmpty();
    

    }
}
