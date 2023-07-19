/*
Los alojamientos se identifican por un nombre, una dirección,
una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de
alojamientos: Hoteles y Alojamientos Extrahoteleros.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Alojamiento {
    protected String nombre;
    protected String direccion;
    protected String localidad;
    protected String gerente;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Alojamiento(String nombre, String direccion, String localidad, String gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
    }

    public Alojamiento() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }
    
    /*
    Los alojamientos se identifican por un nombre, una dirección,
una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de
alojamientos: Hoteles y Alojamientos Extrahoteleros.
    */
    public void crearAlojamiento(Alojamiento al){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese nombre del Alojamiento");
        al.setNombre(leer.nextLine());
        System.out.println("Ingrese la dirección del Alojamiento");
        al.setDireccion(leer.nextLine());
        System.out.println("Ingrese la localidad del Alojamiento");
        al.setLocalidad(leer.nextLine());
        System.out.println("Ingrese el gerente del Alojamiento");
        al.setGerente(leer.nextLine());
    }
    
    
}
