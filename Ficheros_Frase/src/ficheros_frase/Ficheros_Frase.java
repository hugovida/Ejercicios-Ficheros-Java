/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheros_frase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class Ficheros_Frase {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
    //VARIABLES
    //TRY PARA CONTROLAR EXCEPCIONES
    try{
    //FICHEROS  
    File fichero = new File("frase.txt");
    FileReader fr = new FileReader(fichero);
    leerFichero(fr,fichero);
    }
     catch(IOException e){
        System.out.println("ERROR"+ e.toString());
    }
    }
    
    public static void leerFichero(FileReader fr,File fichero) throws IOException{
    int num=0;
    char c=' ';
    String str =" ";
    //ELIMINA LOS ESPACIOS 
    String result;
    //WHILE PARA LEER EL FICHERO
    while(num!=-1){
        num=fr.read();
        //CONVIERTE NUMERO EN LETRA
        c=(char)num;
        //ALMACENA LA LETRA EN UN STRING
        str=str+c;
        }
    //CIERRE DE FLUJO
    fr.close();
    //ELIMINA LOS ESPACIOS
    result = str.replaceAll("\\s+","");
    //IMPRIME EL MENSAJE SIN ESPACIOS
    System.out.print(result);
    }
}
