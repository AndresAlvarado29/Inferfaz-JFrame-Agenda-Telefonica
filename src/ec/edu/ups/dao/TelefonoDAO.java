/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.idao.ITelefonoDAO;
import ec.edu.ups.modelo.Telefono;
import java.util.ArrayList;



/**
 *
 * @author HI andres
 */
public class TelefonoDAO implements ITelefonoDAO {
     //Diccionario de Telefonos
    private ArrayList telefonos;

    //Constructor
    public TelefonoDAO() {
        telefonos = new ArrayList<Telefono>();
    }

    //Metodos de la Interface ITelefono
    @Override
    public void create(Telefono telefono) {
        telefonos.add(telefono);
    }

    @Override
    public void update(Telefono telefono) {
        telefonos.add(telefono);
    }

    @Override
    public void delete(Telefono telefono) {
        telefonos.remove(telefono.getCodigo());
    }

    @Override
    public ArrayList<Telefono> findAll() {
        return telefonos;
    }

    @Override
    public Telefono read(String codigo) {
        return null;
    }
    
}
