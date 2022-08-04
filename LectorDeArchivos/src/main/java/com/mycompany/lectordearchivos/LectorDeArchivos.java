/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lectordearchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author carlo
 */
public class LectorDeArchivos {

    public void lectorarchivo(){
    File archivo; 
    FileReader leer; 
    BufferedReader almacenamiento; 
        
    String cadena="";

    
    archivo = new File("3nums.txt");
    try {
            leer=new FileReader(archivo);
            almacenamiento= new BufferedReader(leer);
            cadena="";
            String linea="";
            while ((linea=almacenamiento.readLine())!=null ) {
                System.out.println(linea);
        }
    }
            catch (Exception e) {
                System.out.println("El archivo no se encontro");
        }
    }
    public static void main(String[] args) {
        LectorDeArchivos Archivo= new LectorDeArchivos();
        Archivo.lectorarchivo();
    }
}
