/*
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public final class EdificioDeOficinas extends Edificio {
    private Integer numOficinas;
    private Integer cantPersonasOficina;
    private Integer numPisos;
    private String nombre;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(Integer numOficinas, Integer cantPersonasOficina, Integer numPisos) {
        this.numOficinas = numOficinas;
        this.cantPersonasOficina = cantPersonasOficina;
        this.numPisos = numPisos;
    }

    public EdificioDeOficinas(Integer numOficinas, Integer cantPersonasOficina, Integer numPisos, Float ancho, Float alto, Float largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.cantPersonasOficina = cantPersonasOficina;
        this.numPisos = numPisos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(Integer numOficinas) {
        this.numOficinas = numOficinas;
    }

    public Integer getCantPersonasOficina() {
        return cantPersonasOficina;
    }

    public void setCantPersonasOficina(Integer cantPersonasOficina) {
        this.cantPersonasOficina = cantPersonasOficina;
    }

    public Integer getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(Integer numPisos) {
        this.numPisos = numPisos;
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
    
    /**
     * Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio. 
     */
    public void cantPersonas(){
        System.out.println("La cantidad de personas por piso son: "+ cantPersonasOficina);
        System.out.println("La cantidad de personas en todo el edificio es: "+ cantPersonasOficina*numPisos );
        
    }

    @Override
    public String toString() {
        return "EdificioDeOficinas{" + "numOficinas=" + numOficinas + ", cantPersonasOficina=" + cantPersonasOficina + ", numPisos=" + numPisos + '}';
    }

    @Override
    public Double calcularSuperficie(Edificio ediOfi, Integer num) {
       return (double)num*(double) ediOfi.getAncho()*ediOfi.getLargo();
    }

    @Override
    public Double calcularVolumen(Edificio ediOfi) {
       return (double) ediOfi.getAncho()*ediOfi.getLargo()*ediOfi.getAlto();
    }
    
    public void crearEdifOficina(EdificioDeOficinas ediOfi){
        super.crearEdificio(ediOfi);
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el número de oficinas");
        ediOfi.setNumOficinas(leer.nextInt());
        System.out.println("Ingrese la cantidad de personas que cabe en una oficina");
        ediOfi.setCantPersonasOficina(leer.nextInt());
        System.out.println("Ingrese el numero de pisos");
        ediOfi.setNumPisos(leer.nextInt());
    }
    
    public Integer cantidadDePersonas(EdificioDeOficinas ediOfi){
       return ediOfi.getNumPisos()*ediOfi.getCantPersonasOficina();
    }
}
