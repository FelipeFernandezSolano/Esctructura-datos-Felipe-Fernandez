/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lec04;

/**
 *
 * @author pipe-
 */
public class Lec04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic herePila
        
        Pila pila = new Pila();
         pila.apilar(10);
         pila.apilar(20);
         pila.apilar(30);
         pila.apilar(40);
         
        System.out.println("Pila despues de apilar");
        
        System.out.println(pila.mostrarPila());
        
        System.out.println("Elemento desapilado" + pila.desapilar());      
        System.out.println("Pila despues de desapilar"  );
        System.out.println(pila.mostrarPila());
        
        System.out.println("Elemento desapilado" + pila.desapilar());
        System.out.println("Pila despues de desapilar"  );
        System.out.println(pila.mostrarPila());
    }
    
}
