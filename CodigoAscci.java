
package poo;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class CodigoAscci {

    private static Scanner teclado = new Scanner(System.in);
    public static String codifica(String palabra){
     int codificar = 0;
     String Resultado ="";
     int llave = 8; 
     
     for(int x=0; x<palabra.length();x++){
         codificar = (int)palabra.charAt(x);
         codificar = codificar + llave;
         char caracter = (char) codificar;
         Resultado = Resultado + caracter;
         
     }
          return Resultado;
    }
    public static void main(String[]args){
        String palabra;
        String Resultado;
        System.out.println("Ingresa una palabra de 4 letras:");
        palabra = teclado.nextLine();
        Resultado = codifica(palabra);
        
         
        System.out.println("codificacion de palabra:"+Resultado);
        
         byte[] bytes = Resultado.getBytes(StandardCharsets.US_ASCII);
          
        System.out.println("Ascii  :"+bytes[0]);
        System.out.println("Ascii  : "+bytes[1]);
        System.out.println("Ascii  : "+bytes[2]);
        System.out.println("Ascii  : "+bytes[3]);
        
    }
}
