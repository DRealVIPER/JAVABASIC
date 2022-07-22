/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.juegodenumeros1;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class JuegoDeNumeros1 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        Scanner sp = new Scanner(System.in);
        System.out.println("Escribe 2 números enteros:");
        System.out.println("Ingrese el primer número");
        int Num1=sp.nextInt();
        System.out.println("Ingrese el segundo número");
        int Num2=sp.nextInt();
        
        if (Num1==Num2){
        System.out.println("Los números ingresados son IGUALES");
        }else 
        System.out.println("Los números ingresados son DIFERENTES");  
    }
}
