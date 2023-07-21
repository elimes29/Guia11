/*
Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.
 */
package entidades;

import enumeraciones.EstadoCivil;

/**
 *
 * @author usuario
 */
public class Empleado extends Persona {
    protected Integer anoIncorporacion;
    protected Integer numDespacho;

    public Empleado() {
    }

    public Empleado(Integer anoIncorporacion, Integer numDespacho) {
        this.anoIncorporacion = anoIncorporacion;
        this.numDespacho = numDespacho;
    }

    public Empleado(Integer anoIncorporacion, Integer numDespacho, String nombre, String apellido, Integer id, EstadoCivil estadoCivil) {
        super(nombre, apellido, id, estadoCivil);
        this.anoIncorporacion = anoIncorporacion;
        this.numDespacho = numDespacho;
    }

    public Integer getAnoIncorporacion() {
        return anoIncorporacion;
    }

    public void setAnoIncorporacion(Integer anoIncorporacion) {
        this.anoIncorporacion = anoIncorporacion;
    }

    public Integer getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(Integer numDespacho) {
        this.numDespacho = numDespacho;
    }
    
    public void reasignacionNumDespacho(Empleado em){
        System.out.println("¿Cuál es el nuevo numero de despaco?");
        em.setNumDespacho(leer.nextInt());
        System.out.println("Empleado reasignado satisfactoriamente");
        System.out.println("");
    }   
    
    public void mostraEmpleado(Empleado e){
        super.mostrarPersona(e);
        System.out.println("Trabajando desde: "+e.getAnoIncorporacion()+" y su numero de despacho es: "+e.getNumDespacho());
        System.out.println("");
    }
    
    public void crearEmpleado(Empleado ep){
        super.crearPersona(ep);
        System.out.println("¿En qué año se incorporó a la facultad?");
        ep.setAnoIncorporacion(leer.nextInt());
        System.out.println("¿Cuál es el número de despacho?");
        ep.setNumDespacho(leer.nextInt());
        
    }
}
