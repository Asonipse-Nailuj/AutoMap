package Modelo.Servicios;

import Modelo.Components.IServicios;
import Modelo.Components.ServicioDecorator;

public class LavadoMano extends ServicioDecorator {
    
    private IServicios servicios;

    public LavadoMano(IServicios s) {
        super(s);
        this.servicios = s;
    }

    @Override
    public String getDescripcion() {
        return servicios.getDescripcion() + "\n- LAVADO A MANO";
    }

    @Override
    public int getPrecio() {
        return this.servicios.getPrecio() + 50000;
    }
}