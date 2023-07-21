/*
• Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
identificación y su estado civil.
 */
package entidades;

import enumeraciones.EstadoCivil;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Persona {

    protected String nombre;
    protected String apellido;
    protected Integer id;
    protected EstadoCivil estadoCivil;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer id, EstadoCivil estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void cambioEstadiCIvil(Persona p) {
        System.out.println("¿Cuál es su nuevo estado civil?");
        System.out.println("1: Soltero_a");
        System.out.println("2: Casado_a");
        System.out.println("3: Divorciado_a");
        System.out.println("4: Viudo_a");
        int aux = leer.nextInt();

        switch (aux) {
            case 1:
                p.setEstadoCivil(EstadoCivil.SOLTERO_A);
                System.out.println("Cambiado a " + p.getEstadoCivil());
                break;
            case 2:
                p.setEstadoCivil(EstadoCivil.CASADO_A);
                System.out.println("Cambiado a " + p.getEstadoCivil());
                break;
            case 3:
                p.setEstadoCivil(EstadoCivil.DIVORCIADO_A);
                System.out.println("Cambiado a " + p.getEstadoCivil());
                break;
            case 4:
                p.setEstadoCivil(EstadoCivil.VIUDO_A);
                System.out.println("Cambiado a " + p.getEstadoCivil());
                break;
            default:
                System.out.println("Opcion erronea. No se realizó cambio del estado civil.");
                System.out.println("");
        }

    }

    public void mostrarPersona(Persona p) {
        System.out.println("Nombre " + p.nombre + " " + p.getApellido());
        System.out.println("Cedula de identidad: " + p.getId() + " y estado civil: " + p.getEstadoCivil());
    }

    public void crearPersona(Persona p) {
        System.out.println("Ingrese el nombre");
        p.setNombre(leer.nextLine());
        System.out.println("Ingrese el apellido");
        p.setApellido(leer.nextLine());
        System.out.println("Ingrese la cedula de identidad");
        p.setId(leer.nextInt());
        System.out.println("¿Cuál es su estado civil?");
        System.out.println("1: Soltero_a");
        System.out.println("2: Casado_a");
        System.out.println("3: Divorciado_a");
        System.out.println("4: Viudo_a");
        int aux = leer.nextInt();

        switch (aux) {
            case 1:
                p.setEstadoCivil(EstadoCivil.SOLTERO_A);
                break;
            case 2:
                p.setEstadoCivil(EstadoCivil.CASADO_A);
                break;
            case 3:
                p.setEstadoCivil(EstadoCivil.DIVORCIADO_A);
                break;
            case 4:
                p.setEstadoCivil(EstadoCivil.VIUDO_A);
                break;
            default:
                System.out.println("Opcion erronea. Se asigna Soltreo_a.");
                p.setEstadoCivil(EstadoCivil.SOLTERO_A);
                System.out.println("");
        }
    }
}
