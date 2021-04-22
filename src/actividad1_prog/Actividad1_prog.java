/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad1_prog;

/**
 *
 * @author Rafael Moreno
 * Imprimir la suma consecutiva del 0 al 102.
 */
public class Actividad1_prog{
    
    public static int suma;
            
    public static void forSuma(){
        
        for (int i = 0; i < 103; i++) {
            suma += i;
        }
    }
    
    public static void main(String[] args) {
        
        forSuma();
        
        System.out.println("La suma es: " + suma);
    }
    
}
