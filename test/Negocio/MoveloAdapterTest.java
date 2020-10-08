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
 * @author JohannG
 */
public class MoveloAdapterTest {
    /**
     * Test of getNombre method, of class MoveloAdapter.
     */
    @Test
    public void testGetNombre() {
        MoveloAdapter instance = new MoveloAdapter();
        String expResult = "jose";
        instance.setNombre("jose");
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNombre method, of class MoveloAdapter.
     */
    @Test
    public void testSetNombre() {
        String nombre = "movelo";
        MoveloAdapter instance = new MoveloAdapter();
        instance.setNombre(nombre);
        assertEquals(nombre, instance.getNombre());
    }

    /**
     * Test of setUsuario method, of class MoveloAdapter.
     */
    @Test
    public void testSetUsuario() {
        String usuario = "administrador";
        MoveloAdapter instance = new MoveloAdapter();
        instance.setUsuario(usuario);
        assertEquals(usuario, instance.getUsuario());
    }

    /**
     * Test of getUsuario method, of class MoveloAdapter.
     */
    @Test
    public void testGetUsuario() {
        MoveloAdapter instance = new MoveloAdapter();
        String expResult = "administrador";
        instance.setUsuario("administrador");
        String result = instance.getUsuario();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPassword method, of class MoveloAdapter.
     */
    @Test
    public void testSetPassword() {
        String password = "1234";
        MoveloAdapter instance = new MoveloAdapter();
        instance.setPassword(password);
        assertEquals(password, instance.getPassword());
    }

    /**
     * Test of getPassword method, of class MoveloAdapter.
     */
    @Test
    public void testGetPassword() {
        MoveloAdapter instance = new MoveloAdapter();
        String expResult = "12345";
        instance.setPassword("12345");
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDireccion method, of class MoveloAdapter.
     */
    @Test
    public void testGetDireccion() {
        MoveloAdapter instance = new MoveloAdapter();
        String expResult = "";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDireccion method, of class MoveloAdapter.
     */
    @Test
    public void testSetDireccion() {
        System.out.println("setDireccion");
        String direccion = "";
        MoveloAdapter instance = new MoveloAdapter();
        instance.setDireccion(direccion);
    }

    /**
     * Test of getDocumento method, of class MoveloAdapter.
     */
    @Test
    public void testGetDocumento() {
        MoveloAdapter instance = new MoveloAdapter();
        String expResult = "";
        String result = instance.getDocumento();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDocumento method, of class MoveloAdapter.
     */
    @Test
    public void testSetDocumento() {
        System.out.println("setDocumento");
        String nit = "";
        MoveloAdapter instance = new MoveloAdapter();
        instance.setDocumento(nit);
    }

    /**
     * Test of getTipo method, of class MoveloAdapter.
     */
    @Test
    public void testGetTipo() {
        MoveloAdapter instance = new MoveloAdapter();
        String expResult = "movelo";
        instance.setTipo(expResult);
        System.out.println("tipo" +instance.getTipo());
        assertEquals(expResult, instance.getTipo());
    }

    /**
     * Test of setTipo method, of class MoveloAdapter.
     */
    @Test
    public void testSetTipo() {
        String tipo = "Movelo";
        MoveloAdapter instance = new MoveloAdapter();
        instance.setTipo(tipo);
        assertEquals(tipo, instance.getTipo());
    }
    
}
