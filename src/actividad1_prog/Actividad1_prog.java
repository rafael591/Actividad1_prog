/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad1_prog;

import java.util.Scanner;

/**
 *
 * @author Rafael Moreno
 * 
 */
public class Actividad1_prog{
            
    public static void forSuma(){
        
        int suma = 0;
        
        for (int i = 0; i < 11; i++) {
            suma += i;
        }
        
        System.out.println("La suma es: " + suma);
    }
    
    public static void factorialCal(){
        
        double factorial = 1;
        
        for (int i = 1; i < 11; i++) {
            
            factorial *= i;
        }
        
        System.out.println("El factorial de 10 es: " + factorial);
    }
    
    public static void factorialUsuario(int numTemp){
        
        int numero = numTemp;
        
        double factorialUsu = 1;
        
        for (int i = 1; i <= numero; i++) {
            
            factorialUsu *= i;
        }
        
        System.out.println("El resultado del factorial del número: " + numero + " es: " + factorialUsu);
    }
    
    public static void mediaUsuario(int numTemp){
        
        int numero = numTemp;
        
        int media = 0;
        
        for (int i = 0; i <= numTemp; i++) {
            
            media += i;
        }
        
        media = (media/numero);
        
        System.out.println("La media del número es: " + media);
    }
    
    public static void promUsuarioNum(int numeroTemp){
        
        Scanner entrada = new Scanner(System.in);
        
        int ingresoNumero = numeroTemp;
        
        int sumaAcum = 0;
        
        int[] datosIngresados = new int [ingresoNumero];
        
        for (int i = 0; i < ingresoNumero; i++) {
            
            System.out.println("Ingrese un digito: ");
            
            datosIngresados[i] = entrada.nextInt();
            
            sumaAcum += datosIngresados[i];
        }
        
        System.out.println("La suma de todos los digitos es: " + sumaAcum);
        
        int promedio = sumaAcum / ingresoNumero;
        
        System.out.println("El promedio de los números ingresados: " + promedio);
        
        //numero introducido mayor y menor
        
        int mayor, menor;
        
        mayor = menor = datosIngresados[0];
        
        for (int i = 0; i < datosIngresados.length ; i++) {
            
            if (datosIngresados[i] > mayor){
                
                mayor = datosIngresados[i];
            }
            if(datosIngresados[i] < menor){
                
                menor = datosIngresados[i];
            }
            
        }
        
            System.out.println("El número mayor es: " + mayor);
            
            System.out.println("El número menor es: " + menor);
            
        //distancia numerica entre ellos
            
        int distancia = mayor - menor;
        
        System.out.println("La distancia entre los números es de: " + distancia);
        
    }
   
    public static void diasSemana(){
        
        String diasDeLaSemana[] = new String [7];
        
        diasDeLaSemana[0] = "Lunes";
        diasDeLaSemana[1] = "Martes";
        diasDeLaSemana[2] = "Miercoles";
        diasDeLaSemana[3] = "Jueves";
        diasDeLaSemana[4] = "Viernes";
        diasDeLaSemana[5] = "Sabado";
        diasDeLaSemana[6] = "Domingo";
        
        for (int i = 0; i < diasDeLaSemana.length; i++) {
            
            System.out.println(diasDeLaSemana[i]);
            
        }
    }
    
    public static void juegoGatoModelo(){
        
        String juegoGato[][] = new String [3][3];
        
        juegoGato[0][0] = " x ";
        juegoGato[0][1] = " x ";
        juegoGato[0][2] = " x ";
        juegoGato[1][0] = " o ";
        juegoGato[1][1] = " x ";
        juegoGato[1][2] = " o ";
        juegoGato[2][0] = " o ";
        juegoGato[2][1] = " x ";
        juegoGato[2][2] = " o ";
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + juegoGato[i][j]);
            }
            System.out.println(" ");
        }
    }
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        //Imprimir la suma consecutiva del 0 al 102.
        
        forSuma();
        
        //Calcular el factorial del 1 al 103
        
        factorialCal();
        
        //Calcular el factorial de un número que sea introducido por el usuario
        
        System.out.println("Ingrese el número que desea obtener el factorial: ");
        
        factorialUsuario(entrada.nextInt());
        
        //Calcular la media de la suma del 0 hasta el número introducido por el usuario
        
        System.out.println("Ingrese un número para obtener la media: ");
        
        mediaUsuario(entrada.nextInt());
        
        //Pedir un número y leer n veces números, realizar la suma de los números, sacar el promedio
        //y determinar cuál número introducido es el mayor y cuál el menor, y la distancia numérica entre ellos.
        
        System.out.println("¿Cuántos datos desea ingresar?");
        
        promUsuarioNum(entrada.nextInt());
        
        //Imprima un arreglo que tenga los nombres de los días de la semana.
        
        System.out.println("Los dias de la semana son: ");
        
        diasSemana();
        
        //Imprima un arreglo de 2 dimensiones de 3 X 3 que dibuje el modelo del juego gato.           
        //0,0    0,1   0,2             1,0    1,1   1,2             2,0    2,1   2,2
        System.out.println("Arreglo de 2 dimensione del modelo del juego gato: ");
        
        juegoGatoModelo();
        
        
    }
    
}
