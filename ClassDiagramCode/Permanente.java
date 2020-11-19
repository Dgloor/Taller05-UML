public class Permanente extends Empleado {
	private double salario;
	private String numeroSeguroSocial;
	private String referencias;

	public Permanente(String nombre, Date fechaNacimiento, String direccion, double salario, String numeroSeguroSocial, String referencias) {
		super(nombre, fechaNacimiento, direccion);
		this.salario = salario;
		this.numeroSeguroSocial = numeroSeguroSocial;
		this.referencias = referencias;
	}

}
