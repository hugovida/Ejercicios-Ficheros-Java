/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mezcla_ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class Mezcla_Ficheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //FICHEROS
    File fichero1 = new File("fichero1.txt");
    File fichero2 = new File("fichero2.txt");
    File ficheroMezcla = new File("mezcla.txt");
     
    try {
    //PARA LEER Y ESCRIBIR FICHEROS
            BufferedReader lector1 = new BufferedReader(new FileReader(fichero1));
            BufferedReader lector2 = new BufferedReader(new FileReader(fichero2));
            BufferedWriter escritor = new BufferedWriter(new FileWriter(ficheroMezcla));
            String linea1 = lector1.readLine();
            String linea2 = lector2.readLine();
    //LEE CADA ARCHIVO Y ESCRIBE EN EL DE MEZCLA INTERCALANDOLOS
            while (linea1 != null || linea2 != null) {
                if (linea1 != null) {
                    escritor.write(linea1);
                    escritor.newLine();
                    linea1 = lector1.readLine();
                }
                if (linea2 != null) {
                    escritor.write(linea2);
                    escritor.newLine();
                    linea2 = lector2.readLine();
                }
            }
    //CIERRE DE FLUJO
            lector1.close();
            lector2.close();
            escritor.close();
            System.out.println("Los ficheros se han mezclado correctamente.");
        } 
    catch (IOException e) {
            System.out.println("Ha ocurrido un error al mezclar los ficheros: " + e.getMessage());
        }
    }
}
