
public class Fabricante {
    String nombre;
    ArrayList<Vehiculo> vehiculosFabricados;

    public Fabricante(){
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public ArrayList<Vehiculo> getVehiculosFabricados(){
        return this.vehiculosFabricados;
    }
}