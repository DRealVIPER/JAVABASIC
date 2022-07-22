/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.promediode4notas_1;

/**
 *
 * @author carlo
 */
public class Promediode4Notas_1 {

    public static void main(String[] args) {
        int Num1=20;
        int Num2=16;
        System.out.println("Los números a SUMAR son "+Num1+" y "+Num2);
        int Suma=Num1+Num2;
        System.out.println("La suma de dos numeros es "+Suma);
        System.out.println("Los números a RESTAR son "+Num1+" y "+Num2);
        int Resta=Num1-Num2;
        System.out.println("La resta de dos numeros es "+Resta);
        int Num3=20;
        int Num4=4;
        System.out.println("Los números a DIVIDIR son "+Num3+" y "+Num4);
        int Division=Num3/Num4;
        System.out.println("La división de dos numeros es "+Division);
        System.out.println("Los números a MULTIPLICAR son "+Num3+" y "+Num4);
        int Multi=Num3*Num4;
        System.out.println("La multiplicación de dos numeros es "+Multi);
        double Promedio=((Num1+Num2+Num3+Num4)/4);
        System.out.println("El promedio de 4 numeros es "+Promedio);
    }
}
