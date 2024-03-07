/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package copia_en_ficheros;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class Copia_En_Ficheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
    try{
    final int tamano = 1024*16;
    int cantidadBytes = 0; 
    byte[] buffer = new byte[tamano];
    BufferedInputStream    bin = new BufferedInputStream(new FileInputStream("archivo1.txt"));
    BufferedOutputStream    bout = new BufferedOutputStream(new FileOutputStream("archivo2.txt"));
    BufferedOutputStream    bout2 = new BufferedOutputStream(new FileOutputStream("archivo3.txt"));
    while ((cantidadBytes = bin.read(buffer,0,tamano)) != -1) {
    bout.write(buffer,0,cantidadBytes);
    bout.write(buffer,0,cantidadBytes);
    
	}
    }
    catch(FileNotFoundException e) {
    e.printStackTrace();
    }
    catch(IOException e) {
    e.printStackTrace();	
    }
    
}
}
