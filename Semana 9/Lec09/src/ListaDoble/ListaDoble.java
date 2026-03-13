/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaDoble;

/**
 *
 * @author pipe-
 */
public class ListaDoble {
    private Nodo cabeza;
    
    public void insertar(int valor){
        Nodo nuevo = new Nodo(valor);
        if(cabeza == null){
            cabeza = nuevo;
        }else{
            Nodo actual = cabeza;
            while(actual.getSiguiente() != null){
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
            nuevo.setAnterior(actual);
        }
        
    }
    
    public void mostrarAdelante(){
        Nodo actual = cabeza;
        while(actual != null){
            System.out.println(" <->");
            actual = actual.getSiguiente();
        }
        System.out.println("Null");
    }
    
    public void mostrarAtras(){
        Nodo actual = cabeza;
        if(actual == null){
            return;
        }
        while(actual.getSiguiente() != null){
            actual = actual.getSiguiente();
        }
        while (actual != null){
            System.out.println(" <-> ");
            actual.getAnterior();
        }
        System.out.println("NULL");
    }
    
}
