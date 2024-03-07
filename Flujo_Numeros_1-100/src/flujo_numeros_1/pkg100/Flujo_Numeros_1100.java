/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package flujo_numeros_1.pkg100;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class Flujo_Numeros_1100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //TRY-CATCH PARA CONTROLAR EXCEPCIONES 
        try {
            //CREACION ARCHIVO
            File archivo = new File("numeros.txt"); 
            FileOutputStream escribir = new FileOutputStream(archivo);
            //FOR PARA OBTENER LOS NUMEROS
            for (int i = 0; i <= 100; i++) {
                //ALMACENA EL NUMERO CONVIRTIENDOLO A STRING
                String numero = Integer.toString(i);
                //ESTE ARRAY ALMACENA EL STRING DE NUMEROS COMO BYTE
                byte[] bytes = numero.getBytes();
                //ESCRIBE EN EL FICHERO CADA NUMERO Y OBTIENE LOS BYTES
                escribir.write(bytes);
                escribir.write("\n".getBytes());
            }
            //CIERRA EL FLUJO
            escribir.close();
        } 
        catch (IOException e) {
            System.out.println("ERROR"+e.toString());
           
        }
    }
    
}
