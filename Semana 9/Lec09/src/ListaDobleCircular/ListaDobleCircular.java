/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaDobleCircular;

/**
 *
 * @author pipe-
 */
public class ListaDobleCircular {
    
    private Nodo cabeza;
    private Nodo ultimo;
    
    
    public void insertar(int valor){
        Nodo nuevo = new Nodo(valor);
        
        if(cabeza == null){
            cabeza = nuevo;
           } else {
            Nodo ultimo = cabeza.getAnterior();
            nuevo.setSiguiente(cabeza);
            nuevo.setAnterior(ultimo); 
            cabeza.setAnterior(nuevo);
            cabeza.setSiguiente(nuevo);
            
           
                    
        }
        
        
    }
    
    public void mostrarAdelante(){
        if(cabeza == null){
            return;
        }
        Nodo actual = cabeza;
        do{
            System.out.println(" <->");
            actual = actual.getSiguiente();
            
        }while(actual!= cabeza);
        System.out.println("circular");
    }
}
