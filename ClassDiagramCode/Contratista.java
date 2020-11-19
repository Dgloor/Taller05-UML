public class Contratista extends Empleado {
	private String nombreEmpresa;
	private int duracionContrato;
	private Date fechaDeInicio;
	
	public Contratista() {
	}
	
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	
	public int getDuracionContrato() {
		return duracionContrato;
	}
	
	public Date getFechaDeInicio() {
		return fechaDeInicio;
	}
	
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	
	public void setDuracionContrato(int duracionContrato) {
		this.duracionContrato = duracionContrato;
	}
	
	public void setFechaDeInicio(Date fechaDeInicio) {
		this.fechaDeInicio = fechaDeInicio;
	}

}
