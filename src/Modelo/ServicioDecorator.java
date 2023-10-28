package Modelo;

public abstract class ServicioDecorator implements IServicios {
    private IServicios servicios;

    public ServicioDecorator(IServicios s) {
        this.servicios = s;
    }

    public IServicios getServicios() {
        return servicios;
    }
}
