/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringtokenizer;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Usuario
 */
public class StringTokenizer_Palabra{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VARIABLES
        Scanner e = new Scanner(System.in);
        String frase = "";
        String palabra = "";
        int cantidad =0;
        //INTRODUCE LA FRASE
        System.out.println("INTRODUCE UNA FRASE");
        frase=e.nextLine();
        //INTRODUCE LA PALABRA
        System.out.println("INTRODUCE UNA PALABRA PARA BUSCAR");
        palabra=e.nextLine();
        //ALMACENA EN NUMERO DE VECES DEVUELTO POR LA FUNCION
        cantidad = contarPalabra(frase, palabra);
        //MUESTRA EL RESULTADO POR PANTALLA
        System.out.println("LA PALABRA " + palabra + " APARECE " + cantidad + " VECES");
    }
    //CUENTA EL NUMERO DE VECES QUE APARACE LA PALABRA INTRODUCIDA
    public static int contarPalabra(String frase, String palabra) {
        //ALMACENA EN EL TOKENIZER LA FRASE
        StringTokenizer st = new StringTokenizer(frase," ");
        int contador = 0;
        String token="";
        //RECORRE LA FRASE
        while (st.hasMoreTokens()) {
            //ALMACENA CADA TOKEN
            token = st.nextToken();
            //SI COINCIDE CON LA PALABRA SUMA 1 AL CONTADOR
            if (token.equalsIgnoreCase(palabra)) {
                contador++;
            }
        }
        return contador;
    }

}
