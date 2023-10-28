package Modelo.Servicios;

import Modelo.Components.IServicios;
import Modelo.Components.ServicioDecorator;

public class LimpiezaCarroceria extends ServicioDecorator {
    
    private IServicios servicios;

    public LimpiezaCarroceria(IServicios s) {
        super(s);
        this.servicios = s;
    }

    @Override
    public String getDescripcion() {
        return servicios.getDescripcion()
                + "\n- APLICACIÓN DE JABÓN, CERA ESPUMA, ENCERADO, PULIDO Y DESCONTAMINACIÓN DE CARROCERÍA";
    }

    @Override
    public int getPrecio() {
        return this.servicios.getPrecio() + 230000;
    }

}