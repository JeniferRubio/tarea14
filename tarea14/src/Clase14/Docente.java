package Clase14;

public class Docente extends Persona
{
    private double sueldo;
        
    public Docente(String nombre,String apellido,Integer dni,Integer anioNac,Integer anioActual,double sueldo)
    {
       super(nombre,apellido,dni,anioNac,anioActual);
       this.sueldo=sueldo;
    } 

   public double getSueldo()
   {
      return sueldo;
   }
   public String toString()
   {
     return ("\nNom. de Docente: "+this.getNombre()+ 
     "\nApellidos: " +this.getApellido()+
     "\nDni:  "+this.getDni()+
     "\nAnio De Nac.: "+this.getFechaNacimiento()+
     "\nSueldo: "+this.getSueldo());
   }
   @Override
   public  Integer calcularEdad()
   {
      return this.anioActual - this.anioNac;
   }
   
}
