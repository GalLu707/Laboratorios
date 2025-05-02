/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio2proyectos;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class pagos {
    public static void main(String[]args){
        double pagoPhora = 35.99;
        int HorasAtrabajar= 40;
        System.out.println("Ingrese la cantidad de horas que trabajo al mes:");
        Scanner obj = new Scanner(System.in);
        int HorasMes = obj.nextInt();
        System.out.println("Ingrese la categoria a la que pertenece:");
        int catego = obj.nextInt();
        obj.useDelimiter("\n");
        int HorasExtras = HorasMes - HorasAtrabajar; 
        
        if(HorasExtras<0){
           System.out.println("usted no posee horas extra");
        } else {
        System.out.println("sus horas extra son:"+ HorasExtras);
        }
        
        switch(catego) {
            case 1:
              // int Hextra=  
                
                break;
            case 2:
                break;
            case 3:
                break;
            case 4: 
                System.out.println("papu, papu");
                break;
            default:
                System.out.println("su opcion no es valida");
                break; 
        }
        
           
        
        //int horaExtra= HorasAtrabajar;
    }
    
}
