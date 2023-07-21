/*
• Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...).
 */
package entidades;

import enumeraciones.Departamento;
import enumeraciones.EstadoCivil;

/**
 *
 * @author usuario
 */
public final class Profesor extends Empleado{
    private Departamento departamento;

    public Profesor() {
    }

    public Profesor(Departamento departamento) {
        this.departamento = departamento;
    }

    public Profesor(Departamento departamento, Integer anoIncorporacion, Integer numDespacho) {
        super(anoIncorporacion, numDespacho);
        this.departamento = departamento;
    }

    public Profesor(Departamento departamento, Integer anoIncorporacion, Integer numDespacho, String nombre, String apellido, Integer id, EstadoCivil estadoCivil) {
        super(anoIncorporacion, numDespacho, nombre, apellido, id, estadoCivil);
        this.departamento = departamento;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    public void cambioDepartamento(Profesor pro){
        System.out.println("¿A cuál departamento se debe cambiar?");
        System.out.println("1: Lenguajes");
        System.out.println("2: Matematicas");
        System.out.println("3: Arquitectura");
        int aux = leer.nextInt();
        
        switch (aux){
            case 1:
                pro.setDepartamento(Departamento.LENGUAJES);
                System.out.println("Cambiado a "+pro.getDepartamento());
                break;
            case 2:
                pro.setDepartamento(Departamento.MATEMATICAS);
                System.out.println("Cambiado a "+pro.getDepartamento());
                break;
            case 3:
                pro.setDepartamento(Departamento.ARQUITECTURA);
                System.out.println("Cambiado a "+pro.getDepartamento());
                break;
            default:
                System.out.println("Opcion erronea. No se realizó cambio de deprtamento.");
                System.out.println("");
        }
        
    }
    
        public void mostraProfesor(Profesor pr){
        super.mostraEmpleado(pr);
        System.out.println("Trabajando en el departamento: "+pr.getDepartamento());
        System.out.println("");
    }
        
        public void crearProfesor(Profesor pr){
            super.crearEmpleado(pr);
            pr.cambioDepartamento(pr);
        }
}
