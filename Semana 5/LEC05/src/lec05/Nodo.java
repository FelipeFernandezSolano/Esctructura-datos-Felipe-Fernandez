/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec05;

/**
 *
 * @author pipe-
 */
public class Nodo {
    private int dato;
    private Nodo siguente;
    
    
    public Nodo (int dato){
        this.dato = dato; 
        this.siguente = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguente() {
        return siguente;
    }

    public void setSiguente(Nodo siguente) {
        this.siguente = siguente;
    }
    
}
