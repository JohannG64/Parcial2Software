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
public interface Usuario {


    public String getDocumento();

    public void setDocumento(String nit);

    public String getNombre();

    public void setNombre(String nombre);

    public String getDireccion();

    public void setDireccion(String direccion);
    
    public void setUsuario(String usuario);
    
    public String getUsuario();
    
    public void setPassword(String password);
    
    public String getPassword();

    public String getTipo();
    
    public void setTipo(String tipo);



}
