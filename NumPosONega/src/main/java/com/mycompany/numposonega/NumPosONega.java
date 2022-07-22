/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.numposonega;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class NumPosONega {

    public static void main(String[] args) {
        Scanner sp=new Scanner(System.in);
        System.out.println("Ingrese un número:");
        double Num1=sp.nextDouble();
        
        if (Num1>0)
            System.out.println("El número ingresado es POSITIVO");
        else if (Num1<0)
            System.out.println("En número ingresado es NEGATIVO");
        else  
            System.out.println("El número que ingreso es CERO");        
    }
}
