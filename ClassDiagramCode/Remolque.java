import java.util.Date;

public class Remolque {
    private String numeroRemolque;
    private double capacidadCarga;
    private Date fechaultimoServicio;


    public Remolque(String numeroRemolque, double capacidadCarga, Date fechaultimoServicio) {
        this.numeroRemolque = numeroRemolque;
        this.capacidadCarga = capacidadCarga;
        this.setFechaultimoServicio(fechaultimoServicio);
    }

    public String getNumeroRemolque() {
        return numeroRemolque;
    }

    public void setNumeroRemolque(String numeroRemolque) {
        this.numeroRemolque = numeroRemolque;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
    
    public Date getFechaultimoServicio() {
        return fechaultimoServicio;
    }

    public void setFechaultimoServicio(Date fechaultimoServicio) {
        this.fechaultimoServicio = fechaultimoServicio;
    }

    
}
