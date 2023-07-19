/*
• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, 
Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas,
Precio de las Habitaciones.
 */
package entidades;

import enumeraciones.Gimnacio;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public final class Hotel5 extends Hotel4 {

    private Integer cantSalonesConf;
    private Integer cantSuites;
    private Integer cantLimosinas;

    public Hotel5() {
    }

    public Hotel5(Integer cantSalonesConf, Integer cantSuites, Integer cantLimosinas) {
        this.cantSalonesConf = cantSalonesConf;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public Hotel5(Integer cantSalonesConf, Integer cantSuites, Integer cantLimosinas, Gimnacio tipoGin, String nombreRes, Integer capaciadRes) {
        super(tipoGin, nombreRes, capaciadRes);
        this.cantSalonesConf = cantSalonesConf;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public Hotel5(Integer cantSalonesConf, Integer cantSuites, Integer cantLimosinas, Gimnacio tipoGin, String nombreRes, Integer capaciadRes, Integer cantHabitaciones, Integer numCamas, Integer cantPisos, Float precioHab, String nombre, String direccion, String localidad, String gerente) {
        super(tipoGin, nombreRes, capaciadRes, cantHabitaciones, numCamas, cantPisos, precioHab, nombre, direccion, localidad, gerente);
        this.cantSalonesConf = cantSalonesConf;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public Hotel5(Integer cantSalonesConf, Integer cantSuites, Integer cantLimosinas, Gimnacio tipoGin, String nombreRes, Integer capaciadRes, Integer cantHabitaciones, Integer numCamas, Integer cantPisos, Float precioHab) {
        super(tipoGin, nombreRes, capaciadRes, cantHabitaciones, numCamas, cantPisos, precioHab);
        this.cantSalonesConf = cantSalonesConf;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }
    
    

    public Integer getCantSalonesConf() {
        return cantSalonesConf;
    }

    public void setCantSalonesConf(Integer cantSalonesConf) {
        this.cantSalonesConf = cantSalonesConf;
    }

    public Integer getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(Integer cantSuites) {
        this.cantSuites = cantSuites;
    }

    public Integer getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(Integer cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }

    public void crearHotel5(Hotel5 h5) {

        super.crearHotel4(h5);

        System.out.println("Ingrese la cantidad de Salones de Conferencia que tiene el hotel");
        h5.setCantSalonesConf(leer.nextInt());
        System.out.println("Ingrese la cantidad de suites que tiene en el hotel");
        h5.setCantSuites(leer.nextInt());
        System.out.println("Ingrese la cantidad de limosinas que tiene en el hotel");
        h5.setCantLimosinas(leer.nextInt());
        h5.setPrecioHab(calcularPrecio(h5));

    }
    
    public void mostrarHotel5(Hotel5 h5){
        System.out.println("***********Hotel 5 estrellas****************");
        System.out.println("************"+h5.getNombre()+" precio "+h5.getPrecioHab()+"************");
    }

    public Float calcularPrecio(Hotel5 h5) {
        float aux = super.calcularPrecio(h5);
        aux = aux + (float) (h5.getCantLimosinas() * 15);
        return aux;
    }

}
