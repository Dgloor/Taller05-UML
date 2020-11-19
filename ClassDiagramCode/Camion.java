public class Camion {
    private int numeroRuedas;
    private double capacidadRemolques;
    private char gradoLicencia;
    private Remolque remo;

      
    public Camion(int numeroRuedas,double capacidadRemolques, char gradoLicencia, Remolque remo){
        this.numeroRuedas = numeroRuedas;
        this.capacidadRemolques = capacidadRemolques;
        this.gradoLicencia = gradoLicencia;
		this.remo = remo;
    }

  

    /**
     * @return int return the numeroRuedas
     */
    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    /**
     * @param numeroRuedas the numeroRuedas to set
     */
    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    /**
     * @return double return the capacidadRemolques
     */
    public double getCapacidadRemolques() {
        return capacidadRemolques;
    }

    /**
     * @param capacidadRemolques the capacidadRemolques to set
     */
    public void setCapacidadRemolques(double capacidadRemolques) {
        this.capacidadRemolques = capacidadRemolques;
    }

    /**
     * @return char return the gradoLicencia
     */
    public char getGradoLicencia() {
        return gradoLicencia;
    }

    /**
     * @param gradoLicencia the gradoLicencia to set
     */
    public void setGradoLicencia(char gradoLicencia) {
        this.gradoLicencia = gradoLicencia;
    }

    /**
     * @return Remolque return the remo
     */
    public Remolque getRemo() {
        return remo;
    }

    /**
     * @param remo the remo to set
     */
    public void setRemo(Remolque remo) {
        this.remo = remo;
    }

}
