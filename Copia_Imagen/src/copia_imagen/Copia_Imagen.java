/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package copia_imagen;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class Copia_Imagen {

    /**
     * @param args the command line arguments
     */
    
	public static void main(String[] args) throws FileNotFoundException {
		
		BufferedInputStream leer = new BufferedInputStream(new FileInputStream("imagen.jpg"));
		BufferedOutputStream escribir = new BufferedOutputStream(new FileOutputStream("copia_imagen.jpg"));
		try {
                    int num = 0; 
                    byte[] buffer = new byte[1024*16];
                    while ((num = leer.read(buffer,0,1024*16)) != -1) {
			escribir.write(buffer,0,num);
                    }
                    escribir.close();
		}catch(FileNotFoundException e ) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();	
		}	
        }
    
}
