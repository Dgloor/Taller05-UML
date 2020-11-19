import java.util.ArrayList;
import java.util.Date;

public class Remolque {
    private String numeroRemolque;
    private double capacidadCarga;
    private Date fechaultimoServicio;
    public ArrayList<Camion> lista;

    public Remolque() {
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
