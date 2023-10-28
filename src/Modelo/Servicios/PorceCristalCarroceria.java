package Modelo.Servicios;

import Modelo.Components.IServicios;
import Modelo.Components.ServicioDecorator;

public class PorceCristalCarroceria extends ServicioDecorator {
    
    private IServicios servicios;

    public PorceCristalCarroceria(IServicios s) {
        super(s);
        this.servicios = s;
    }

    @Override
    public String getDescripcion() {
        return servicios.getDescripcion() + "\n- PORCELÁNICA DE CARROCERÍA, CRISTALIZADO DE CARROCERÍA";
    }

    @Override
    public int getPrecio() {
        return 450000;
    }
}
