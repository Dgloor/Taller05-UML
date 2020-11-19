
public class Vehiculo {
    private String numeroRegistro;
    private double capacidadMotor;
    private Date nextFechaPrueba;
    public Fabricante fabricante;

    public Vehiculo(){
    }

    public void setNumeroRegistro(String numeroRegistro){
        this.numeroRegistro = numeroRegistro;
    }

    public String getNumeroRegistro(){
        return this.numeroRegistro;
    }
    
    public void setCapacidadMotor(double capacidadMotor){
        this.capacidadMotor = capacidadMotor;
    }

    public double getCapacidadMotor(){
        return this.capacidadMotor;
    }

    public void setNextFechaPrueba(Date nextFechaPrueba){
        this.nextFechaPrueba = nextFechaPrueba;
    }

    public Date getNextFechaPrueba(){
        return this.nextFechaPrueba;
    }
}