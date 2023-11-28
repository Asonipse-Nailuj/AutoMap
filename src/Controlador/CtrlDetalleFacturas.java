/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Components.IServicios;
import Vista.DetalleFacturas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author atorres
 */
public class CtrlDetalleFacturas implements ActionListener {

    DetalleFacturas view;
    IServicios servicio;

    public CtrlDetalleFacturas(DetalleFacturas view, IServicios servicio) {
        this.view = view;
        this.servicio = servicio;
    }

    public void init() {
        view.setTitle("AUTOMAP - DETALLE DE FACTURAS");
        view.setLocationRelativeTo(null);
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}