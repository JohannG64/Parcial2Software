package Negocio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
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
public class BiciUsuarioTest {

    /**
     * Test of getDocumento method, of class BiciUsuario.
     */
    @Test
    public void testGetDocumento() {
        System.out.println("getDocumento");
        String codigo = "13457";
        String nombreApellido = "Pepe";
        String direccion = "Cll 80, Cra 57";
        String usuario = "miguel";
        String password = "98912";
        String tipo = "BiciUsuario";
        BiciUsuario instance = new BiciUsuario(codigo, nombreApellido, direccion, usuario, password, tipo);
        String result = instance.getDocumento();
        assertEquals(codigo, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setDocumento method, of class BiciUsuario.
     */
    @Test
    public void testSetDocumento() {
        System.out.println("setDocumento");
        String codigo = "13457";
        String nombreApellido = "Pepe";
        String direccion = "Cll 80, Cra 57";
        String usuario = "miguel";
        String password = "98912";
        String tipo = "BiciUsuario";
        BiciUsuario instance = new BiciUsuario(codigo, nombreApellido, direccion, usuario, password, tipo);
        String nCodigo = "123";
        instance.setDocumento(nCodigo);
        assertEquals(nCodigo, instance.getDocumento());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getNombre method, of class BiciUsuario.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        String codigo = "13457";
        String nombreApellido = "Pepe";
        String direccion = "Cll 80, Cra 57";
        String usuario = "miguel";
        String password = "98912";
        String tipo = "BiciUsuario";
        BiciUsuario instance = new BiciUsuario(codigo, nombreApellido, direccion, usuario, password, tipo);
        String result = instance.getNombre();
        assertEquals(nombreApellido, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setNombre method, of class BiciUsuario.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String codigo = "13457";
        String nombreApellido = "Pepe";
        String direccion = "Cll 80, Cra 57";
        String usuario = "miguel";
        String password = "98912";
        String tipo = "BiciUsuario";
        BiciUsuario instance = new BiciUsuario(codigo, nombreApellido, direccion, usuario, password, tipo);
        String nNombre = "Carlos";
        instance.setNombre(nNombre);
        assertEquals(nNombre, instance.getNombre());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getDireccion method, of class BiciUsuario.
     */
    @Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        String codigo = "13457";
        String nombreApellido = "Pepe";
        String direccion = "Cll 80, Cra 57";
        String usuario = "miguel";
        String password = "98912";
        String tipo = "BiciUsuario";
        BiciUsuario instance = new BiciUsuario(codigo, nombreApellido, direccion, usuario, password, tipo);
        String result = instance.getDireccion();
        assertEquals(direccion, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setDireccion method, of class BiciUsuario.
     */
    @Test
    public void testSetDireccion() {
        System.out.println("setDireccion");
        String codigo = "13457";
        String nombreApellido = "Pepe";
        String direccion = "Cll 80, Cra 57";
        String usuario = "miguel";
        String password = "98912";
        String tipo = "BiciUsuario";
        BiciUsuario instance = new BiciUsuario(codigo, nombreApellido, direccion, usuario, password, tipo);
        String nDireccion = "Cll 25, Cra 14";
        instance.setDireccion(nDireccion);
        assertEquals(nDireccion, instance.getDireccion());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getBicicletas method, of class BiciUsuario.
     */
    @Test
    public void testGetBicicletas() {
        System.out.println("getBicicletas");
        String codigo = "13457";
        String nombreApellido = "Pepe";
        String direccion = "Cll 80, Cra 57";
        String usuario = "miguel";
        String password = "98912";
        String tipo = "BiciUsuario";
        BiciUsuario instance = new BiciUsuario(codigo, nombreApellido, direccion, usuario, password, tipo);
        String serial = "8274";
        String marca = "GW";
        String modelo = "2013";
        Bicicleta bic = new Bicicleta(serial, marca, modelo);
        instance.add(bic);
        ArrayList<Bicycle> expResult = new ArrayList();
        expResult.add(bic);
        ArrayList<Bicycle> result = instance.getBicicletas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of add method, of class BiciUsuario.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        String serial = "8274";
        String marca = "GW";
        String modelo = "2013";
        Bicicleta bic = new Bicicleta(serial, marca, modelo);
        String codigo = "13457";
        String nombreApellido = "Pepe";
        String direccion = "Cll 80, Cra 57";
        String usuario = "miguel";
        String password = "98912";
        String tipo = "BiciUsuario";
        BiciUsuario instance = new BiciUsuario(codigo, nombreApellido, direccion, usuario, password, tipo);
        instance.add(bic);
        ArrayList<Bicycle> bics = instance.getBicicletas();
        Bicycle bic2 = null;
        for(Bicycle b: bics){
            if(b.equals(bic)){
                bic2 = b;
            }
        }
        assertEquals(bic2,bic);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setUsuario method, of class BiciUsuario.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        String codigo = "13457";
        String nombreApellido = "Pepe";
        String direccion = "Cll 80, Cra 57";
        String usuario = "miguel";
        String password = "98912";
        String tipo = "BiciUsuario";
        BiciUsuario instance = new BiciUsuario(codigo, nombreApellido, direccion, usuario, password, tipo);
        String nUsuario = "Camilo";
        instance.setUsuario(nUsuario);
        assertEquals(nUsuario, instance.getUsuario());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getUsuario method, of class BiciUsuario.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        String codigo = "13457";
        String nombreApellido = "Pepe";
        String direccion = "Cll 80, Cra 57";
        String usuario = "miguel";
        String password = "98912";
        String tipo = "BiciUsuario";
        BiciUsuario instance = new BiciUsuario(codigo, nombreApellido, direccion, usuario, password, tipo);
        String result = instance.getUsuario();
        assertEquals(usuario, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setPassword method, of class BiciUsuario.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String codigo = "13457";
        String nombreApellido = "Pepe";
        String direccion = "Cll 80, Cra 57";
        String usuario = "miguel";
        String password = "98912";
        String tipo = "BiciUsuario";
        BiciUsuario instance = new BiciUsuario(codigo, nombreApellido, direccion, usuario, password, tipo);
        String nPassword = "newpass";
        instance.setPassword(nPassword);
        assertEquals(nPassword, instance.getPassword());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getPassword method, of class BiciUsuario.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        String codigo = "13457";
        String nombreApellido = "Pepe";
        String direccion = "Cll 80, Cra 57";
        String usuario = "miguel";
        String password = "98912";
        String tipo = "BiciUsuario";
        BiciUsuario instance = new BiciUsuario(codigo, nombreApellido, direccion, usuario, password, tipo);
        String result = instance.getPassword();
        assertEquals(password, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getTipo method, of class BiciUsuario.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        String codigo = "13457";
        String nombreApellido = "Pepe";
        String direccion = "Cll 80, Cra 57";
        String usuario = "miguel";
        String password = "98912";
        String tipo = "BiciUsuario";
        BiciUsuario instance = new BiciUsuario(codigo, nombreApellido, direccion, usuario, password, tipo);
        String result = instance.getTipo();
        assertEquals(tipo, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setTipo method, of class BiciUsuario.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        String codigo = "13457";
        String nombreApellido = "Pepe";
        String direccion = "Cll 80, Cra 57";
        String usuario = "miguel";
        String password = "98912";
        String tipo = "bic";
        BiciUsuario instance = new BiciUsuario(codigo, nombreApellido, direccion, usuario, password, tipo);
        String nTipo = "BiciUsuario";
        instance.setTipo(nTipo);
        assertEquals(nTipo, instance.getTipo());
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
