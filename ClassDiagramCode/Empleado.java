
public class Empleado {
    private String nombre;
    private Date fechaNacimiento;
    private String direccion;

    public Empleado(){
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setFechaNacimiento(Date fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public String getNombre(){
        return this.nombre;
    }
    
    public Date getFechaNacimiento(){
        return this.fechaNacimiento;
    }

    public String getDireccion(){
        return this.direccion;
    }
}