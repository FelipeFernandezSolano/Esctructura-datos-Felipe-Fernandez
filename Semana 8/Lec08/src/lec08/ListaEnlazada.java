/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec08;

/**
 *
 * @author pipe-
 */
public class ListaEnlazada {

    private Nodo cabeza;

    public ListaEnlazada() {

        this.cabeza = null;

    }

    public void insertarInicio(int valor) {
        Nodo nuevo = new Nodo(valor);
        nuevo.setSiguente(cabeza);
        cabeza = nuevo;
    }

    public void eliminarNodo(int valor) {
        Nodo actual = cabeza;
        Nodo anterior = null;

        while (actual != null && actual.getDato() != valor) {

            anterior = actual;
            actual = actual.getSiguente();
        }
        if (actual == null) {
            return;
        }
        if (anterior == null) {
            cabeza = actual.getSiguente();
        } else {
            anterior.setSiguente(actual.getSiguente());
        }
    }

    public boolean buscar(int valor) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.getDato() == valor) {
                return true;
            }
            actual = actual.getSiguente();
        }
        return false;

    }

    public void recorrer() {
        Nodo actual = cabeza;
        while (actual != null) {

            System.out.println(actual.getDato() + " --> ");
            actual = actual.getSiguente();
        }
        System.out.println("NULL");

    }
}
