package Clase14;

public class Alumno extends Persona 
{
   private int codigo;
   private String universidad;
   private Curso curso[];
   private int contador;
        
   public Alumno(String nombre,String apellido,Integer dni,Integer anioNac,Integer anioActual,int codigo, String universidad)
   {
     super(nombre,apellido,dni,anioNac,anioActual);
     this.codigo=codigo;
     this.universidad=universidad;
     this.curso=new Curso[2];
    this.contador=0;
   } 
  public int getCodigo()
  {
    return codigo;
  }
  public String getUniversidad()
  {
    return universidad;
  }

  public void setCurso(Curso curso)
  {
    this.curso[this.contador]=curso;
    this.contador++;
  }
 public Curso[] getCurso()
 {
   return curso;
 }
  public String toString()
  {
    return ("\nNom. Alumno: "+this.getNombre()+ 
    "\nApellidos: " +this.getApellido()+
    "\nDni:  "+this.getDni()+
    "\nAnio De Nac.: "+this.getFechaNacimiento()+
    "\nCodigo: "+this.getCodigo()+
    "\nUniversidad: "+getUniversidad());
  }

  @Override
  public  Integer calcularEdad()
  {
    return this.anioActual - this.anioNac;
  }

}