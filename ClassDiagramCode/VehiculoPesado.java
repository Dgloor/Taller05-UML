import java.util.Date;

public class VehiculoPesado extends Vehiculo{
    private double pesoCargado;
    public Permanente conductor;

    public VehiculoPesado() {
    }

    public double getPesoCargado() {
        return pesoCargado;
    }

    public void setPesoCargado(double pesoCargado) {
        this.pesoCargado = pesoCargado;
    } 
}
