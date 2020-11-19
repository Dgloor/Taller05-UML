public class Permanente extends Empleado {
	private double salario;
	private String numeroSeguroSocial;
	private String referencias;
	private VehiculoPesado vehiculo;

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
	 
	 public VehiculoPesado getVehiculo() {
		return vehiculo;
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
	 
	public void setVehiculo(VehiculoPesado vehiculo) {
		this.vehiculo = vehiculo;
	}

}
