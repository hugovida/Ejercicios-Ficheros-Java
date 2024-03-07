/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suma_numeros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class Suma_Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //VARIABLES
        String texto="";
        int suma=0;
        try{
        //FICHEROS
        File fichero = new File("Suma_Numeros.txt");
        FileReader fr = new FileReader(fichero);
        BufferedReader br = new BufferedReader(fr);
        while((texto=br.readLine())!=null){
        //SUMA LOS NUMEROS CONVIRTIENDO UN STRING A NUMERO
             suma=suma+Integer.parseInt(texto);
             }
            br.close();
        //MUESTRA POR PANTALLA LA SUMA
            System.out.println(suma);
    }
       catch(IOException e1){
        System.out.println("ERROR"+ e1.toString());
    }
    }
    
    
}
