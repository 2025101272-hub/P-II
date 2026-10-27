/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import java.util.Scanner;

/**
 *
 * @author NOVA
 */
public class ejer_1 {
    
    static boolean esPrimo(int n){
       //sacamos al 0 y 1
        if(n<2){
            return false;
        }
        
        boolean es_primo= true;
        
        int contador=2;
        
        while(contador<n){
            
            if(n%contador==0){
                es_primo=false;
            }
            contador++;
            
        }
        return es_primo;
        
    }
    
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese su numero de inicio");
        
        int nu_inferior=leer.nextInt();
        
        System.out.println("Ingrese su numero final");
        int nu_superior=leer.nextInt();
        
        System.out.println("Los numero primos que estan en el rango de"
                        + " "+nu_inferior+" - "+nu_superior+ " "+ "son");
        for(int i=nu_inferior;i<=nu_superior;i++){
            if(esPrimo(i)){
                
                System.out.println(i);
            }
        }
    }
   
    
    
    
    
}
