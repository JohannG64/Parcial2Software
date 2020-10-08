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
    private static ArrayList<Bicycle> bics;
    
    public static Facade crearUnicaInstancia(){
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
    public void guardarBicycle(String serial, String marca, String modelo){
        Bicycle bicu = new Bicicleta(serial, marca, modelo);
        this.bics.add(bicu);
        System.out.println("Se guardo" + this.bics);
    }
    public ArrayList<Usuario> getUsuario() {
        return usuarios;
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
    
    public Bicycle buscarBicycle(String codigo){
        Bicycle bi = null;
        for(Bicycle bic: this.bics){
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
    
    public void modificarBicycle(String oldserial, String serial, String marca, String modelo){
        Bicycle bic = this.buscarBicycle(oldserial);
        
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
    public void eliminarBicycle(String serial){
        for(Bicycle bc: this.bics){
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
    
    public void anadirColor(String serial, String color){
        Bicicleta b = (Bicicleta) this.buscarBicycle(serial);
        new ColorDecorator(b, color);
    }

    @Override
    public void Login(String usuario, String contrasena) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ejecutarMetodo(String object) {
        String[] x = object.split(",");
        if(x[0].equals("Movelo")){
            if(x[1].equals("eliminarEmpresa")){
                this.eliminarEmpresa(x[2]);
            }
            if(x[1].equals("eliminarBiciUsuario")){
                this.eliminarBiciUsuario(x[2]);
            }
            if(x[1].equals("eliminarBicycle")){
                this.eliminarBiciUsuario(x[2]);
            }
            if(x[1].equals("verUsuarios")){
                for (Usuario us: this.getUsuario()) {
                    System.out.println(us.toString());
                }
            }
        }
        if(x[0].equals("Empresa")){
            if(x[1].equals("guardarEmpresa")){
                String[] y = x[2].split("-");
                this.guardarEmpresa(y[0],y[1],y[2],y[3],y[4],x[0]);
            }
            if(x[1].equals("modificarEmpresa")){
                String[] y = x[2].split("-");
                this.modificarEmpresa(y[0],y[1],y[2],y[3],y[4],y[5],x[0]);
            }
            if(x[1].equals("eliminarEmpresa")){
                this.eliminarEmpresa(x[2]);
            }
            if(x[1].equals("buscarEmpresa")){
                System.out.println(this.buscarUsuario(x[2]).toString());
            }
            if(x[1].equals("buscarBiciUsuario")){
                System.out.println(this.buscarUsuario(x[2]).toString());
            }
            if(x[1].equals("addEmpresa")){
                String[] y = x[2].split("-");
                this.addEmpresa(y[0], y[1]);
            }
            if(x[1].equals("addBiciUsuario")){
                String[] y = x[2].split("-");
                this.addBiciUsuario(y[0], y[1]);
            }
        }
        if(x[0].equals("BiciUsuario")){
            if(x[1].equals("guardarBiciUsuario")){
                String[] y = x[2].split("-");
                this.guardarBiciUsuario(y[0],y[1],y[2],y[3],y[4],x[0]);
            }
            if(x[1].equals("modificarBiciUsuario")){
                String[] y = x[2].split("-");
                this.modificarBiciUsuario(y[0],y[1],y[2],y[3],y[4],y[5],x[0]);
            }
            if(x[1].equals("eliminarBiciUsuario")){
                this.eliminarBiciUsuario(x[2]);
            }
            if(x[1].equals("buscarBiciUsuario")){
                System.out.println(this.buscarUsuario(x[2]).toString());
            }
            if(x[1].equals("crearBicycle")){
                String[] y = x[2].split("-");
                this.guardarBicycle(y[0],y[1],y[2]);
            }
            if(x[1].equals("verBicycle")){
                System.out.println(this.buscarBicycle(x[2]).showBicycle());
            }
            if(x[1].equals("modificarBicycle")){
                String[] y = x[2].split("-");
                this.modificarBicycle(y[0],y[1],y[2],y[3]);
            }
            if(x[1].equals("eliminarBicycle")){
                this.eliminarBicycle(x[2]);
            }
            if(x[1].equals("anadirColor")){
                this.anadirColor(x[2], x[3]);
            }
        }
    }
    
}
