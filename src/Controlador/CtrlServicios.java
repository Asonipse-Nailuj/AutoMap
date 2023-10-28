package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;

import Modelo.Components.Servicio;
import Vista.Servicios;

public class CtrlServicios implements ActionListener {

    Servicios view;
    Servicio servicio;

    public CtrlServicios(Servicios view, Servicio servicio) {
        this.view = view;
        this.servicio = servicio;

        asignacionBotones();
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

    public void asignacionBotones() {
        view.btnCancelar.addActionListener(this);
        view.btnCotizar.addActionListener(this);
        view.btnRealizarVenta.addActionListener(this);
        view.btnSalir.addActionListener(this);

        view.cboxAplicacion.addActionListener(this);
        view.cboxCarroceria.addActionListener(this);
        view.cboxLavadoLlantas.addActionListener(this);
        view.cboxLavadoMano.addActionListener(this);
        view.cboxLavadoMotor.addActionListener(this);
        view.cboxSecadora.addActionListener(this);

        ButtonGroup domicilioGroup = new ButtonGroup();
        domicilioGroup.add(view.rbtnNo);
        domicilioGroup.add(view.rbtnSi);
    }
    
}
