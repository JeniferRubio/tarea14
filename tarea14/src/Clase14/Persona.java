package Clase14;
public abstract class Persona 
{
    protected String nombre;
    protected String apellido;
    protected Integer dni;
    protected Integer anioNac;
    protected Integer anioActual;
    
    
    public Persona(String nombre,String apellido,Integer dni,Integer anioNac ,Integer anioActual)
    {
        this.nombre=nombre;
        this.apellido= apellido;
        this.dni=dni;
        this.anioNac=anioNac;
        this.anioActual=anioActual;
        
        
    }
    protected String getNombre()
    {
       return nombre;  
    }
    protected String getApellido()
    {
        return apellido;
    }
    protected Integer getDni()
    {
       return dni;  
    }
    protected Integer getFechaNacimiento()
    {
        return anioNac;
    
    }
    protected Integer getAnActual()
    {
       return anioActual;  
    }
    public abstract Integer calcularEdad();

      
    
    
}