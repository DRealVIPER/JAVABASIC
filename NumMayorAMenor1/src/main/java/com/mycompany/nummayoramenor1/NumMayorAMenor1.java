/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.nummayoramenor1;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class NumMayorAMenor1 {

    public static void main(String[] args) {
        Scanner sp=new Scanner(System.in);
        System.out.println("Ingrese dos números:");
        System.out.println("Ingrese el primer número");
        double Num1=sp.nextDouble();
        System.out.println("Ingrese el segundo número");
        double Num2=sp.nextDouble();
        if (Num1>Num2)
                System.out.println("El orden correcto es "+Num1+" -> "+Num2);
        else
        if (Num1<Num2)
                System.out.println("El orden correcto es "+Num2+" -> "+Num1);
        else
        if (Num1==Num2)
                System.out.println("El número "+Num1+" y el número "+Num2+" son IGUALES");
        else System.out.println("Ingrese números enteros por favor");
            
    }
    
}
