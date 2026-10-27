/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author NOVA
 */
public class principal {
    
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
      
      
        int matriz[][]=new int[3][3];
        int transpuesta[][]=new int[3][3];
        
        System.out.println("Digite los elementos");
        for(int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                System.out.print("Matriz["+x+"]["+y+"]");
                matriz[x][y]=leer.nextInt();
            }
            System.out.println("");
        }
        
        //Transponemos la matriz
        
        
        for(int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                transpuesta[y][x]=matriz[x][y];
            }
            System.out.println("");
        }
        
        // matriz original
        
        System.out.println("Matriz original");
        
        for(int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                System.out.print(matriz[x][y]+" ");
            }
            System.out.println("");
        }
        //matriz transpuesta
        
        System.out.println("Matriz transpuesta");
        
        for(int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                System.out.print(transpuesta[x][y]+" ");
            }
            System.out.println("");
        }
    }
    
}
