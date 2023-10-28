/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package automap;

import Controlador.CtrlServicios;
import Modelo.Components.IServicios;
import Modelo.Components.Servicio;
import Vista.Servicios;

/**
 *
 * @author hp
 */
public class AutoMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Servicios view = new Servicios();
        IServicios servicio = new Servicio();
        CtrlServicios controlador = new CtrlServicios(view, servicio);
        controlador.initServicio();
    }

}