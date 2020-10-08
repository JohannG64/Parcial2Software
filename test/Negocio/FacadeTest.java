/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

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
public class FacadeTest {
    
    public FacadeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of crearunicaInstancia method, of class Facade.
     */
    @Test
    public void testCrearUnicaInstancia() {
        System.out.println("crearunicaInstancia");
        Facade result = Facade.crearUnicaInstancia();
        Facade expResult = Facade.crearUnicaInstancia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail. 
    }

    /**
     * Test of guardarEmpresa method, of class Facade.
     */
    @Test
    public void testGuardarEmpresa() {
        System.out.println("guardarEmpresa");
        String nit = "1234567";
        String nombre = "Bavaria";
        String direccion = "Calle 86 #84-13";
        String usuario = "bavaria";
        String password = "bavaria123";
        String tipo = "Empresa";
        Facade instance = Facade.crearUnicaInstancia();
        instance.guardarEmpresa(nit, nombre, direccion, usuario, password, tipo);
        assertTrue(!(instance.buscarUsuario(nit)).equals(null));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of guardarBiciUsuario method, of class Facade.
     */
    @Test
    public void testGuardarBiciUsuario() {
        System.out.println("guardarBiciUsuario");
        String codigo = "";
        String nombreApellido = "";
        String direccion = "";
        String usuario = "";
        String password = "";
        String tipo = "";
        Facade instance = Facade.crearUnicaInstancia();
        instance.guardarBiciUsuario(codigo, nombreApellido, direccion, usuario, password, tipo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of guardarBicicleta method, of class Facade.
     */
    @Test
    public void testGuardarBicicleta() {
        System.out.println("guardarBicicleta");
        String serial = "";
        String marca = "";
        String modelo = "";
        Facade instance = Facade.crearUnicaInstancia();
        instance.guardarBicycle(serial, marca, modelo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuario method, of class Facade.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        Facade instance = Facade.crearUnicaInstancia();
        ArrayList<Usuario> expResult = null;
        ArrayList<Usuario> result = instance.getUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuario method, of class Facade.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        ArrayList<Usuario> usuarios = null;
        Facade instance = Facade.crearUnicaInstancia();
        instance.setUsuario(usuarios);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscarUsuario method, of class Facade.
     */
    @Test
    public void testBuscarUsuario_String() {
        System.out.println("buscarUsuario");
        String codigo = "";
        Facade instance = Facade.crearUnicaInstancia();
        Usuario expResult = null;
        Usuario result = instance.buscarUsuario(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscarUsuario method, of class Facade.
     */
    @Test
    public void testBuscarUsuario_String_String() {
        System.out.println("buscarUsuario");
        String user = "";
        String pass = "";
        Facade instance = Facade.crearUnicaInstancia();
        Usuario expResult = null;
        Usuario result = instance.buscarUsuario(user, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of buscarBicicleta method, of class Facade.
     */
    @Test
    public void testBuscarBicicleta() {
        System.out.println("buscarBicicleta");
        String codigo = "";
        Facade instance = Facade.crearUnicaInstancia();
        Bicicleta expResult = null;
        Bicycle result = instance.buscarBicycle(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of modificarEmpresa method, of class Facade.
     */
    @Test
    public void testModificarEmpresa() {
        System.out.println("modificarEmpresa");
        String oldnit = "";
        String nit = "";
        String nombre = "";
        String direccion = "";
        String usuario = "";
        String password = "";
        String tipo = "";
        Facade instance = Facade.crearUnicaInstancia();
        instance.modificarEmpresa(oldnit, nit, nombre, direccion, usuario, password, tipo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of modificarBiciUsuario method, of class Facade.
     */
    @Test
    public void testModificarBiciUsuario() {
        System.out.println("modificarBiciUsuario");
        String oldcodigo = "";
        String codigo = "";
        String nombreApe = "";
        String direccion = "";
        String usuario = "";
        String password = "";
        String tipo = "";
        Facade instance = Facade.crearUnicaInstancia();
        instance.modificarBiciUsuario(oldcodigo, codigo, nombreApe, direccion, usuario, password, tipo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of modificarBicicleta method, of class Facade.
     */
    @Test
    public void testModificarBicicleta() {
        System.out.println("modificarBicicleta");
        String oldserial = "";
        String serial = "";
        String marca = "";
        String modelo = "";
        Facade instance = Facade.crearUnicaInstancia();
        instance.modificarBicycle(oldserial, serial, marca, modelo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarEmpresa method, of class Facade.
     */
    @Test
    public void testEliminarEmpresa() {
        System.out.println("eliminarEmpresa");
        String codigo = "";
        Facade instance = Facade.crearUnicaInstancia();
        instance.eliminarEmpresa(codigo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarBiciUsuario method, of class Facade.
     */
    @Test
    public void testEliminarBiciUsuario() {
        System.out.println("eliminarBiciUsuario");
        String codigo = "";
        Facade instance = Facade.crearUnicaInstancia();
        instance.eliminarBiciUsuario(codigo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarBicicleta method, of class Facade.
     */
    @Test
    public void testEliminarBicicleta() {
        System.out.println("eliminarBicicleta");
        String serial = "";
        Facade instance = Facade.crearUnicaInstancia();
        instance.eliminarBicycle(serial);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addEmpresa method, of class Facade.
     */
    @Test
    public void testAddEmpresa() {
        System.out.println("addEmpresa");
        String nit = "";
        String emp = "";
        Facade instance = Facade.crearUnicaInstancia();
        instance.addEmpresa(nit, emp);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addBiciUsuario method, of class Facade.
     */
    @Test
    public void testAddBiciUsuario() {
        System.out.println("addBiciUsuario");
        String nit = "";
        String codigo = "";
        Facade instance = Facade.crearUnicaInstancia();
        instance.addBiciUsuario(nit, codigo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Login method, of class Facade.
     */
    @Test
    public void testLogin() {
        System.out.println("Login");
        this.testGuardarEmpresa();
        String usuario = "";
        String contrasena = "";
        Facade instance = Facade.crearUnicaInstancia();
        instance.Login(usuario, contrasena);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ejecutarMetodo method, of class Facade.
     */
    @Test
    public void testEjecutarMetodo() {
        System.out.println("ejecutarMetodo");
        String object = "";
        Facade instance = Facade.crearUnicaInstancia();
        instance.ejecutarMetodo(object);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
