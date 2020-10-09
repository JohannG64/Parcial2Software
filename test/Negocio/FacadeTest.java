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
        assertTrue((instance.buscarUsuario(nit))!=(null));
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of guardarBiciUsuario method, of class Facade.
     */
    @Test
    public void testGuardarBiciUsuario() {
        System.out.println("guardarBiciUsuario");
        String codigo = "823748423";
        String nombreApellido = "Carlos";
        String direccion = "Calle 34 #53-24";
        String usuario = "Carlos";
        String password = "123";
        String tipo = "BiciUsuario";
        Facade instance = Facade.crearUnicaInstancia();
        instance.guardarBiciUsuario(codigo, nombreApellido, direccion, usuario, password, tipo);
        assertTrue((instance.buscarUsuario(codigo))!=(null));
        // TODO review the generated test code and remove the default call to fail.
        //
    }

    /**
     * Test of guardarBicicleta method, of class Facade.
     */
    @Test
    public void testGuardarBicicleta() {
        System.out.println("guardarBicicleta");
        String serial = "124";
        String marca = "GW";
        String modelo = "2020";
        Facade instance = Facade.crearUnicaInstancia();
        instance.guardarBicycle(serial, marca, modelo);
        assertTrue((instance.buscarBicycle(serial)) !=(null));
        // TODO review the generated test code and remove the default call to fail.
        //
    }

    /**
     * Test of getUsuario method, of class Facade.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        Facade instance = Facade.crearUnicaInstancia();
        ArrayList<Usuario> expResult = instance.getUsuario();
        String nit = "1234567";
        String nombre = "Bavaria";
        String direccion = "Calle 86 #84-13";
        String usuario = "bavaria";
        String password = "bavaria123";
        String tipo = "Empresa";
        
        
        instance.guardarEmpresa(nit, nombre, direccion, usuario, password, tipo);
        
        String nit2 = "123";
        String nombre2 = "avaria";
        String direccion2 = "Calle 236 #84-13";
        String usuario2 = "avaria";
        String password2 = "avaria123";
        String tipo2 = "Empresa";
        
        instance.guardarEmpresa(nit2, nombre2, direccion2, usuario2, password2, tipo2);
        
        
        expResult.add(instance.buscarUsuario(nit));
        expResult.add(instance.buscarUsuario(nit2));
        ArrayList<Usuario> result = instance.getUsuario();

        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //
    }

    /**
     * Test of buscarUsuario method, of class Facade.
     */
    @Test
    public void testBuscarUsuario() {
        System.out.println("buscarUsuario");
        String nit = "1234567";
        String nombre = "Bavaria";
        String direccion = "Calle 86 #84-13";
        String usuario = "bavaria";
        String password = "bavaria123";
        String tipo = "Empresa";
        
        Facade instance = Facade.crearUnicaInstancia();
        instance.guardarEmpresa(nit, nombre, direccion, usuario, password, tipo);
        Usuario result = instance.buscarUsuario(nit);
        assertTrue((result) !=(null));
        // TODO review the generated test code and remove the default call to fail.
        //
    }

    /**
     * Test of buscarBicicleta method, of class Facade.
     */
    @Test
    public void testBuscarBicicleta() {
        System.out.println("buscarBicicleta");
        String serial = "124";
        String marca = "GW";
        String modelo = "2020";
        Facade instance = Facade.crearUnicaInstancia();
        instance.guardarBicycle(serial, marca, modelo);
        assertTrue((instance.buscarBicycle(serial))!=(null));
    }

    /**
     * Test of modificarEmpresa method, of class Facade.
     */
    @Test
    public void testModificarEmpresa() {
        System.out.println("modificarEmpresa");
        String oldnit = "1234567";
        String nombre = "Bavaria";
        String direccion = "Calle 86 #84-13";
        String usuario = "bavaria";
        String password = "bavaria123";
        String tipo = "Empresa";
        Facade instance = Facade.crearUnicaInstancia();
        instance.guardarEmpresa(oldnit, nombre, direccion, usuario, password, tipo);
        String nit = "7654321";
        instance.modificarEmpresa(oldnit, nit, nombre, direccion, usuario, password, tipo);
        assertTrue(instance.buscarUsuario(nit).getDocumento() == nit);
        // TODO review the generated test code and remove the default call to fail.
        //
    }

    /**
     * Test of modificarBiciUsuario method, of class Facade.
     */
    @Test
    public void testModificarBiciUsuario() {
        System.out.println("modificarBiciUsuario");
        String codigo = "1234567";
        String oldcodigo = "823748423";
        String nombreApellido = "Carlos";
        String direccion = "Calle 34 #53-24";
        String usuario = "Carlos";
        String password = "123";
        String tipo = "BiciUsuario";
        Facade instance = Facade.crearUnicaInstancia();
        instance.guardarBiciUsuario(oldcodigo, nombreApellido, direccion, usuario, password, tipo);
        instance.modificarBiciUsuario(oldcodigo, codigo, nombreApellido, direccion, usuario, password, tipo);
        assertTrue(instance.buscarUsuario(codigo).getDocumento() == codigo);
        // TODO review the generated test code and remove the default call to fail.
        //
    }

    /**
     * Test of modificarBicicleta method, of class Facade.
     */
    @Test
    public void testModificarBicicleta() {
        System.out.println("modificarBicicleta");
        String serial = "321";
        String oldserial = "123";
        String marca = "marca";
        String modelo = "modelo";
        Facade instance = Facade.crearUnicaInstancia();
        instance.guardarBicycle(oldserial, marca, modelo);
        instance.modificarBicycle(oldserial, serial, "marca2", "modelo2");
        assertTrue(instance.buscarBicycle(serial).getSerial() == serial);
        // TODO review the generated test code and remove the default call to fail.
        //
    }

    /**
     * Test of eliminarEmpresa method, of class Facade.
     */
    @Test
    public void testEliminarEmpresa() {
        System.out.println("modificarEmpresa");
        String oldnit = "65767";
        String nombre = "Bavaria";
        String direccion = "Calle 86 #84-13";
        String usuario = "bavaria";
        String password = "bavaria123";
        String tipo = "Empresa";
        Facade instance = Facade.crearUnicaInstancia();
        instance.guardarEmpresa(oldnit, nombre, direccion, usuario, password, tipo);
        instance.eliminarEmpresa(oldnit);
        assertTrue(instance.buscarUsuario(oldnit) == (null));
        // TODO review the generated test code and remove the default call to fail.
        //
    }

    /**
     * Test of eliminarBiciUsuario method, of class Facade.
     */
    @Test
    public void testEliminarBiciUsuario() {
         System.out.println("modificarBiciUsuario");
        String codigo = "823748423";
        String nombreApe = "Carlos";
        String direccion = "Calle 34 #53-24";
        String usuario = "Carlos";
        String password = "123";
        String tipo = "BiciUsuario";
        Facade instance = Facade.crearUnicaInstancia();
        instance.guardarBiciUsuario(codigo, nombreApe, direccion, usuario, password, tipo);
        instance.eliminarBiciUsuario(codigo);
        assertTrue(instance.buscarUsuario(codigo) == (null));
        // TODO review the generated test code and remove the default call to fail.
        //
    }

    /**
     * Test of eliminarBicicleta method, of class Facade.
     */
    @Test
    public void testEliminarBicicleta() {
        System.out.println("eliminarBicicleta");
        String serial = "125";
        String marca = "GW";
        String modelo = "2020";
        Facade instance = Facade.crearUnicaInstancia();
        instance.guardarBicycle(serial, marca, modelo);
        instance.eliminarBicycle(serial);
        System.out.println((instance.buscarBicycle(serial)));
        assertTrue((instance.buscarBicycle(serial)) == (null));
        
        // TODO review the generated test code and remove the default call to fail.
        //
    }

    /**
     * Test of addEmpresa method, of class Facade.
     */
    @Test
    public void testAddEmpresa() {
        System.out.println("addEmpresa");
        String nit = "1234567";
        String nombre = "Bavaria";
        String direccion = "Calle 86 #84-13";
        String usuario = "bavaria";
        String password = "bavaria123";
        String tipo = "Empresa";
        
        Facade instance = Facade.crearUnicaInstancia();
        instance.guardarEmpresa(nit, nombre, direccion, usuario, password, tipo);
        String nit2 = "7654321";
        String nombre2 = "Movelo";
        String direccion2 = "Calle 36 #12-75";
        String usuario2 = "movelo";
        String password2 = "movelo123";
        String tipo2 = "Empresa";
        instance.guardarEmpresa(nit2, nombre2, direccion2, usuario2, password2, tipo2);
        instance.addEmpresa(nit, nit2);
        Empresa e = (Empresa)instance.buscarUsuario(nit);
        Empresa emp = null;
        ArrayList<Empresa> empresas = e.getEmpresas();
        for (Empresa em: empresas) {
            if(em.getDocumento().equals(nit2)){
                e = em;
                break;
            }
        }
        assertTrue(!(e ==(null)));
        // TODO review the generated test code and remove the default call to fail.
        //
    }

    /**
     * Test of addBiciUsuario method, of class Facade.
     */
    @Test
    public void testAddBiciUsuario() {
        System.out.println("addBiciUsuario");
        Facade instance = Facade.crearUnicaInstancia();
        String codigo = "823748423";
        String nombreApellido = "Carlos";
        String direccion = "Calle 34 #53-24";
        String usuario = "carlos";
        String password = "123";
        String tipo = "BiciUsuario";
        
        String nit = "9832948";
        String nombre = "Bavaria";
        String direccionemp = "Calle 86 #84-13";
        String usuarioemp = "bavaria";
        String passwordemp = "bavaria123";
        String tipoemp = "Empresa";
        instance.guardarEmpresa(nit, nombre, direccionemp, usuarioemp, passwordemp, tipoemp);
        instance.guardarBiciUsuario(codigo, nombreApellido, direccion, usuario, password, tipo);
        instance.addBiciUsuario(nit, codigo);
        Empresa e = (Empresa)instance.buscarUsuario(nit);
        BiciUsuario us = null;
        ArrayList<BiciUsuario> biciUsuarios = e.getEmpleados();
        for (BiciUsuario u: biciUsuarios) {
            if(u.getDocumento().equals(codigo)){
                us = u;
                break;
            }
        }
        assertTrue(!(us == (null)));
        // TODO review the generated test code and remove the default call to fail.
        //
    }


    /**
     * Test of ejecutarMetodo method, of class Facade.
     */
    @Test
    public void testEjecutarMetodo() {
        System.out.println("ejecutarMetodo");
        String object = "Movelo,verUsuarios";
        Facade instance = Facade.crearUnicaInstancia();
        instance.ejecutarMetodo(object);
        // TODO review the generated test code and remove the default call to fail.
        //
    }
    
}
