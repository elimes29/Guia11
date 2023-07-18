/*
Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
 */
package entidad;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Alquiler {
    private String nombre;
    private Integer cedula;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private Integer posAmarre;
    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, Integer cedula, LocalDate fechaAlquiler, LocalDate fechaDevolucion, Integer posAmarre, Barco barco) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posAmarre = posAmarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Integer getPosAmarre() {
        return posAmarre;
    }

    public void setPosAmarre(Integer posAmarre) {
        this.posAmarre = posAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", cedula=" + cedula + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", posAmarre=" + posAmarre + ", barco=" + barco + '}';
    }
    
    public void crearAlquiler(Alquiler aq){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        //Datos del aquiler fijos
        System.out.println("Ingrese el nombre");
        aq.setNombre(leer.nextLine());
        System.out.println("Inrese la cédula");
        aq.setCedula(leer.nextInt());
        System.out.println("Ingrese el dia del alquiler");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes del alquiler");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año del alquiler");
        int anho = leer.nextInt();
        LocalDate fechaIni = LocalDate.of(anho,mes,dia);
        aq.setFechaAlquiler(fechaIni);
        System.out.println("Ingrese el dia de entrega");
        dia = leer.nextInt();
        System.out.println("Ingrese el mes de entrega");
        mes = leer.nextInt();
        System.out.println("Ingrese el año de entrega");
        anho = leer.nextInt();
        LocalDate fechaHoy = LocalDate.of(anho,mes,dia);
        aq.setFechaDevolucion(fechaHoy);
        System.out.println("Ingrese la posicion de amarre");
        aq.setPosAmarre(leer.nextInt());
        System.out.println(fechaIni);
        System.out.println(fechaHoy);
        long diasEntre = ChronoUnit.DAYS.between(fechaIni, fechaHoy);
        System.out.println("Dias entre las fechas es " + diasEntre);
        System.out.println(aq);
        
        //Selecionamos que tipo de barco desea crear.
        System.out.println("¿Que tipo de barco desea alquilar?");
        System.out.println("1: Barco");
        System.out.println("2: Velero");
        System.out.println("3: Barco con motor");
        System.out.println("4: Yate de lujo");
        int tipo = leer.nextInt();
        
        float mod=0;
        switch (tipo){
            case 1:
                Barco b = new Barco();
                b.crearBarco(b);
                System.out.println(b);
                mod = b.modulobarco(b);
                break;
            case 2:
                Velero v = new Velero();
                v.crearVelero(v);
                System.out.println(v);
                mod = v.moduloVelero(v);
            case 3:
                BarcoMotor bm = new BarcoMotor();
                bm.crearBarcoMotor(bm);
                System.out.println(bm);
                mod = bm.moduloBarcoMotor(bm);
            case 4:
                YateLujo yl = new YateLujo();
                yl.crearYate(yl);
                System.out.println(yl);
                mod = yl.moduloYate(yl);
        }
        
        float precioAlquiler = (float)diasEntre*mod;
        System.out.println("El precio a pagar por el alquiler es de "+ precioAlquiler);
        
        
        
        
    }
}
