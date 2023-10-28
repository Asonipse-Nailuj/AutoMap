package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

import Modelo.Components.IServicios;
import Modelo.Components.Servicio;
import Modelo.Servicios.Domicilio;
import Modelo.Servicios.LavadoCepilloLlantas;
import Modelo.Servicios.LavadoMano;
import Modelo.Servicios.LavadoMotorVestidura;
import Modelo.Servicios.LimpiezaCarroceria;
import Modelo.Servicios.PorceCristalCarroceria;
import Modelo.Servicios.SecadoraCarro;
import Vista.Servicios;

public class CtrlServicios implements ActionListener {

    Servicios view;
    IServicios servicio;
    int totalVenta = 0;

    public CtrlServicios(Servicios view, IServicios servicio) {
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
        if (e.getSource() == view.btnSalir) {
            System.exit(0);
        } else if (e.getSource() == view.btnCotizar) {
            cambiarEstadoElementos(true);
        } else if (e.getSource() == view.btnCancelar) {
            cambiarEstadoElementos(false);
        } else if (e.getSource() == view.btnRealizarVenta) {
            if (view.txtNombre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(view, "¡No se ha ingresado el nombre del cliente!", "NOMBRE DEL CLIENTE",
                        JOptionPane.ERROR_MESSAGE);
            } else if (view.txtValorVenta.getText().equals(String.valueOf(0))) {
                JOptionPane.showMessageDialog(view, "¡Debe escoger por lo menos un servicio para realizar la venta!",
                        "ESCOGER SERVICIOS",
                        JOptionPane.ERROR_MESSAGE);
            } else if (view.rbtnSi.isSelected()
                    && view.txtValorVenta.getText().equals(String.valueOf(new Domicilio(new Servicio()).getPrecio()))) {
                JOptionPane.showMessageDialog(view,
                        "¡Para el servicio a domicilio se debe escoger otro servicio como minimo!",
                        "ESCOGER SERVICIOS",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                realizarVenta();
            }
        } else {
            view.txtValorVenta.setText(calcularTotalVenta());
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

        view.rbtnNo.addActionListener(this);
        view.rbtnSi.addActionListener(this);
    }

    private void cambiarEstadoElementos(boolean estado) {
        view.btnCotizar.setEnabled(!estado); // Es el unico elemento que tiene el estado contrario a los demás

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

        servicio = new Servicio();

        limpiarCampos();
    }

    private void limpiarCampos() {
        view.txtNombre.setText("");
        view.txtValorVenta.setText("0");

        view.cboxAplicacion.setSelected(false);
        view.cboxCarroceria.setSelected(false);
        view.cboxLavadoLlantas.setSelected(false);
        view.cboxLavadoMano.setSelected(false);
        view.cboxLavadoMotor.setSelected(false);
        view.cboxSecadora.setSelected(false);

        view.rbtnNo.setSelected(true);
    }

    private String calcularTotalVenta() {
        int total = 0;

        if (view.cboxAplicacion.isSelected()) {
            total += new LimpiezaCarroceria(new Servicio()).getPrecio();
        }

        if (view.cboxCarroceria.isSelected()) {
            total += new PorceCristalCarroceria(new Servicio()).getPrecio();
        }

        if (view.cboxLavadoLlantas.isSelected()) {
            total += new LavadoCepilloLlantas(new Servicio()).getPrecio();
        }

        if (view.cboxLavadoMano.isSelected()) {
            total += new LavadoMano(new Servicio()).getPrecio();
        }

        if (view.cboxLavadoMotor.isSelected()) {
            total += new LavadoMotorVestidura(new Servicio()).getPrecio();
        }

        if (view.cboxSecadora.isSelected()) {
            total += new SecadoraCarro(new Servicio()).getPrecio();
        }

        if (view.rbtnSi.isSelected()) {
            total += new Domicilio(new Servicio()).getPrecio();
        }

        return total + "";
    }

    private void realizarVenta() {

        if (view.cboxAplicacion.isSelected()) {
            servicio = new LimpiezaCarroceria(servicio);
        }

        if (view.cboxCarroceria.isSelected()) {
            servicio = new PorceCristalCarroceria(servicio);
        }

        if (view.cboxLavadoLlantas.isSelected()) {
            servicio = new LavadoCepilloLlantas(servicio);
        }

        if (view.cboxLavadoMano.isSelected()) {
            servicio = new LavadoMano(servicio);
        }

        if (view.cboxLavadoMotor.isSelected()) {
            servicio = new LavadoMotorVestidura(servicio);
        }

        if (view.cboxSecadora.isSelected()) {
            servicio = new SecadoraCarro(servicio);
        }

        if (view.rbtnSi.isSelected()) {
            servicio = new Domicilio(servicio);
        }

        JOptionPane.showMessageDialog(view, "El total es: $" + servicio.getPrecio(), "prueba",
                JOptionPane.DEFAULT_OPTION);
    }
}
