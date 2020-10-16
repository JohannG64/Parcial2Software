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
public class Proxy implements InterfaceProxy{
    private static Facade facInstance;
    private static ArrayList<Stakeholder> copiaUsu;

    public Proxy() {
        Proxy.copiaUsu = new ArrayList();
    }

    public static ArrayList<Stakeholder> getCopiaUsu() {
        return copiaUsu;
    }

    public static void setCopiaUsu(ArrayList<Stakeholder> copiaUsu) {
        Proxy.copiaUsu = copiaUsu;
    }
    
    @Override
    public void Login(String usuario, String contrasena) {
        Proxy.facInstance = Facade.crearUnicaInstancia();
        String x = "";
        for (Stakeholder usu: Proxy.copiaUsu) {
            if(usu.getEmail().equals(usuario) && usu.getPassword().equals(contrasena)){
                String y = JOptionPane.showInputDialog(null, "Que metodo desea utilizar");
                String z = JOptionPane.showInputDialog(null, "Escriba los parametros del metodo separados por -/n"+
                                                             "Si el metodo no tiene parametros, dejelo vacio");
                if(!(z.equals(""))){
                    x = usu.getTipo() + "," + y + "," + z;
                }
                else{
                    x = usu.getTipo() + "," + y;
                }
                
                break;
            }
            if(usu.getEmail().equals("administrador") && usu.getPassword().equals("1234")){
                String h = JOptionPane.showInputDialog(null, "Que tipo de usuario va a utilizar");
                String y = JOptionPane.showInputDialog(null, "Que metodo desea utilizar");
                String z = JOptionPane.showInputDialog(null, "Escriba los parametros del metodo separados por -/n"+
                                                             "Si el metodo no tiene parametros, dejelo vacio");
                if(!(z.equals(""))){
                    x = h + "," + y + "," + z;
                }
                else{
                    x = h + "," + y;
                }
                
                break;
            }
        }
        if(x.equals("")){
            JOptionPane.showMessageDialog(null, "Datos Incorrectos");
        }else{
        this.ejecutarMetodo(x);
        }
        
    }

    @Override
    public void ejecutarMetodo(String object) {
        Proxy.facInstance.ejecutarMetodo(object);
    }
    
}
