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
        if (e.getSource() == view.btnCotizar) {
            cambiarEstadoBotones(true);
        }
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

    public void cambiarEstadoBotones(boolean estado) {
        view.btnCotizar.setEnabled(!estado); // Es el unico botón que tiene el estado contrario a los demás

        view.btnCancelar.setEnabled(estado);
        view.btnRealizarVenta.setEnabled(estado);

        view.txtNombre.setEnabled(estado);

        view.cboxAplicacion.setEnabled(estado);
        view.cboxCarroceria.setEnabled(estado);
        view.cboxLavadoLlantas.setEnabled(estado);
        view.cboxLavadoMano.setEnabled(estado);
        view.cboxLavadoMotor.setEnabled(estado);
        view.cboxSecadora.setEnabled(estado);

        view.rbtnNo.setEnabled(estado);
        view.rbtnSi.setEnabled(estado);
    }
}
