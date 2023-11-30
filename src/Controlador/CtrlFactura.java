package Controlador;

import Modelo.Components.Conexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.Factura;
import java.util.Map;

public class CtrlFactura implements ActionListener {

    Factura view;

    public CtrlFactura(Factura view, int num_factura) {
        this.view = view;

        view.btnThanks.addActionListener(this);

        llenarFactura(num_factura);
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

    private void llenarFactura(int num_factura) {
        Map<String, Object> detalle = Conexion.obtenerDetalleVenta(num_factura);

        view.lblNumeroFactura.setText(String.valueOf(num_factura));

        view.txtNombreFactura.setText(detalle.get("CLIENTE").toString());

        view.txtaServiciosNombre.setText(detalle.get("DESCRIPCION_VENTA").toString());

        String valores_servicios = "";
        int cont = Integer.parseInt(detalle.get("cont").toString());
        for (int i = 1; i <= cont; i++) {
            valores_servicios += "\n$ " + detalle.get("PRECIO" + i);
        }

        view.txtaServiciosValor.setText(valores_servicios);

        view.txtValorFactura.setText(detalle.get("TOTAL_VENTA").toString());
    }
}
