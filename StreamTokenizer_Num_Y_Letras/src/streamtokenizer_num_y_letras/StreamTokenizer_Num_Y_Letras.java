/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package streamtokenizer_num_y_letras;

import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class StreamTokenizer_Num_Y_Letras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VARIABLES
        Scanner e = new Scanner(System.in);
        String frase = "";
        System.out.println("INTRODUCE UNA FRASE ");
        frase = e.nextLine();
        //LLAMA AL METODO QUE CUENTA PALABRAS Y NUMEROS
        contarPalabrasYNumeros(frase);
    }
    
 //CUENTA EL NUMERO DE VECES QUE APARACE LA PALABRA INTRODUCIDA
 
    public static void contarPalabrasYNumeros(String cadena) {
        //VARIABLES
        StreamTokenizer st = new StreamTokenizer(new StringReader(cadena));
        int contadorPalabras = 0;
        int contadorNumeros = 0;
        try {
            //LEE LA CADENA Y ANALIZA EL TIPO DE DATOS QUE CONTIENE
            while (st.nextToken() != StreamTokenizer.TT_EOF) {
                //SI ES LETRA SUMA 1 AL CONTADOR DE LETRAS
                if (st.ttype == StreamTokenizer.TT_WORD) {
                    contadorPalabras++;
                } 
                //SI ES NUMERO SUMA 1 AL CONTADOR DE NUMEROS
                else if (st.ttype == StreamTokenizer.TT_NUMBER) {
                    contadorNumeros++;
                }
            }
        } catch (IOException e) {
            System.err.println("Error" + e.toString());
        }
        //MUESTRA EL RESULTADO
        System.out.println("TOTAL DE PALABRAS: " + contadorPalabras);
        System.out.println("TOTAL DE NUMEROS: " + contadorNumeros);
    }
}
