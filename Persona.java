
public class Persona {
    //Atributos privados
	private int edad;
    private String nombre;
    private String telefono;
    
    //Constructor
    public Persona() {
    	System.out.println("Se ha creado un objeto persona");
	}
    
    //Metodos getter and setter para cada atributo privado
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}