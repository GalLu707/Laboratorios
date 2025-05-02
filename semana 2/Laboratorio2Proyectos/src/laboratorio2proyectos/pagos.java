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
        double salarioBase= pagoPhora*HorasAtrabajar; 
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
        
         System.out.println("Plantilla \nNombre del empleado:"+ Nombre +"\nApellido:"+ Apellido+ "\nsu codigo es:" + Codigo);
            double salario= HorasMes*pagoPhora;
        
        switch(catego) {
            case 1:
              int horascate1= HorasExtras*40;
              if (horascate1<0){
                  System.out.println("total de horas extra:0");  
              }else{
                  System.out.println("Su pago de horas extra es:"+ horascate1);
              }
                break;
            case 2:
                int horascate2= HorasExtras*50;
              if (horascate2<0){
                  System.out.println("total de horas extra:0");  
              }else{
                  System.out.println("Su pago de horas extra es:"+ horascate2);
              }
                break;
            case 3:
                int horascate3= HorasExtras*85;
              if (horascate3<0){
                  System.out.println("total de horas extra:0");  
              }else{
                  System.out.println("Su pago de horas extra es:"+ horascate3);
              }
                break;
            case 4:
                System.out.println("Usted no posee horas extra");
                break; 
            default:
                System.out.println("su opcion no es valida");
                break; 
                
        }
      if (HorasMes>40){
          System.out.println("sus horas base son de:1439.6");
      }else{
          System.out.println("Su salario es de"+  HorasMes*pagoPhora);
          
      }
    }
    }  
    }

