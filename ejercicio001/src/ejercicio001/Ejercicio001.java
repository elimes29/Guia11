/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
 */
package ejercicio001;

import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;

/**
 *
 * @author usuario
 */
public class Ejercicio001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Animal perro1 = new Perro ("lALO","Carne",15,"pincher");
        perro1.alimentarse();
        
        Perro perro2 = new Perro("Carl","Perrarina",4,"boxer");
        perro2.alimentarse();
        
        Animal gato1 = new Gato("Misu","atún",2,"catumpi");
        gato1.alimentarse();
        
        Animal caballo1 = new Caballo("My oun business","Paja",20,"Carora");
        caballo1.alimentarse();
        

    }
    
}
