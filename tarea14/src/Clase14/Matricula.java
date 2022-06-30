package Clase14;

public class Matricula 
{
    private String semestre;
    private Alumno[] alumno;
    private int contador;
   
    
    public Matricula(String semestre) 
    {
        this.semestre=semestre;
        this.contador=0;
        this.alumno = new Alumno[1];
        
    }

   public String getSemestre()
   {
     return semestre;
   }
   public void setAlumno(Alumno alumno)
   {
     this.alumno[this.contador++]=alumno;

   }
  public Alumno[] getAlumno()
  {
      return alumno;
  }

}
