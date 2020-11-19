public class Contratista extends Empleado {
	private String nombreEmpresa;
	private int duracionContrato;
	private Date fechaDeInicio;
	
	public Contratista(String nombre, Date fechaDeNacimiento, String direccion, String nombreEmpresa, int duracionContrato, Date fechaDeInicio) {
		super(nombre, fechaDeNacimiento, direccion);
		this.nombreEmpresa = nombreEmpresa;
		this.duracionContrato = duracionContrato;
		this.fechaDeInicio = fechaDeInicio;
	}

}
