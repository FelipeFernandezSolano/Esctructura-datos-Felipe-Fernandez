/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec05;

/**
 *
 * @author pipe-
 */
public class PilaDinamica {

    private Nodo cima;

    public PilaDinamica() {
        this.cima = null;
    }

    public void push(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.setSiguente(cima);
        cima = nuevoNodo;
    }

    public int pop() {
        if (cima == null) {
            System.out.println("Desbortamiendo");
            return -1;
        }
        int dato = cima.getDato();
        cima = cima.getSiguente();
        return dato;

    }

    public void mostrar() {
        if (cima == null) {
            System.out.println("Pila vacia");
            return;
        }
        Nodo actual = cima;
        System.out.println("Contenido de pila:");
        while (actual != null) {
            System.out.println(actual.getDato());
            actual = actual.getSiguente();
        }

    }

}
