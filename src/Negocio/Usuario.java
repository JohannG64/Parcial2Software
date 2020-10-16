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
public abstract class Usuario {

    abstract public String getDocumento();

    abstract public void setDocumento(String nit);

    abstract public String getNombre();

    abstract public void setNombre(String nombre);

    abstract public String getDireccion();

    abstract public void setDireccion(String direccion);

    abstract public void setUsuario(String usuario);

    abstract public String getUsuario();

    abstract public void setPassword(String password);

    abstract public String getPassword();

    abstract public String getTipo();

    abstract public void setTipo(String tipo);
}
