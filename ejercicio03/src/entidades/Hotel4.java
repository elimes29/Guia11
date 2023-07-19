/*
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos,
Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante,
Precio de las Habitaciones.

Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de
acuerdo a las prestaciones observadas. 
 */
package entidades;

import enumeraciones.Gimnacio;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Hotel4 extends Hotel {

    protected Gimnacio tipoGin;
    protected String nombreRes;
    protected Integer capaciadRes;

    public Hotel4() {
    }

    public Hotel4(Gimnacio tipoGin, String nombreRes, Integer capaciadRes) {
        this.tipoGin = tipoGin;
        this.nombreRes = nombreRes;
        this.capaciadRes = capaciadRes;
    }

    public Hotel4(Gimnacio tipoGin, String nombreRes, Integer capaciadRes, Integer cantHabitaciones, Integer numCamas, Integer cantPisos, Float precioHab, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, numCamas, cantPisos, precioHab, nombre, direccion, localidad, gerente);
        this.tipoGin = tipoGin;
        this.nombreRes = nombreRes;
        this.capaciadRes = capaciadRes;
    }

    public Hotel4(Gimnacio tipoGin, String nombreRes, Integer capaciadRes, Integer cantHabitaciones, Integer numCamas, Integer cantPisos, Float precioHab) {
        super(cantHabitaciones, numCamas, cantPisos, precioHab);
        this.tipoGin = tipoGin;
        this.nombreRes = nombreRes;
        this.capaciadRes = capaciadRes;
    }

    public Gimnacio getTipoGin() {
        return tipoGin;
    }

    public void setTipoGin(Gimnacio tipoGin) {
        this.tipoGin = tipoGin;
    }

    public String getNombreRes() {
        return nombreRes;
    }

    public void setNombreRes(String nombreRes) {
        this.nombreRes = nombreRes;
    }

    public Integer getCapaciadRes() {
        return capaciadRes;
    }

    public void setCapaciadRes(Integer capaciadRes) {
        this.capaciadRes = capaciadRes;
    }


    public void crearHotel4(Hotel4 h4) {
        Scanner leer1 = new Scanner(System.in);
        
        super.crearHotel(h4);

        System.out.println("Indique que tipo de Gimnacio");
        System.out.println("1: Tipo A");
        System.out.println("2: Tipo B");
        int aux = leer.nextInt();
        switch (aux) {
            case 1:
                h4.setTipoGin(Gimnacio.A);
                break;
            case 2:
                h4.setTipoGin(Gimnacio.B);
                break;
            default:
                System.out.println("Ingresó un valor errado, se asignará Tipo B");
                h4.setTipoGin(Gimnacio.B);
                break;
        }
        System.out.println("Ingrese el nombre del restaurante del hotel");
        h4.setNombreRes(leer1.nextLine());
        System.out.println("Ingrese la capacidad de comensales del restaureante del hotel");
        h4.setCapaciadRes(leer.nextInt());
        h4.setPrecioHab(calcularPrecio(h4));

    }
    
    public void mostrarHotel4(Hotel4 h4){
        System.out.println("***********Hotel 4 estrellas****************");
        System.out.println("************"+h4.getNombre()+" precio "+h4.getPrecioHab()+"************");
    }

    /*
    El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).
Donde:
    Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.
Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.
Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.
     */
    public Float calcularPrecio(Hotel4 h4) {
        float aux = super.calcularPrecio(h4);

        if (h4.capaciadRes < 30) {
            aux = aux + 10;
        } else if (h4.capaciadRes < 50) {
            aux = aux + 30;
        } else {
            aux = aux + 50;
        }

        if (h4.getTipoGin().toString().equals("A")) {
            aux = aux + 50;
        } else {
            aux = aux + 30;
        }
        
        return aux;
    }

}
