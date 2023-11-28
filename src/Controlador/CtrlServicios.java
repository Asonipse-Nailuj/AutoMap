package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

import Modelo.Components.IServicios;
import Modelo.Components.Servicio;
import Modelo.Components.Conexion;
import Modelo.Servicios.*;
import Vista.*;

public class CtrlServicios implements ActionListener {

    Servicios view;
    IServicios servicio;

    public CtrlServicios(Servicios view, IServicios servicio) {
        this.view = view;
        this.servicio = servicio;

        asignacionBotones();
    }

    public void init() {
        view.setTitle("AUTOMAP - SERVICIO DE LIMPIEZA PARA AUTOS");
        view.setLocationRelativeTo(null);
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.btnSalir) {
            System.exit(0);
        } else if (e.getSource() == view.btnVerFacturas) {
            abrirDetalleFacturas();
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

    private void asignacionBotones() {
        view.btnCancelar.addActionListener(this);
        view.btnCotizar.addActionListener(this);
        view.btnRealizarVenta.addActionListener(this);
        view.btnSalir.addActionListener(this);
        view.btnVerFacturas.addActionListener(this);

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
        // Son los unicos elementos que tienen el estado contrario a los demás
        view.btnCotizar.setEnabled(!estado);
        view.btnVerFacturas.setEnabled(!estado);

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

    private void abrirDetalleFacturas() {
        DetalleFacturas detalleFacturas = new DetalleFacturas();
        IServicios servicio = new Servicio();
        CtrlDetalleFacturas controlador = new CtrlDetalleFacturas(detalleFacturas, view, servicio);
        controlador.init();
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

        ArrayList<Integer> servicios_seleccionados = new ArrayList<Integer>();

        if (view.cboxAplicacion.isSelected()) {
            servicio = new LimpiezaCarroceria(servicio);
            servicios_seleccionados.add(1);
        }

        if (view.cboxCarroceria.isSelected()) {
            servicio = new PorceCristalCarroceria(servicio);
            servicios_seleccionados.add(2);
        }

        if (view.cboxLavadoLlantas.isSelected()) {
            servicio = new LavadoCepilloLlantas(servicio);
            servicios_seleccionados.add(3);
        }

        if (view.cboxLavadoMano.isSelected()) {
            servicio = new LavadoMano(servicio);
            servicios_seleccionados.add(4);
        }

        if (view.cboxLavadoMotor.isSelected()) {
            servicio = new LavadoMotorVestidura(servicio);
            servicios_seleccionados.add(5);
        }

        if (view.cboxSecadora.isSelected()) {
            servicio = new SecadoraCarro(servicio);
            servicios_seleccionados.add(6);
        }

        if (view.rbtnSi.isSelected()) {
            servicio = new Domicilio(servicio);
            servicios_seleccionados.add(7);
        }

        String cliente = view.txtNombre.getText();

        int num_factura = Conexion.insertarVenta(cliente, servicio, servicios_seleccionados);

        mostrarFactura(servicios_seleccionados, cliente, num_factura);
        cambiarEstadoElementos(false);
    }

    private void mostrarFactura(ArrayList<Integer> seleccionados, String cliente, int num_factura) {
        Factura factura = new Factura();
        CtrlFactura controlador = new CtrlFactura(factura, servicio, seleccionados, num_factura, cliente);
        controlador.init();
    }
}
