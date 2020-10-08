/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author afpic
 */
public class ProxyTest {

    /**
     * Test of Login method, of class Proxy.
     */
    @Test
    public void testLogin() {
        System.out.println("Login");
        String nit = "1234567";
        String nombre = "Bavaria";
        String direccion = "Calle 86 #84-13";
        String usuario = "bavaria";
        String password = "bavaria123";
        String tipo = "Empresa";
        Facade instanceFacade = Facade.crearUnicaInstancia();
        instanceFacade.guardarEmpresa(nit, nombre, direccion, usuario, password, tipo);
        Proxy instanceProxy = new Proxy();
        instanceProxy.Login(usuario, password);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of ejecutarMetodo method, of class Proxy.
     */
    @Test
    public void testEjecutarMetodo() {
        System.out.println("ejecutarMetodo");
        String nit = "1234567";
        String nombre = "Bavaria";
        String direccion = "Calle 86 #84-13";
        String usuario = "bavaria";
        String password = "bavaria123";
        String tipo = "Empresa";
        Facade facinstance = Facade.crearUnicaInstancia();
        facinstance.guardarEmpresa(nit, nombre, direccion, usuario, password, tipo);
        String object = "Empresa,eliminarEmpresa,1234567";
        Proxy proxinstance = new Proxy();
        proxinstance.ejecutarMetodo(object);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
