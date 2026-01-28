/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana2recusividad;

import javax.swing.JOptionPane;

/**
 *
 * @author pipe-
 */
public class Semana2Recusividad {

    public static void main(String[] args) {
        // imprime(5);
        int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
        //System.out.println("El factorial de " + x +" es " + factorial(x));
     
          System.out.println("La suna de " + x +" es " + sumaEnteroIterativo(x)); 
        
        
    }

    public static void imprime(int n) {
        if (n == 0) { //caso base

            return; //rompe el ciclox|
        } else {
            System.out.println(n);
            imprime(n - 1); // recursividad
        }
    }
    
    // Método recursivo para calcular el factorial
    public static int factorial(int n) {
        if (n == 1) {
            // Caso base: cuandon es 1            
            return 1;
        } else {
            return n * factorial(n - 1); // Llamadarecursiva        
        }
    }
    
    public static int sumaEnteroIterativo(int n){
        if(n <= 1 ){
            return 1;
        }else{
            return n + sumaEnteroIterativo(n-1);
        }
    }
public static int potencia(int base,int exponente){
    if(exponente == 1){
        return base;
    }else{
        return base * potencia(base,exponente -1);
    }
}

}
