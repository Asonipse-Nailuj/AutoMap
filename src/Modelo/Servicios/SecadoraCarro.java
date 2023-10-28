package Modelo.Servicios;

import Modelo.Components.IServicios;
import Modelo.Components.ServicioDecorator;

public class SecadoraCarro extends ServicioDecorator {
    
    private IServicios servicios;

    public SecadoraCarro(IServicios s) {
        super(s);
        this.servicios = s;
    }

    @Override
    public String getDescripcion() {
        return servicios.getDescripcion() + "\n- SECADORA DE CARROS INTEGRADA EN EL EQUIPO";
    }

    @Override
    public int getPrecio() {
        return this.servicios.getPrecio() + 8900;
    }
}