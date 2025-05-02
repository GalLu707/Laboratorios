/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio2proyectos;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class Laboratorio2Proyectos {

   //Tarea numero 2Tiempo
    public static void main(String[] args) {
        System.out.println("conversion de numro entero a horas, minutos y segundos :)");
        System.out.println("ingrese un numero entero");
        Scanner obj= new Scanner(System.in);
        int NumeroUsuario = obj.nextInt();
        if (NumeroUsuario <=0){
            System.out.println("no se permite este valor");
        }else{
            int sacarhoras = NumeroUsuario/(60*60); //con esto se resta la hora con los segundos que puso el usuario con los segundos de las horas 
            System.out.println("las horas que tiene son "+ sacarhoras +" Hora/s");
            int sacarsegundos= sacarhoras*3600; //calcular los minutos restantes que senecesitan para luego sacar los segundos 
            int segundos= NumeroUsuario - sacarsegundos; 
        int minutos = segundos/60; 
        int ultsegun = segundos - (minutos*60);
        System.out.println("sus minutos restantes son:"+ minutos);
        System.out.println("sus segundos restantes son: " + ultsegun); 
    
        }
        
    }
    
}
