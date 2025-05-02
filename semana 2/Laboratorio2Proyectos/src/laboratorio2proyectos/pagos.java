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
        Scanner obj = new Scanner(System.in);
        obj.useDelimiter("\n");
        
        System.out.println("introduzca su nombre");
        String Nombre= obj.next();
        
        System.out.println("Introduzca su apellido:");
        String Apellido = obj.next();
        
        System.out.println("introduzca su codigo");
        String Codigo= obj.next();
        
        System.out.println("Ingrese la cantidad de horas que trabajo al mes:");
        int HorasMes = obj.nextInt();
        
        System.out.println("Ingrese la categoria a la que pertenece:");
        int catego = obj.nextInt();
        
        int HorasExtras = HorasMes - HorasAtrabajar; 
        
        if(HorasExtras<0){
           System.out.println("usted no posee horas extra");
        } else {
        System.out.println("sus horas extra son:"+ HorasExtras);
        }
        
        System.out.println("Plantilla \nNombre del empleado:"+ Nombre +"\nApellido:"+ Apellido+ "\nsu codigo es:" + Codigo);
        
        switch(catego) {
            case 1:
                
              System.out.println("wiwiwiwi");
                
                break;
            case 2:
                System.out.println("papu pro");
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
