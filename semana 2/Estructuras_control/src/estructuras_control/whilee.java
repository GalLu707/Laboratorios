/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras_control;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class whilee {
    

    public static void main(String[] args) {
        int conta=0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Ingrese una la cantidad de notas que desea ingresar");
        int cantidad = obj.nextInt();
        while (conta < cantidad){
           conta++;
            System.out.println("ingrese la nota numero:" + conta );
            double nota = obj.nextDouble();
            if (nota<=0 || nota>100){
                System.out.println("esta nota es invalida"); 
                conta--;
            }else{
             
              System.out.println("num de nota " + "\nla nota es de: " + nota);  
            
            }
           double promedio= nota/cantidad;
           System.out.println("su promedio es de:"+ promedio);
         
        }
        
    }
}

