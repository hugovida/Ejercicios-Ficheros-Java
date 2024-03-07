/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheros_menu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ficheros_Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       //VARIABLES
       Scanner e = new Scanner(System.in);
       int opciones=0;
       String nombre="";
       int edad;
       String aficion="";
       String texto="";
       try{
       //FICHEROS
       File fichero = new File("datos.txt");
       //INTRODUCE LA OPCION
       do{
       System.out.println("1.CREAR FICHERO,2.MOSTRAR POR PANTALLA,3.SALIR");
       opciones=e.nextInt();
       }while(opciones<1 ||opciones>3);
       //MENU QUE CONTEMPLA LOS DISTINTOS CASOS
       switch(opciones){
        //CASO 1 CREAR FICHERO CON LOS DATOS
           case 1:
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);
            System.out.println("INTRODUCE NOMBRE");
            Scanner p = new Scanner(System.in);
            Scanner p2 = new Scanner(System.in);
            nombre=p.nextLine();
            bw.write(nombre+"\n");
            System.out.println("INTRODUCE EDAD");
            edad=p.nextInt();
            bw.write(edad+"\n");
            System.out.println("INTRODUCE AFICION");
            aficion=p2.nextLine();
            bw.write(aficion);
            bw.close();
            {}
            break;
           
        //CASO 2 MOSTRAR POR PANTALLA EL FICHERO
           case 2: 
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);
            while((texto=br.readLine())!=null){
            System.out.println(texto);
            }
            br.close();
            break;
           
        //CASO 3 SALIR DEL PROGRAMA
           case 3: System.out.println("SALIENDO DEL PROGRAMA...");
           break;
        
        //CASO ERRONEO
           default : System.out.println("ERROR");
           break;
       }
    }
       catch(IOException e1){
        System.out.println("ERROR"+ e1.toString());
    }
    }
    
}
