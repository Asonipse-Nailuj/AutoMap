package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Modelo.Components.IServicios;
import Modelo.Components.Servicio;
import Modelo.Servicios.*;
import Vista.Factura;

public class CtrlFactura implements ActionListener {

    Factura view;
    IServicios servicio;

    public CtrlFactura(Factura view, IServicios servicio, ArrayList<Integer> seleccionados, int num_factura,
            String cliente) {
        this.view = view;
        this.servicio = servicio;

        view.btnThanks.addActionListener(this);

        llenarFactura(seleccionados, num_factura, cliente);
    }

    public void init() {
        view.setTitle("AUTOMAP - FACTURA");
        view.setLocationRelativeTo(null);
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        view.dispose();
    }

    private void llenarFactura(ArrayList<Integer> seleccionados, int num_factura, String cliente) {
        view.lblNumeroFactura.setText(String.valueOf(num_factura));

        view.txtNombreFactura.setText(cliente);

        view.txtaServiciosNombre.setText(servicio.getDescripcion());

        String valores_servicios = "";
        for (int servicio : seleccionados) {
            switch (servicio) {
                case 1:
                    valores_servicios += view.txtaServiciosValor.getText() + "\n$ "
                            + new LimpiezaCarroceria(new Servicio()).getPrecio();
                    break;
                case 2:
                    valores_servicios += view.txtaServiciosValor.getText() + "\n$ "
                            + new PorceCristalCarroceria(new Servicio()).getPrecio();
                    break;
                case 3:
                    valores_servicios += view.txtaServiciosValor.getText() + "\n$ "
                            + new LavadoCepilloLlantas(new Servicio()).getPrecio();
                    break;
                case 4:
                    valores_servicios += view.txtaServiciosValor.getText() + "\n$ "
                            + new LavadoMano(new Servicio()).getPrecio();
                    break;
                case 5:
                    valores_servicios += view.txtaServiciosValor.getText() + "\n$ "
                            + new LavadoMotorVestidura(new Servicio()).getPrecio();
                    break;
                case 6:
                    valores_servicios += view.txtaServiciosValor.getText() + "\n$ "
                            + new SecadoraCarro(new Servicio()).getPrecio();
                    break;
                case 7:
                    valores_servicios += view.txtaServiciosValor.getText() + "\n$ "
                            + new Domicilio(new Servicio()).getPrecio();
                    break;
            }
        }

        view.txtaServiciosValor.setText(valores_servicios);

        view.txtValorFactura.setText(String.valueOf(servicio.getPrecio()));
    }
}
