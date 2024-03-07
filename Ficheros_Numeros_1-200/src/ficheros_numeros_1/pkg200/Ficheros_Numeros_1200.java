/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheros_numeros_1.pkg200;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class Ficheros_Numeros_1200 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    try{
    File fichero = new File("pares.txt");
    FileWriter fw = new FileWriter(fichero);
    //COMPRUEBA SI EXISTE EL FICHERO
    //System.out.println(fichero.exists());
    //ESTE FOR SIRVE PARA OBTENER LOS NUMEROS PARES
    for(int i=1;i<=200;i++){
    //ESCRIBE LOS PARES
    if(i%2==0){
        fw.write(i+" ");
    }
    }
    //CIERRE DE FLUJO
    fw.close();
    }
    catch(IOException e){
        System.out.println("ERROR"+ e.toString());
    }
    }
    
    
}
