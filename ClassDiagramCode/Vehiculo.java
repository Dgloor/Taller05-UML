
public class Vehiculo {
    private String numeroRegistro;
    private double capacidadMotor;
    private Date nextFechaPrueba;

    public Vehiculo(String numeroRegistro, double capacidadMotor, Date nextFechaPrueba){
        this.numeroRegistro = numeroRegistro;
        this.capacidadMotor = capacidadMotor;
        this.nextFechaPrueba  = nextFechaPrueba;
    }

    public void setNumeroRegistro(String numeroRegistro){
        this.numeroRegistro = numeroRegistro;
    }
    
    public void setCapacidadMotor(double capacidadMotor){
        this.capacidadMotor = capacidadMotor;
    }

    public void setNextFechaPrueba(Date nextFechaPrueba){
        this.nextFechaPrueba = nextFechaPrueba;
    }

    public String getNumeroRegistro(){
        return this.numeroRegistro;
    }

    public double getCapacidadMotor(){
        return this.capacidadMotor;
    }

    public Date getNextFechaPrueba(){
        return this.nextFechaPrueba;
    }
}