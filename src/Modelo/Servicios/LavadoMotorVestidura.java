package Modelo.Servicios;

import Modelo.Components.IServicios;
import Modelo.Components.ServicioDecorator;

public class LavadoMotorVestidura extends ServicioDecorator {

    private IServicios servicios;

    public LavadoMotorVestidura(IServicios s) {
        super(s);
        this.servicios = s;
    }

    @Override
    public String getDescripcion() {
        return servicios.getDescripcion()
                + "\n- LAVADO DE MOTOR, LAVADO DE VESTIDURAS DE TELA O PIEL, TEFLÓN EN VESTIDURAS";
    }

    @Override
    public int getPrecio() {
        return this.servicios.getPrecio() + 356000;
    }
}