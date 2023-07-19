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

De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.

Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.

Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */
package ejercicio02;

import entidades.Edificio;
import entidades.EdificioDeOficinas;
import entidades.Polideportivo;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class EdificioApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Edificio> listaEdificios = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            Polideportivo pd = new Polideportivo();
            System.out.println("*****Creando Polideportivo # " + (i + 1) + "*****");
            pd.crearPoli(pd);
            System.out.println(pd);
            listaEdificios.add(pd);
            pd.setNum(listaEdificios.size());
        }

        for (int i = 0; i < 2; i++) {
            EdificioDeOficinas ediOf = new EdificioDeOficinas();
            System.out.println("*****Creando Edificio de oficina # " + (i + 1) + "*****");
            ediOf.crearEdifOficina(ediOf);
            System.out.println(ediOf);
            listaEdificios.add(ediOf);
            ediOf.setNum(listaEdificios.size());
        }

        System.out.println(listaEdificios.size() + " edificios en la lista");
        System.out.println("");

        for (Edificio auxEdi : listaEdificios) {
            //System.out.println("Edificio num " + auxEdi.getNum());

            if (auxEdi instanceof Polideportivo) {
                System.out.println("La superficie del polideportivo " + ((Polideportivo) auxEdi).getNombre() + " " + auxEdi.calcularSuperficie(auxEdi, 0));
                System.out.println("El volumen del polideportivo " + ((Polideportivo) auxEdi).getNombre() + " " + auxEdi.calcularVolumen(auxEdi));

            }

            if (auxEdi instanceof EdificioDeOficinas) {
                System.out.println("La superficie del Edificio de oficinas " + auxEdi.calcularSuperficie(auxEdi, ((EdificioDeOficinas) auxEdi).getNumPisos()));
                System.out.println("El volumen del edificio de ofincias " + auxEdi.calcularVolumen(auxEdi));

            }

        }

        /*
        Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
         */
        int contTechado = 0, contAbierto = 0;
        for (Edificio auxEdi : listaEdificios) {

            if (auxEdi instanceof Polideportivo) {
                if (((Polideportivo) auxEdi).getTipo().toString().equals("Techado")) {
                    contTechado++;
                }
                if (((Polideportivo) auxEdi).getTipo().toString().toUpperCase().equals("ABIERTO")) {
                    contAbierto++;
                }

            }
        }

        System.out.println("");
        System.out.println("Hay " + contTechado + " polideportivos Techados");
        System.out.println("Hay " + contAbierto + " polideportivos Abiertos1");
        
        for (Edificio auxEdi : listaEdificios) {
            if (auxEdi instanceof EdificioDeOficinas) {
                System.out.println("La cantidad de persinas en el edificio " + ((EdificioDeOficinas) auxEdi).cantidadDePersonas((EdificioDeOficinas) auxEdi));
        
                
            }
            
        }
    }
    
    
   
    
    
}
