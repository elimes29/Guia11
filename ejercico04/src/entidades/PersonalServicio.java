/*
• Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).
 */
package entidades;

import enumeraciones.EstadoCivil;
import enumeraciones.Seccion;

/**
 *
 * @author usuario
 */
public final class PersonalServicio extends Empleado {

    private Seccion seccion;

    public PersonalServicio() {
    }

    public PersonalServicio(Seccion seccio) {
        this.seccion = seccio;
    }

    public PersonalServicio(Seccion seccio, Integer anoIncorporacion, Integer numDespacho) {
        super(anoIncorporacion, numDespacho);
        this.seccion = seccio;
    }

    public PersonalServicio(Seccion seccio, Integer anoIncorporacion, Integer numDespacho, String nombre, String apellido, Integer id, EstadoCivil estadoCivil) {
        super(anoIncorporacion, numDespacho, nombre, apellido, id, estadoCivil);
        this.seccion = seccion;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccio(Seccion seccio) {
        this.seccion = seccio;
    }

    public void cambioSeccion(PersonalServicio ps) {
        System.out.println("¿A cuál seccion se debe cambiar?");
        System.out.println("1: Biblioteca");
        System.out.println("2: Decanato");
        System.out.println("3: Secretaría");
        int aux = leer.nextInt();

        switch (aux) {
            case 1:
                ps.setSeccio(Seccion.BIBLIOTECA);
                System.out.println("Cambiado a " + ps.getSeccion());
                break;
            case 2:
                ps.setSeccio(Seccion.DECANATO);
                System.out.println("Cambiado a " + ps.getSeccion());
                break;
            case 3:
                ps.setSeccio(Seccion.SECRETARIA);
                System.out.println("Cambiado a " + ps.getSeccion());
                break;
            default:
                System.out.println("Opcion erronea. No se realizó cambio de seccion.");
                System.out.println("");
        }
    }

    public void mostraPerServicio(PersonalServicio ps) {
        super.mostraEmpleado(ps);
        System.out.println("Trabajando en la seccion de: " + ps.getSeccion());
        System.out.println("");
    }

    public void crearPersonalServicio(PersonalServicio ps) {
        super.crearEmpleado(ps);
        ps.cambioSeccion(ps);

    }
}
