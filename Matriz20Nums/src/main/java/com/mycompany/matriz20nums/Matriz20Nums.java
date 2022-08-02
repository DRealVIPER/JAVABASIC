/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.matriz20nums;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Matriz20Nums {

    public void Matriz20() {

        
        int n = 0;
        int k = 0, l = 0;
        int M20[][] = new int[5][4];


        for (int i = 0; i < M20.length; i++) {
            for (int j = 0; j < M20[i].length; j++) {
                Scanner sp = new Scanner(System.in);
                System.out.println("Ingrese un valor: ");
                int Num=sp.nextInt();
                M20[i][j]=Num;
                System.out.println(M20[i][j]);
            }
        }
            for (int i = 0; i < M20.length; i++) {
            for (int j = 0; j < M20[i].length; j++) {
            System.out.println("-----");
            System.out.println("");
                System.out.println(M20[i][j]);
            }
            System.out.println("");
            System.out.println("-----");

        }
    }
    public static void main(String[] args) {
        Matriz20Nums Call= new Matriz20Nums();
        Call.Matriz20();
    }
}
