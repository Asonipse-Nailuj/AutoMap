package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.Components.Servicio;
import Vista.Factura;

public class Controlador implements ActionListener {

    Factura view;
    Servicio servicio;

    public Controlador(Factura view, Servicio servicio) {
        this.view = view;
        this.servicio = servicio;

        
    }

    public void initServicio() {
        view.setTitle("AUTOMAP - SERVICIO DE LIMPIEZA PARA AUTOS");
        view.setLocationRelativeTo(null);
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    
}
