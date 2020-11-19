
public class Fabricante {
    private String nombre;
    public ArrayList<Vehiculo> vehiculosFabricados;

    public Fabricante(){
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
}