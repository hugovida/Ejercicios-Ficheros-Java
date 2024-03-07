/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package flujo_arraybytes0.pkg9;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class Flujo_ArrayBytes09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TRY-CATCH PARA CONTROLAR EXCEPCIONES 
        try {
            //BYTE QUE GUARDA LOS DIGITOS DEL 0 AL 9 
            byte[] digitos = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            //FLUJO DE EBTRADA QUE SE LE PASA EL BYTE DE NUMEROS
            ByteArrayInputStream flujoEntrada = new ByteArrayInputStream(digitos);
            //VARIABLES
            int lector=0;
            String texto="";
            //LEE HASTA QUE MUESTRA -1 QUE QUIERE DECIR QUE YA HA TERMINADO
            while((lector=flujoEntrada.read())!=-1){
               //CONVIERTE A STRING LOS NUMEROS
               texto=Integer.toString(lector);
               //MUESTRA LOS NUMEROS
               System.out.println(texto+" ");
            }
            //CIERRA EL FLUJO
            flujoEntrada.close();  
        } 
        catch (IOException e) {
            System.out.println("ERROR"+e.toString());
        } 
    
    }
    
}
