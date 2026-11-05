
package ejemplo.utc.com;

import java.util.Stack;

public class main {

    public static void main(String[] args) {

       
        Stack<String> pila = new Stack<>();

       
        pila.push("A");
        pila.push("B");
        pila.push("C");

        
        System.out.println(pila.search("C")); 
        System.out.println(pila.search("B")); 
        System.out.println(pila.search("A")); 
      
        System.out.println("Pila completa base a tope: " + pila);

        
        for (String letra : pila) {
            System.out.println("Elemento: " + letra);
        }

        // POP
        System.out.println("Metodo pop(): " + pila.pop());
        // PEEK
        System.out.println("Metodo peek(): " + pila.peek());

        
        System.out.println("Pila despues de pop(): " + pila);

    }
}
