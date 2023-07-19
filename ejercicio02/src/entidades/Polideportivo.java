/*
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
 */
package entidades;

import enumeraciones.TipoPolideportivo;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public final class Polideportivo extends Edificio {
    private String nombre;
    private TipoPolideportivo tipo; //techado o abierto

    public Polideportivo(String nombre, TipoPolideportivo tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Polideportivo(String nombre, TipoPolideportivo tipo, Float ancho, Float alto, Float largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoPolideportivo getTipo() {
        return tipo;
    }

    public void setTipo(TipoPolideportivo tipo) {
        this.tipo = tipo;
    }

    public Float getAncho() {
        return ancho;
    }

    public void setAncho(Float ancho) {
        this.ancho = ancho;
    }

    public Float getAlto() {
        return alto;
    }

    public void setAlto(Float alto) {
        this.alto = alto;
    }

    public Float getLargo() {
        return largo;
    }

    public void setLargo(Float largo) {
        this.largo = largo;
    }

    public Polideportivo() {
    }

    @Override
    public String toString() {
        return "Polideportivo{" + "nombre=" + nombre + ", tipo=" + tipo + '}';
    }

    @Override
    public Double calcularSuperficie(Edificio poli, Integer num) {
        return (double) poli.getLargo()*poli.getAncho();
    }

    @Override
    public Double calcularVolumen(Edificio poli) {
        return (double) poli.getAncho()*poli.getLargo()*poli.getAlto();
    }
    
    public void crearPoli(Polideportivo p){
        super.crearEdificio(p);
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
         System.out.println("Ingrese nombre del polideportivo");
        p.setNombre(leer.nextLine()) ;
        System.out.println("¿Qué tipo de polideportivo es?");
        System.out.println("1:Techado");
        System.out.println("2:abierto");
        
        int tipoAux = leer.nextInt();
       
        switch (tipoAux){
            case 1:
                p.setTipo(TipoPolideportivo.Techado);
                break;
            case 2:
                p.setTipo(TipoPolideportivo.Abierto);
                break;
        }
    }
}
