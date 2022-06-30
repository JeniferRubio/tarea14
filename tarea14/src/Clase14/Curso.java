package Clase14;

public class Curso 
{
    private String asignatura;
    private Docente docente[];
    private int contador;

    public Curso(String asignatura)
    {
      this.asignatura=asignatura;
      this.docente=new Docente[2];
      this.contador=0;

    }
  
    public String getNombre()
    {
       return asignatura;
    }
    public void setDocente(Docente docente)
    {
      this.docente[this.contador]=docente;
      this.contador++;
    }
   public Docente[]getDocente()
   {
     return docente;
   }
}
