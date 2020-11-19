public class Permanente extends Empleado {
	private double salario;
	private String numeroSeguroSocial;
	private String referencias;
	public VehiculoPesado vehiculo;

	public Permanente(String nombre, Date fechaNacimiento, String direccion, double salario, String numeroSeguroSocial, String referencias) {

	}
	
	public double getSalario() {
		return salario;
	}
	
	 public String getNumeroSeguroSocial() {
		return numeroSeguroSocial;
	}
	 
	 public String getReferencias() {
		return referencias;
	}
	 
	 public void setSalario(double salario) {
		this.salario = salario;
	}
	 
	 public void setNumeroSeguroSocial(String numeroSeguroSocial) {
		this.numeroSeguroSocial = numeroSeguroSocial;
	}
	 
	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}

}
