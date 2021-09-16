package estructuras;

public class exp {
    public static void main(String[] args) throws Exception {
        
        Queue <Integer> queueList = new ListQueue<>();
        Queue <Integer> queueArray =  new ArrayQueue<>();

        Stack <Integer> stackList = new ListStack<>();
        Stack <Integer> stackArray = new ArrayStack<>();

        int n = 1;

        System.out.println("\n-------Queue--------");

        System.out.println("Queue Array:");

        long start1 = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {

            queueArray.enqueue(i);

        }
        System.out.println("Time enqueue array:" + start1);

        long start2 = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            
            queueArray.dequeue();

        }
        System.out.println("Time dequeue array: " + start2);

        System.out.println("\nQueue List:");

        long start3 = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {

            queueList.enqueue(i);

        }
        System.out.println("Time enqueue list:" + start3);

        long start4 = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            
            queueList.dequeue();

        }
        System.out.println("Time dequeue list: " + start4);

        System.out.println("\n-------Stack--------");

        System.out.println("Stack array:");

        long start5 = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {

            stackArray.push(i);

        }
        System.out.println("Time stack array:" + start5);

        long start6 = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {

            stackArray.pop();;

        }
        System.out.println("Time stack array:" + start6);


        System.out.println("\nStack list:");

        long start7 = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {

            stackList.push(i);

        }
        System.out.println("Time stack list:" + start7);

        long start8 = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {

            stackList.pop();;

        }
        System.out.println("Time stack list:" + start8);



    }
}
