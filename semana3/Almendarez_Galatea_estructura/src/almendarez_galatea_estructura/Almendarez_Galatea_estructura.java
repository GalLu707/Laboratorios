/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package almendarez_galatea_estructura;

/**
 *
 * @author USER
 */
//usar random, si es orimo o no lo es 
import java.util.Scanner;
import java.util.Random;
public class Almendarez_Galatea_estructura {
   
    public static void main(String[] args) {
        int contadogeneral=0;
        int opcion=0;
        Scanner obj = new Scanner(System.in);
        obj.useDelimiter("\n");
        System.out.println("bienvenido al programa :)");
        //que se repita todo lo siguiente cada que se ingrese una opcion invalida
        while(opcion!= 5){//mientras lo que el usuario ponga no sea 5 sigue preguntando una opcion
        System.out.println("***MENU***");
        System.out.println("1. palabras alreves");
        System.out.println("2. Numero perfecto");
        System.out.println("3. Numeros primos");
        System.out.println("4. votaciones");
        System.out.println("5. salir");
            System.out.println("ingrese la opcion a la que desea entrar:");
        if (obj.hasNextInt()){
          opcion = obj.nextInt();
        
      }else{
        System.out.println("opcion no valida, saliendo del sistema \n");
        opcion = obj.nextInt(); 
        }
        
        
        switch(opcion){
            case 1:
                contadogeneral++;
                System.out.println("palabra al reves-------------");
                System.out.println("Ingrese la cantidad de palabras");
                int cantidad = obj.nextInt();//numero de palabras que va a ingresar el usuario
                
                for(int cont=0;cont<cantidad; cont++ ){
                    System.out.println("ingrese su palabra");
                    String plb = obj.next().toLowerCase();
                    int i=0;
                       String palabrarevez="";
                    for(i=0; i<plb.length(); i++)
                      palabrarevez=plb.charAt(i)+ palabrarevez;
                    System.out.println("Su palabra al revez es:"+palabrarevez);
                    System.out.println("la cantidad de letras que tiene su palabra son:"+plb.length());
                    if (plb.equals(palabrarevez)){
                        System.out.println("su palabra es palindromo");
                        
                }
                }   
                break;
            case 2:
                contadogeneral++;
                System.out.println("numero perfecto-------------");
                
                break;
            case 3:
                contadogeneral++;
                System.out.println("numero primo-------------");
                System.out.println("generando un numero random\n.\n.\n.");
                Random NumRan = new Random();
                
                int Numeroo = NumRan.nextInt(101); 
                System.out.println("su numero generado fue: "+ Numeroo);
                
                boolean NUMPRIMO = true;//aqui se asume que es primo ya lueo se verifica si si o no
                if(Numeroo<=1){
                    NUMPRIMO= false;
                }else {
                    for (int otroconta= 2; otroconta<= Math.sqrt(Numeroo); otroconta++){
                    if(Numeroo % otroconta == 0){
                        NUMPRIMO=false;
                        break;
                            }
                    }
                }
                if(NUMPRIMO){
                    System.out.println("ES PRIMO YAY");
            }else{
                    System.out.println("NO es primo");
                }
                
                
                break;
            case 4:
                contadogeneral++;
                System.out.println("votaciones-------------");
                int votosazul=0;
                int votosrojo=0;
                int votosnegro=0;
                int votosamarillo=0;
                //cantidad todal de votos
                
                int vinvalidos=0;
 
                System.out.println("ingrese la cantidad de votantes");
                int votantes= obj.nextInt();

                for(int contavo=0;contavo <votantes; contavo++){
                    
                    
                System.out.println("ingrese a la planilla por la cual va a votar\nazul|rojo|negro|amarrillo");
                String voto=obj.next().toLowerCase();
                     switch(voto)
                {
                         //las opciones de las votaciones
                    case "azul":
                        
                        System.out.println("su voto a sido registrado correctamente");
                        votosazul++;
                     break;
                    case "rojo":
                        
                        System.out.println("su voto a sido registrado correctamente");
                        votosrojo++;
                        
                        break;
                    case "negro":
                        System.out.println("su voto a sido registrado correctamente");
                        votosnegro++;
                        
                        break;
                    case "amarillo":
                        System.out.println("su voto a sido registrado correctamente");
                        votosamarillo++;
                        
                        break;
                    default:
                        System.out.println("voto nulo\n pasando a la siguiente persona");
                        vinvalidos++;
                        
                                break;
                       }
                
                }
                  //suma los votos para luego verificar si es mayor a 60%
                int votosvalidas=votosazul+votosrojo+votosnegro+votosamarillo;
                System.out.println("sus votos validos son:"+ votosvalidas);
                double validacion= votantes*0.6+100;
                //si es mayor de 60 empieza a validar cual de todos los partidos es el que mas votos tiene 
                if(validacion >= 60){
                    int mayor;
                    System.out.println("votacion valida");
                    if(votosrojo>votosazul && votosrojo > votosamarillo && votosrojo> votosnegro){
                        mayor = votosrojo;
                        System.out.println("ganador: rojo");
                    }else if(votosazul>votosnegro && votosazul> votosamarillo){
                        mayor=votosazul;
                        System.out.println("ganador: azul");
                    }else if(votosamarillo > votosnegro){  
                        mayor=votosamarillo;
                        System.out.println("ganador: amarillo");
                    }else{
                    mayor = votosnegro;
                    System.out.println("el partido que gano es el negro");
                    
                    }
                    
                }else{
                    System.out.println("votaciones invalidas");
                }
                
                break;
                  
            case 5:
                //cierra el programa 
                System.out.println("veces que ingreso a las opciones: "+ contadogeneral);
                System.out.println("saliendo del sistema\n.\n.\n.\n ADIOS :D");
                
                break;
        //este regresa hasta el inicio del programa para volver a pedir un numero
            default:System.out.println("Su opcion no es valida :(");
                break;
        }   
    
 }   //del switch del programa completo 
}
}
}