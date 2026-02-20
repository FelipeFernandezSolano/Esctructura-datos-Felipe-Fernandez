/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lec06;

/**
 *
 * @author pipe-
 */
public class Lec06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Cola cola = new Cola();
            cola.encolar(10);
            cola.encolar(20);
            cola.encolar(30);
            
            System.out.println("Elemenento al frente: " + cola.frente());
            System.out.println("Elemento retornado: " + cola.desencolar());
            System.out.println("Elemenento al frente: " + cola.frente());
            
            
            cola.encolar(40);
            
            while(!cola.esVacia()){
                System.out.println("Elemento retornado: " + cola.desencolar());
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
