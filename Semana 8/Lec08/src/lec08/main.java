/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lec08;

/**
 *
 * @author pipe-
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ListaEnlazada lista = new ListaEnlazada();
        
        lista.insertarInicio(10);
         lista.insertarInicio(20);
          lista.insertarInicio(30);
          System.out.println("Lista despues de insertar");
          
          lista.recorrer();
          lista.eliminarNodo(20);
          System.out.println("Lista despues de eliminar");
          lista.recorrer();
          System.out.println("10 en lista?: " + lista.buscar(10));
          
          System.out.println("20 en lista?: " + lista.buscar(20));
          
          lista.insertarInicio(99);
          lista.insertarInicio(50);
          System.out.println("lista despues de insertar");
          
          lista.recorrer();
    }
    
}
