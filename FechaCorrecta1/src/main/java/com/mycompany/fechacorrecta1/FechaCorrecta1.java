/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.fechacorrecta1;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class FechaCorrecta1 {

    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        System.out.println("Ingrese una fecha:");
        System.out.println("Ingrese el día:");
        int Dia = sp.nextInt();
        System.out.println("Ingrese el mes:");
        int Mes = sp.nextInt();
        System.out.println("Ingrese el año:");
        int Año = sp.nextInt();

        if (Dia > 0 && Dia < 32) {
            System.out.println("El ingreso del dia ha sido correcto");
        }
        if (Mes > 0 && Mes < 13) {
            System.out.println("El ingreso del mes ha sido correcto");
        }
        if (Año > 0);
        System.out.println("El ingreso del año ha sido correcto");

        switch (Mes) {
            case 1:
                System.out.println("Enero");

                if (Dia > 0 && Dia < 32) {
                    if (Año > 0) {
                        System.out.println("La fecha ingresada es: " + Dia + " Enero " + Año);
                    } else {
                        System.out.println("El año es incorrecto");
                    }
                } else {
                    System.out.println("Día incorrecto");
                }
                break;

            case 2:
                System.out.println("Febrero");

                if (Dia > 0 && Dia < 29) {
                    if (Año > 0) {
                        System.out.println("La fecha ingresada es: " + Dia + " Febrero " + Año);
                    } else {
                        System.out.println("El año es incorrecto");
                    }
                } else {
                    System.out.println("Día incorrecto");
                }

                break;

            case 3:
                System.out.println("Marzo");

                if (Dia > 0 && Dia < 32) {
                    if (Año > 0) {
                        System.out.println("La fecha ingresada es: " + Dia + " Marzo " + Año);
                    } else {
                        System.out.println("El año es incorrecto");
                    }
                } else {
                    System.out.println("Día incorrecto");
                }

                break;

            case 4:
                System.out.println("Abril");

                if (Dia > 0 && Dia < 32) {
                    if (Año > 0) {
                        System.out.println("La fecha ingresada es: " + Dia + " Abril " + Año);
                    } else {
                        System.out.println("El año es incorrecto");
                    }
                } else {
                    System.out.println("Día incorrecto");
                }

                break;

            case 5:
                System.out.println("Mayo");

                if (Dia > 0 && Dia < 32) {
                    if (Año > 0) {
                        System.out.println("La fecha ingresada es: " + Dia + " Mayo " + Año);
                    } else {
                        System.out.println("El año es incorrecto");
                    }
                } else {
                    System.out.println("Día incorrecto");
                }

                break;

            case 6:
                System.out.println("Junio");

                if (Dia > 0 && Dia < 32) {
                    if (Año > 0) {
                        System.out.println("La fecha ingresada es: " + Dia + " Junio " + Año);
                    } else {
                        System.out.println("El año es incorrecto");
                    }
                } else {
                    System.out.println("Día incorrecto");
                }

                break;

            case 7:
                System.out.println("Julio");

                if (Dia > 0 && Dia < 32) {
                    if (Año > 0) {
                        System.out.println("La fecha ingresada es: " + Dia + " Julio " + Año);
                    } else {
                        System.out.println("El año es incorrecto");
                    }
                } else {
                    System.out.println("Día incorrecto");
                }

                break;

            case 8:
                System.out.println("Agosto");

                if (Dia > 0 && Dia < 32) {
                    if (Año > 0) {
                        System.out.println("La fecha ingresada es: " + Dia + " Agosto " + Año);
                    } else {
                        System.out.println("El año es incorrecto");
                    }
                } else {
                    System.out.println("Día incorrecto");
                }

                break;

            case 9:
                System.out.println("Septiembre");

                if (Dia > 0 && Dia < 32) {
                    if (Año > 0) {
                        System.out.println("La fecha ingresada es: " + Dia + " Septiembre " + Año);
                    } else {
                        System.out.println("El año es incorrecto");
                    }
                } else {
                    System.out.println("Día incorrecto");
                }

                break;

            case 10:
                System.out.println("Octubre");

                if (Dia > 0 && Dia < 32) {
                    if (Año > 0) {
                        System.out.println("La fecha ingresada es: " + Dia + " Octubre " + Año);
                    } else {
                        System.out.println("El año es incorrecto");
                    }
                } else {
                    System.out.println("Día incorrecto");
                }

                break;

            case 11:
                System.out.println("Noviembre");

                if (Dia > 0 && Dia < 32) {
                    if (Año > 0) {
                        System.out.println("La fecha ingresada es: " + Dia + " Noviembre " + Año);
                    } else {
                        System.out.println("El año es incorrecto");
                    }
                } else {
                    System.out.println("Día incorrecto");
                }

                break;

            case 12:
                System.out.println("Diciembre");

                if (Dia > 0 && Dia < 32) {
                    if (Año > 0) {
                        System.out.println("La fecha ingresada es: " + Dia + " Diciembre " + Año);
                    } else {
                        System.out.println("El año es incorrecto");
                    }
                } else {
                    System.out.println("Día incorrecto");
                }

                break;
            default:
                throw new AssertionError();
        }

    }
}
