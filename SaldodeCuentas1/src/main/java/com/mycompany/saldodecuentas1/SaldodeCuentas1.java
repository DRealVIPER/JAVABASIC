/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.saldodecuentas1;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class SaldodeCuentas1 {
      
    private void tablero(){
        Cuenta cuenta1=new Cuenta();
        Cuenta cuenta2=new Cuenta();
        boolean salida = true;
        while (salida==true){
        System.out.println("_______________________________________");
        System.out.println("Seleccione la acción que desea realizar");
        System.out.println("|                                     |");
        System.out.println("|           1.Mostrar saldo           |");
        System.out.println("|           2.Deposito                |");
        System.out.println("|           3.Retiro                  |");
        System.out.println("|           4.Salir                   |");
        System.out.println("|_____________________________________|");
        Scanner sp= new Scanner (System.in);
        int seleccion=sp.nextInt();
        switch (seleccion){

            case 1:
                System.out.println("________________________________________");
                System.out.println("|            Mostrar saldo             |");
                System.out.println("|         Seleccione la cuenta:        |");
                System.out.println("|             1.Cuenta 1               |");
                System.out.println("|             2.Cuenta 2               |");
                System.out.println("|______________________________________|");
                Scanner sp1= new Scanner (System.in);
                int opcionS=sp1.nextInt();
                if (opcionS==1){
                System.out.println("Su saldo es de: "+cuenta1.getcuenta());
                }
                if (opcionS==2){
                System.out.println("Su saldo es de: "+cuenta2.getcuenta());
                }else if (opcionS>2){
                    System.out.println("¡¡Ingrese un numero valido!!");
                }
                break;
                
        
            case 2:
                System.out.println("________________________________________");
                System.out.println("|             Depositos                |");
                System.out.println("|         Seleccione la cuenta:        |");
                System.out.println("|             1.Cuenta 1               |");
                System.out.println("|             2.Cuenta 2               |");
                System.out.println("|______________________________________|");
                Scanner sp2= new Scanner (System.in);
                int opcionD=sp2.nextInt();
                if (opcionD==1){
                System.out.println("Ingrese el valor a depositar");   
                cuenta1.setCuenta(sp2.nextInt());
                System.out.println("El deposito ha sido exitoso");
                }
                if (opcionD==2){
                System.out.println("Ingrese la cantidad a depositar");
                Scanner sp3= new Scanner(System.in);
                cuenta2.setCuenta(sp2.nextInt());
                System.out.println("El deposito ha sido exitoso");
                }else if (opcionD>2){
                    System.out.println("¡¡Ingrese un numero valido!!");
                }
                break;
            case 3:
                System.out.println("________________________________________");
                System.out.println("|              Retiros                 |");
                System.out.println("|         Seleccione la cuenta:        |");
                System.out.println("|             1.Cuenta 1               |");
                System.out.println("|             2.Cuenta 2               |");
                System.out.println("|______________________________________|");
                Scanner spR= new Scanner (System.in);
                int opcionR=spR.nextInt();
                if (opcionR==1){
                System.out.println("Ingrese el valor a retirar");   
                cuenta1.setCuenta(cuenta1.getcuenta()-spR.nextInt());     
                System.out.println("El retiro ha sido exitoso");
                }
                if (opcionR==2){
                System.out.println("Ingrese el valor a retirar");   
                cuenta2.setCuenta(cuenta2.getcuenta()-spR.nextInt());
                System.out.println("El retiro ha sido exitoso");
                }else if (opcionR>2){
                System.out.println("¡¡Ingrese un numero valido!!");
                }
                break;
            case 4:
                salida=false;
                break;
                        
            default:
                System.out.println("¡¡Ingrese un numero valido!!");
                
                        
        }
        }
    }    
    
    public static void main(String[] args) {
        SaldodeCuentas1 Banco= new SaldodeCuentas1();
        Banco.tablero();
}
}
