package Modelo.Servicios;

import Modelo.Components.IServicios;
import Modelo.Components.ServicioDecorator;

public class Domicilio extends ServicioDecorator {

    private IServicios servicios;

    public Domicilio(IServicios s) {
        super(s);
        this.servicios = s;
    }

    @Override
    public String getDescripcion() {
        return servicios.getDescripcion() + "\n- SERVICIO A DOMICILIO";
    }

    @Override
    public int getPrecio() {
        return 100000;
    }
}