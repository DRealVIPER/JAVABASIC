/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.programadobleht4;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author carlo
 */
public class ProgramadobleHT4 {

    
    public static void main(String[] args) {
    //ArrayList
    ArrayList<VCoches> lista = new ArrayList<>();
    lista.add(new VCoches("P 2912HPD", "Hyundai", 15000, "Ascent"));
    lista.add(new VCoches("P 8134JHE", "Mercedes Benz", 7850, "G63S"));
    lista.add(new VCoches("M 4761MTA", "BMW", 3000, "1000RR"));
    lista.add(new VCoches("U 1953BEU", "Marcopolo", 55000, "G8"));
    
    //For Each
    System.out.println("Coches disponibles en sucursales:");
    
        for (VCoches VCoches : lista) {
            System.out.println("----------------------------------");
            System.out.println(VCoches.marca+" "+VCoches.modelo+" con Placa "+VCoches.placa);
        }
        
    }
}
    
