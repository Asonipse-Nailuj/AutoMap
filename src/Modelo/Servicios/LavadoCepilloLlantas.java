package Modelo.Servicios;

import Modelo.Components.IServicios;
import Modelo.Components.ServicioDecorator;

public class LavadoCepilloLlantas extends ServicioDecorator {

    private IServicios servicios;

    public LavadoCepilloLlantas(IServicios s) {
        super(s);
        this.servicios = s;
    }

    @Override
    public String getDescripcion() {
        return servicios.getDescripcion()
                + "\n- LAVADO LLANTAS, CEPILLO LAVA-RUEDAS MULTI-DISK Y CEPILLO LAVA-RUEDAS CON OCHO CEPILLOS";
    }

    @Override
    public int getPrecio() {
        return 123000;
    }
}