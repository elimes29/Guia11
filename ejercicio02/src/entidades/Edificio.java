/*
Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:

• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
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
public abstract class  Edificio {
    protected Float ancho;
    protected Float alto;
    protected Float largo;
    protected Integer num;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Edificio() {
    }

    public Edificio(Float ancho, Float alto, Float largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
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

    @Override
    public String toString() {
        return "Edificio{" + "ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + '}';
    }

    public abstract Double calcularSuperficie(Edificio ed, Integer numPisos);
    
    public abstract Double calcularVolumen(Edificio ed);
    
    public void crearEdificio(Edificio ed){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        //Inresando datos por pantalla
        System.out.println("Ingrese ancho");
        float a = leer.nextFloat();
        System.out.println("Ingrese largo");
        float b = leer.nextFloat();
        System.out.println("Ingrese alto");
        float c = leer.nextFloat();
        ed.setAncho(a);
        ed.setLargo(b);
        ed.setAlto(c);
        
    }
       
    
    
}
