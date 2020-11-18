

public class Vehiculo {
    private String numeroRegistro;
    private double capacidadMotor;
    private Date nextFechaPrueba;

    public Vehiculo(String numeroRegistro, double capacidadMotor, Date nextFechaPrueba){
        this.numeroRegistro = numeroRegistro;
        this.capacidadMotor = capacidadMotor;
        this.nextFechaPrueba  = nextFechaPrueba;
    }
}