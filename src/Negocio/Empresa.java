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
public class Empresa  extends Usuario {
    private String nit;
    private String nombre;
    private String direccion;
    private String usuario;
    private String password;
    private String tipo;
    
    private ArrayList<Usuario> usuarios = new ArrayList();


    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    public Empresa() {
    }

    public Empresa(String nit, String nombre, String direccion, String usuario, String password, String tipo) {
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.usuario = usuario;
        this.password = password;
        this.tipo = tipo;
    }

    

    @Override
    public String getDocumento() {
        return nit;
    }

    @Override
    public void setDocumento(String nit) {
        this.nit = nit;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getDireccion() {
        return direccion;
    }

    @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return  nit + "," + nombre + "," + direccion;
    }
    
    public void add(Usuario emp){
        this.usuarios.add(emp);
    }
    public void mostrarUsu() {
        for (Usuario e: this.usuarios) {
            System.out.println(e.toString()+"\n");
        }
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
