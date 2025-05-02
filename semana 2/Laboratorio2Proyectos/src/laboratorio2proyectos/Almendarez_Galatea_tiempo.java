/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio2proyectos;

/**
 *
 * @author USER
 */
import java.util.Scanner; //el scanner de siempre 
public class Almendarez_Galatea_tiempo {
    public static void main(String []args){
        //clases 
        Scanner obj = new Scanner(System.in);
        String dias = obj.next();
        obj.useDelimiter("\n");
        System.out.println("Ingrese la fecha en formato (dd/MM)");
        String fecha = obj.next();
        System.out.println("el dia que ingreso fue" +
        fecha.substring(0,1));
                
        
        
        switch (dias){
                case "lunes":
                case "martes":
                case "miercoles":
                case "jueves":
                case "viernes":
                    break;
                default:
                    System.out.println("Su opcion no es valido");
                            
                                
                             
        
    }
}
}
