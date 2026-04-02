/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lec11;

/**
 *
 * @author pipe-
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Arbol arbol = new Arbol();
        
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(70);
        arbol.insertar(20);
        arbol.insertar(40);
        arbol.insertar(60);
        arbol.insertar(80);
        
        
        System.out.println("Recorrido inorden" );
        arbol.inorden();
        
        arbol.eliminar(40);
        arbol.eliminar(40);
        arbol.eliminar(30);
        arbol.eliminar(70);
    }
    
}
