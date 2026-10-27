/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author NOVA
 */
public class ejer_2 {
    
    public static void main(String[] args) {
        
        int primero =0;
        int segundo =1;
        
        int suma=segundo;
        // 0,
        System.out.println(primero+ ", ");
        
        for(int i=1;i<10;i++){
            // 0,1
            System.out.println(segundo);
            //0,1,1
            suma= primero + segundo;
            
            primero=segundo;
            segundo=suma;
        }
    }
    
}
