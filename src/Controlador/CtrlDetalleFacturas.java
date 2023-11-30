/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Components.Conexion;
import Modelo.Components.RenderTable;
import Vista.DetalleFacturas;
import Vista.Factura;
import Vista.Servicios;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author atorres
 */
public class CtrlDetalleFacturas implements ActionListener, MouseListener {

    DetalleFacturas view;
    Servicios viewServicios;

    public CtrlDetalleFacturas(DetalleFacturas view, Servicios viewServicios) {
        this.view = view;
        this.viewServicios = viewServicios;

        view.btnSalir.addActionListener(this);

        cargarTabla();
    }

    public void init() {
        view.setTitle("AUTOMAP - DETALLE DE FACTURAS");
        view.setLocationRelativeTo(null);
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.btnSalir) {
            viewServicios.setEnabled(true);
            view.dispose();
        } else {
            System.out.println("Fila seleccionada: " + view.jTableFacturas.getRowSelectionAllowed());
        }
    }

    private void cargarTabla() {
        Map<String, Object> listado = Conexion.obtenerFacturas();

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Factura");
        model.addColumn("Cliente");
        model.addColumn("Total Venta");
        model.addColumn("Fecha Venta");
        model.addColumn("");

        int cont = Integer.parseInt(listado.get("cont").toString());

        Object[] factura = new Object[5];
        for (int i = 1; i <= cont; i++) {
            factura[0] = listado.get("FACTURA" + i).toString();
            factura[1] = listado.get("CLIENTE" + i).toString();
            factura[2] = "$" + listado.get("TOTAL_VENTA" + i).toString();
            factura[3] = listado.get("FECHA_REGISTRO" + i).toString();

            JButton verDetalle = new JButton();
            ImageIcon icono = new ImageIcon("src/imagenes/verDetalle.png");
            verDetalle.setIcon(icono);

            factura[4] = verDetalle;

            model.addRow(factura);
        }

        view.jTableFacturas.setDefaultRenderer(Object.class, new RenderTable());
        view.jTableFacturas.setModel(model);
        view.jTableFacturas.addMouseListener(this);

        view.jTableFacturas.setRowHeight(30);
        TableColumn aux_boton = view.jTableFacturas.getColumn("");
        aux_boton.setPreferredWidth(10);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (view.jTableFacturas.columnAtPoint(e.getPoint()) == 4) {
            int num_factura = Integer.parseInt((String) view.jTableFacturas.getValueAt(view.jTableFacturas.rowAtPoint(e.getPoint()), 0));

            Factura factura = new Factura();
            CtrlFactura controlador = new CtrlFactura(factura, num_factura);
            controlador.init();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
