/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisis;

import static java.lang.Math.pow;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jake
 */
public class Analisis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random aleatorio;
        aleatorio = new Random((long) pow(111,0.5));
        
        ArrayList <Float> cadena;
        cadena = new ArrayList <>();

        for(int i = 0 ; i < 8 ; i++){
        cadena.add(10 * aleatorio.nextFloat());
        }
        
        float x1 = cadena.get(0);
        float x2 = cadena.get(1);
        float x3 = cadena.get(2);
        float x4 = cadena.get(3);
        
        float y1 = cadena.get(4);
        float y2 = cadena.get(5);
        float y3 = cadena.get(6);
        float y4 = cadena.get(7);
        
        float [][]coordenadas = {{x1,y1},{x2,y2},{x3,y3},{x4,y4}};
        
        System.out.println("----------- COORDENADAS --------------------------\n");
        System.out.println( "Ciudad 1 = " + "x1 : (" + coordenadas[0][0] + ")" + "  y1 : (" + coordenadas[0][1] + ")");
        System.out.println( "Ciudad 2 = " + "x2 : (" + coordenadas[1][0] + ")" + " y2 : (" + coordenadas[1][1] + ")");
        System.out.println( "Ciudad 3 = " + "x3 : (" + coordenadas[2][0] + ")" + " y3 : (" + coordenadas[2][1] + ")");
        System.out.println( "Ciudad 4 = " + "x4 : (" + coordenadas[3][0] + ")" + " y4 : (" + coordenadas[3][1] + ")");
         
        
        System.out.println("----------- ----------- --------------------------\n");
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Ingrese la primera ciudad a calcular distancia : ");
        int ciudad1 = sc.nextInt();
  
        
        System.out.println("Ingrese la segunda ciudad a calcular distancia : ");
        int ciudad2 = sc.nextInt();
        
        float x=0,y=0,w=0,z=0;
        
        if(ciudad1 == 1){
            x = x1;
            y = y1;
        }
        if(ciudad1 == 2){
            x = x2;
            y = y2;
        }
        if(ciudad1 == 3){
            x = x3;
            y = y3;
        }
        if(ciudad1 == 4){
            x = x4;
            y = y4;
        }
        if(ciudad2 == 1){
            w = x1;
            z = y1;
        }
        if(ciudad2 == 2){
            w = x2;
            z = y2;
        }
        if(ciudad2 == 3){
            w = x3;
            z = y3;
        }
        if(ciudad2 == 4){
            w = x4;
            z = y4;
        }
        
        float distancia = distancia(x,y,w,z);
        
        System.out.println("La distancia entre la ciudad " + ciudad1 + " y la ciudad " + ciudad2 + " es : " + distancia);
       
        
        
    }
    
    public static float distancia(float x1, float y1, float x2, float y2){
        float resultado = ((float) pow(x2-x1,2)) + ((float) pow(y2-y1,2));
        float distancia = (float) pow(resultado,0.5);
        return distancia;
    }
    
}

