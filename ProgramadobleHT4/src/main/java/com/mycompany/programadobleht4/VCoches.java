/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programadobleht4;

/**
 *
 * @author carlo
 */
class VCoches {

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
        
    String placa;
    String marca;
    int km;
    String modelo;
    
    public VCoches(String placa, String marca, int km, String modelo){
    this.placa=placa;
    this.marca=marca;
    this.km=km;
    this.modelo=modelo;
    }
}
