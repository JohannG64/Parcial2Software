/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.ArrayList;

/**
 *
 * @author JohannG
 */
public class BiciUsuario implements Usuario{
    private String codigo;
    private String nombreApellido;
    private String direccion;
    private String usuario;
    private String password;
    private String tipo;
    private ArrayList<Bicicleta> bicicletas = new ArrayList();

    public BiciUsuario() {
    }

    public BiciUsuario(String codigo, String nombreApellido, String direccion, String usuario, String password, String tipo) {
        this.codigo = codigo;
        this.nombreApellido = nombreApellido;
        this.direccion = direccion;
        this.usuario = usuario;
        this.password = password;
        this.tipo = tipo;
    }


    @Override
    public String toString() {
        return  codigo + "," + nombreApellido + "," + direccion + "," + bicicletas ;
    }
    @Override
    public String getDocumento() {
        return codigo;
    }

    @Override
    public void setDocumento(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getNombre() {
        return nombreApellido;
    }

    @Override
    public void setNombre(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    @Override
    public String getDireccion() {
        return direccion;
    }

    @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Bicicleta> getBicicletas() {
        return bicicletas;
    }
    public void add(Bicicleta bic){
        this.bicicletas.add(bic);
    }

    @Override
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String getUsuario() {
        return this.usuario;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getTipo() {
        return this.tipo;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}

