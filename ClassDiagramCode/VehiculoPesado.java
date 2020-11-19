import java.util.Date;

public class VehiculoPesado extends Vehiculo{
    private double pesoCargado;

   public VehiculoPesado(String numeroRegistro, double capacidadMotor, Date nextFechaPrueba,double pesoCargado) {
        super(numeroRegistro, capacidadMotor, nextFechaPrueba);
        this.pesoCargado=pesoCargado;
    }

    public double getPesoCargado() {
        return pesoCargado;
    }

    public void setPesoCargado(double pesoCargado) {
        this.pesoCargado = pesoCargado;
    } 
}

    

