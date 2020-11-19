public class Camion extends VehiculoPesado {
    private int numeroRuedas;
    private double capacidadRemolques;
    private char gradoLicencia;
    public ArrayList<Remolque> remolques;

    public Camion(){
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public double getCapacidadRemolques() {
        return capacidadRemolques;
    }

    public void setCapacidadRemolques(double capacidadRemolques) {
        this.capacidadRemolques = capacidadRemolques;
    }

    public char getGradoLicencia() {
        return gradoLicencia;
    }

    public void setGradoLicencia(char gradoLicencia) {
        this.gradoLicencia = gradoLicencia;
    }

}
