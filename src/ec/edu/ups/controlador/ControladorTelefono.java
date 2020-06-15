/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.idao.ITelefonoDAO;
import ec.edu.ups.modelo.Telefono;
import ec.edu.ups.vista.VentanaSecundaria;
import java.util.ArrayList;
import javax.swing.JOptionPane;



/**
 *
 * @author HI andres
 */
public class ControladorTelefono {
     //Objetos vista
    private VentanaSecundaria ventanaTelefonos;
    //Objeto Telefono
    private Telefono telefono;
    //Objetos DAO
    private ITelefonoDAO telefonoDAO ;

    //Constructor sin parametros
    public ControladorTelefono() {
        
    }

    //Constructor con parametros

    public ControladorTelefono(VentanaSecundaria ventanaTelefonos, ITelefonoDAO telefonoDAO) {
        this.ventanaTelefonos = ventanaTelefonos;
        this.telefonoDAO = telefonoDAO;
    }
    

    //Crea un Telefono atraves de la vista y lo agrega al diccionario creado en el DAO
    public void crear(Telefono telefono) {
        
        telefonoDAO.create(telefono);
        JOptionPane.showMessageDialog(ventanaTelefonos, "Telefono Registrado");
      
    }  
    //Muestra todos los Telefonos existentes en el DAO
    public ArrayList<Telefono>verTelefonos() {
        return telefonoDAO.findAll();
        
       
    }
}
