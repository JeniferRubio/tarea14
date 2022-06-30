package Clase14;

public class Main 
{
    public static void main(String args[]) 
    {
       

        Docente docente=new Docente("Mariano", "Ramirez", 65769673, 1986,2022,345);
        Docente docente1=new Docente("Mirian", "Romero", 78769675, 1989,2022,456);
        Docente docente2=new Docente("Junior", "Rubio", 68769672, 1976,2022,562.6);
        Docente docente3=new Docente("José", "Ramos", 75769670, 1984,2022,200);

        Curso cursoMatematica = new Curso("Matematica");
        cursoMatematica.setDocente(docente);
        cursoMatematica.setDocente(docente2);

        
        Curso cursoLenguaje = new Curso("lenguaje");
        cursoLenguaje.setDocente(docente1);
        cursoLenguaje.setDocente(docente3);
        
        Alumno alumno=new Alumno("Rodrigo", "Lopez Moreno", 63858917, 2000,2022,2020347672,"UDH");
       alumno.setCurso(cursoLenguaje);
       alumno.setCurso(cursoMatematica);
       

        Matricula matricula = new Matricula("I-2022");
        matricula.setAlumno(alumno);

         
        for (Alumno a: matricula.getAlumno()) 
        {
            System.out.println();
            System.out.println("......ESTUDIANTE........");
            System.out.println(a.toString());
            System.out.println("Semestre: "+matricula.getSemestre());
            System.out.println("edad: "+a.calcularEdad());

            for (Curso c : a.getCurso()) {
                System.out.println();
                System.out.println("......CURSO........");
                System.out.println("Asignatura: " + c.getNombre());
                for (Docente d : c.getDocente()) {
                    System.out.println(d.toString());
                    System.out.println("edad: " +d.calcularEdad());
                }
            }
        }

    }
}