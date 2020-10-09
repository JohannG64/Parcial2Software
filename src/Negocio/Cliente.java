/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import javax.swing.JOptionPane;

/**
 *
 * @author JohannG
 */
public class Cliente {
    public static void main (String[] args){
        //String user = JOptionPane.showInputDialog(null, "Ingrese el usuario");
        //String pass = JOptionPane.showInputDialog(null, "Ingrese la contrasena");
        //Proxy prox = new Proxy();
        //prox.Login(user, pass);
        Facade fac = Facade.crearUnicaInstancia();
        fac.ejecutarMetodo("BiciUsuario,crearBicycle,123-GW-2020");
        fac.ejecutarMetodo("BiciUsuario,anadirColor,123-Rojo");
        fac.ejecutarMetodo("BiciUsuario,verBicycle,123");
    }
}
