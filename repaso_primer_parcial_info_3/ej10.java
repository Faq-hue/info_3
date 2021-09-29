import java.util.Stack;

/**Ej10 La funcionalidad deshacer comúnmente encontrada en los programas,
mantiene un historial ordenado de las operaciones que se realizaron. Cree
una clase que tenga 4 métodos (a, b, c y d) y un quinto método deshacer.
Los métodos deben mostrar en pantalla que se realizo el método y el
método deshacer debe mostrar se deshizo y el ultimo método utilizado.
(2,5pto)
Ej:
Llamadas:          Salida
clase.a();         Se ejecuto A
clase.b();         Se ejecuto B
clase.deshacer();  Se deshizo B
clase.c();         Se ejecuto C
clase.c();         Se ejecuto C
clase.deshacer();  Se deshizo C
clase.deshacer();  Se deshizo C
clase.deshacer();  Se deshizo A */

public class ej10 {

    static Stack<Character> historial = new Stack<>();
 public static void main(String[] args) {

    a();
    b();
    c();
    a();
    a();
    d();
    a();
    deshacer();
    deshacer();
    deshacer();
    deshacer();
    
 }

private static void d() {

    System.out.println("Se ejecuto D");

    historial.add('D');
}

private static void c() {

    System.out.println("Se ejecuto C");

    historial.add('C');
            }

private static void b() {

    System.out.println("Se ejecuto B");

    historial.add('B');
}

private static void a() {

    System.out.println("Se ejecuto A");

    historial.add('A');
}

private static void deshacer() {

    System.out.println("Se deshizo " + historial.pop());

}   
}
