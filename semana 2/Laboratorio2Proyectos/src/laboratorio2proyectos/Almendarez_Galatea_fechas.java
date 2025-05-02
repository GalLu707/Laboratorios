/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio2proyectos;

/**
 *
 * @author USER
 */ 
import java.time.LocalDateTime; //fechasss
import java.time.format.DateTimeFormatter; //formato para la fecha
import java.util.Scanner; //el scanner de siempre 
public class Almendarez_Galatea_fechas {
    //clases ejercicio 1
   
    public static void main(String[]args){
        Scanner Fecha = new Scanner(System.in);
        DateTimeFormatter formatofecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        System.out.println("ingrese la primera fecha en formato (dd/MM/yyyy):");
        String Fechausuario = Fecha.next();
        Fecha.useDelimiter("\n");
        
    }
    
}
