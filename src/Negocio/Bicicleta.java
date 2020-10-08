/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author JohannG
 */
public class Bicicleta implements Bicycle {
    private String serial;
    private String marca;
    private String modelo;

    public Bicicleta() {
    }

    public Bicicleta(String serial, String marca, String modelo) {
        this.serial = serial;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return this.serial + "," + this.marca + "," + this.modelo;
    }

    @Override
    public String showBicycle() {
        return this.toString();    
    }
    
    
    
}
