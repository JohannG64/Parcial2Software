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
public class Movelo {
    private String name;
    private String administrador;
    private String contrasena;
    private String type;

    public Movelo() {
    }

    public Movelo(String nombre, String administrador, String contrasena, String type) {
        this.name = nombre;
        this.administrador = administrador;
        this.contrasena = contrasena;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String nombre) {
        this.name = nombre;
    }

    public String getAdministrador() {
        return administrador;
    }

    public void setAdministrador(String administrador) {
        this.administrador = administrador;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
}
