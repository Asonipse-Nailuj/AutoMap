/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package automap;

import Controlador.Controlador;
import Modelo.Components.Servicio;
import Vista.Factura;

/**
 *
 * @author hp
 */
public class AutoMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Factura view = new Factura();
        Servicio servicio = new Servicio();
        Controlador controlador = new Controlador(view, servicio);
        controlador.initServicio();
    }

}