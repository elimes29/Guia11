/*
En cuanto a los estudiantes, se requiere almacenar el curso en el que están
matriculados.
 */
package entidades;

import enumeraciones.EstadoCivil;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public final class Estudiante extends Persona {
    private String cursoMatriculado;
    Scanner leer1 = new Scanner(System.in);

    public Estudiante(String cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }

    public Estudiante(String cursoMatriculado, String nombre, String apellido, Integer id, EstadoCivil estadoCivil) {
        super(nombre, apellido, id, estadoCivil);
        this.cursoMatriculado = cursoMatriculado;
    }

    public Estudiante() {
    }

    public String getCursoMatriculado() {
        return cursoMatriculado;
    }

    public void setCursoMatriculado(String cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }
    
    public void matriculacionCurso(Estudiante es){
        System.out.println("¿A cuál curso se desea matricular?");
        es.setCursoMatriculado(leer1.nextLine());
        System.out.println("Estudiante matriculado en curso satisfactoriamente");
        System.out.println("");
    }
 
        public void mostraEstudiante(Estudiante es){
        super.mostrarPersona(es);
        System.out.println("Actualente matriculado en el curso: "+es.getCursoMatriculado());
        System.out.println("");
    }
        
        public void crearEstudiante(Estudiante es){
            super.crearPersona(es);
            es.matriculacionCurso(es);
        }
}
