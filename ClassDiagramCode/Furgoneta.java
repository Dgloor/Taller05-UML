import java.util.Date;

public class Furgoneta extends VehiculoPesado{
	private double pesoSinCarga;
	private double capacidadCarga;

    public Furgoneta(String numeroRegistro, double capacidadMotor, Date nextFechaPrueba, double pesoCargado, double pesoSinCarga, double capacidadCarga) {
        super(numeroRegistro, capacidadMotor, nextFechaPrueba, pesoCargado);
    }

    

}

