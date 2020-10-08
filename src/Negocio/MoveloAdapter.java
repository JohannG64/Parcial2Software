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
public class MoveloAdapter implements Usuario {

    protected String name;
    protected String usu;
    protected String pas;
    protected String typ;
    protected Movelo mov;
    

    public MoveloAdapter() {
        super();
        this.mov = new Movelo(this.name, this.usu, this.pas);
    }

    @Override
    public String getNombre() {
        return this.mov.getName();
    }

    @Override
    public void setNombre(String nombre) {
        this.mov.setName(nombre);
    }

    @Override
    public void setUsuario(String usuario) {
        this.mov.setAdministrador(usuario);
    }

    @Override
    public String getUsuario() {
        return this.mov.getAdministrador();
    }

    @Override
    public void setPassword(String password) {
        this.mov.setContrasena(name);
    }

    @Override
    public String getPassword() {
        return this.mov.getContrasena();
    }


    @Override
    public String getDireccion() {
        System.out.println("No aplica");
        return "";
    }

    @Override
    public void setDireccion(String direccion) {
        System.out.println("No aplica");
    }

    @Override
    public String getDocumento() {
        System.out.println("No aplica");
        return "";
    }

    @Override
    public void setDocumento(String nit) {
        System.out.println("No aplica");
    }

    @Override
    public String getTipo() {
        return this.mov.getType();
    }

    @Override
    public void setTipo(String tipo) {
        this.mov.setType(this.typ);
    }

}
