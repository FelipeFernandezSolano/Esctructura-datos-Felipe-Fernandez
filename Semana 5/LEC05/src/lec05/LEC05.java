/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lec05;

/**
 *
 * @author pipe-
 */
public class LEC05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        PilaDinamica pila = new PilaDinamica();

        System.out.println("Apilando");

        pila.push(10);
        pila.push(20);
        pila.push(30);
        System.out.println("Mostrar pila");
        pila.mostrar();
        System.out.println("Desapilando" + pila.pop());
        System.out.println("Desapilando" + pila.pop());
        System.out.println("mostrar pila");
        pila.mostrar();
        System.out.println("Desapilando" + pila.pop());
        System.out.println("Intetando desapilar pila vacia");
        pila.pop();

    }

}
