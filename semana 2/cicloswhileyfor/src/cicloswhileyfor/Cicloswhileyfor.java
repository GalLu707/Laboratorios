/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cicloswhileyfor;

import java.util.Scanner;
public class Cicloswhileyfor {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in).useDelimiter("\n");
        int longitud = 0;
        int longitudMayor= 0;
        int cantidadPalabras = 0;
        String palabra = "";
        String palabraMayor = "";
        
        System.out.println("Cantidad Palabras");
        cantidadPalabras = input.nextInt();
        
        for (int i = 0;i < cantidadPalabras;i++)
        {
            System.out.println("Ingrese palabra");
            palabra = input.next();
            longitud = palabra.length();
            String palabraAlreves = "";
            
            for (int h = (longitud - 1);h<0;h--)
            {
            char letra = palabra.charAt(h);
            palabraAlreves = palabraAlreves + letra;
            
            }
            System.out.println(palabraAlreves);
            
            if (longitud > longitudMayor)
            {
            longitudMayor = longitud;
            palabraMayor = palabra;
            }
        }
        
        System.out.println(longitudMayor + " "+palabraMayor);
        
    }
}
