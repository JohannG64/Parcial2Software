/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author JohannG
 */
public class Facade implements InterfaceProxy{
    private static Facade unica = null;
    private static ArrayList<Usuario> usuarios;
    private static ArrayList<Bicicleta> bics;
    
    public static Facade crearunicaInstancia(){
        if(Facade.unica == null){
            Facade.unica = new Facade();
            Facade.usuarios = new ArrayList();
            Facade.bics = new ArrayList();
        }
        return Facade.unica;
    }
    
    public void guardarEmpresa(String nit, String nombre, String direccion, String usuario, String password, String tipo){
        Empresa emp = new Empresa(nit, nombre, direccion, usuario, password, tipo);
        this.usuarios.add(emp);
    }
    
    public void guardarBiciUsuario(String codigo, String nombreApellido, String direccion, String usuario, String password, String tipo){
        BiciUsuario a = new BiciUsuario(codigo, nombreApellido, direccion, usuario, password, tipo);
        this.usuarios.add(a);
    }
    public void guardarBicicleta(String serial, String marca, String modelo){
        Bicicleta bicu = new Bicicleta(serial, marca, modelo);
        this.bics.add(bicu);
        System.out.println("Se guardo" + this.bics);
    }
    public ArrayList<Usuario> getUsuario() {
        return usuarios;
    }

    public void setUsuario(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    public Usuario buscarUsuario(String codigo){
        Usuario em = null;
        for(Usuario emp: this.usuarios){
            if(codigo.equals(emp.getDocumento())){
                System.out.println("entro");
                em = emp;
                break;
                
            }
        }
        return em;
    }
    
    public Usuario buscarUsuario(String user, String pass){
        Usuario em = null;
        for(Usuario emp: this.usuarios){
            if(user.equals(emp.getUsuario()) && pass.equals(emp.getPassword())){
                em = emp;
                break;
                
            }
        }
        return em;
    }
    
    public Bicicleta buscarBicicleta(String codigo){
        Bicicleta bi = null;
        for(Bicicleta bic: this.bics){
            if(codigo.equals(bic.getSerial())){
                bi = bic;
                break;
            }
        }
        return bi;
    }
    
    public void modificarEmpresa(String oldnit, String nit, String nombre, String direccion, String usuario, String password, String tipo){
        Empresa emp = (Empresa) this.buscarUsuario(oldnit);
        
        this.usuarios.remove(emp);
      
            emp.setDocumento(nit);
        
            emp.setNombre(nombre);
        
            emp.setDireccion(direccion);
            
            emp.setUsuario(usuario);
            
            emp.setPassword(password);
            
            emp.setTipo(tipo);
        
        this.usuarios.add(emp);
        JOptionPane.showMessageDialog(null, "Modificacion exisosa");
    }
    
    public void modificarBiciUsuario(String oldcodigo, String codigo, String nombreApe, String direccion, String usuario, String password, String tipo) {
        BiciUsuario empl = (BiciUsuario)this.buscarUsuario(oldcodigo);
        System.out.println(Facade.usuarios);
        this.usuarios.remove(empl);
        System.out.println(empl);
            empl.setDocumento(codigo);
        
            empl.setNombre(nombreApe);
 
            empl.setDireccion(direccion);
            
            empl.setUsuario(usuario);
            
            empl.setPassword(password);
            
            empl.setTipo(tipo);
        
        this.usuarios.add(empl);
        JOptionPane.showMessageDialog(null, "Modificacion exitosa");
    }
    
    public void modificarBicicleta(String oldserial, String serial, String marca, String modelo){
        Bicicleta bic = this.buscarBicicleta(oldserial);
        
        this.bics.remove(bic);
        bic.setSerial(serial);
        bic.setMarca(marca);
        bic.setModelo(modelo);
        
        this.bics.add(bic);
        JOptionPane.showMessageDialog(null, "Modificacion exisosa");
    }
    
    public void eliminarEmpresa(String codigo){
         
         this.usuarios.remove(this.buscarUsuario(codigo));
         JOptionPane.showMessageDialog(null, "Eliminacion exitosa");
                
    }
    public void eliminarBiciUsuario(String codigo){
        this.usuarios.remove(this.buscarUsuario(codigo));
        
    }
    public void eliminarBicicleta(String serial){
        for(Bicicleta bc: this.bics){
            if(serial.equals(bc.getSerial())){
                this.bics.remove(bc);
                JOptionPane.showMessageDialog(null, "Eliminacion exitosa");
                break;
            }
        }
    }
    public void addEmpresa(String nit, String emp){
        Empresa e = (Empresa) this.buscarUsuario(nit);
        e.add((Empresa)this.buscarUsuario(emp));
    }
    
    public void addBiciUsuario(String nit, String codigo){
        Empresa e = (Empresa) this.buscarUsuario(nit);
        e.add((BiciUsuario) this.buscarUsuario(codigo));
    }

    @Override
    public void Login(String usuario, String contrasena) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ejecutarMetodo(String object) {
        String[] x = object.split(",");
        if(x[0].equals("Movelo")){
            
        }
        if(x[0].equals("Empresa")){
            
        }
        if(x[0].equals("BiciUsuario")){
            
        }
    }
    
}
