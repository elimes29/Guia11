/*
Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Hotel extends Alojamiento {
    protected Integer cantHabitaciones;
    protected Integer numCamas;
    protected Integer cantPisos;
    protected Float precioHab;

    public Hotel() {
    }

    public Hotel(Integer cantHabitaciones, Integer numCamas, Integer cantPisos, Float precioHab, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
        this.precioHab = precioHab;
    }

    public Hotel(Integer cantHabitaciones, Integer numCamas, Integer cantPisos, Float precioHab) {
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
        this.precioHab = precioHab;
    }

    public Integer getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(Integer cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public Integer getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(Integer numCamas) {
        this.numCamas = numCamas;
    }

    public Integer getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(Integer cantPisos) {
        this.cantPisos = cantPisos;
    }

    public Float getPrecioHab() {
        return precioHab;
    }

    public void setPrecioHab(Float precioHab) {
        this.precioHab = precioHab;
    }

    
    public void crearHotel(Hotel h){
        
        super.crearAlojamiento(h);
        System.out.println("Ingrese la cantidad de habitaciones del Hotel");
        h.setCantHabitaciones(leer.nextInt());
        System.out.println("Ingrese la cantidad de camas del Hotel");
        h.setNumCamas(leer.nextInt());
        System.out.println("Ingrese la cantidad de pisos del Hotel");
        h.setCantPisos(leer.nextInt());
        h.setPrecioHab(calcularPrecio(h));

    }
    
    public Float calcularPrecio(Hotel h){
        return (float)50+h.getCantHabitaciones();
    }
    
}
