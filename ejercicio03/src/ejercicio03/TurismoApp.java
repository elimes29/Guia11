/*
Una compañía de promociones turísticas desea mantener información sobre la infraestructura
de alojamiento para turistas, de forma tal que los clientes puedan planear sus vacaciones de
acuerdo con sus posibilidades. Los alojamientos se identifican por un nombre, una dirección,
una localidad y un gerente encargado del lugar. La compañía trabaja con dos tipos de
alojamientos: Hoteles y Alojamientos Extrahoteleros.

Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. Las
características de las distintas categorías son las siguientes:
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.

Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de
acuerdo a las prestaciones observadas. 
Las limosinas están disponibles para cualquier
cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro
será.

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

En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las
Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo. 

Realizar un programa en el que se representen todas las relaciones
descriptas.
Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento. 
 */
package ejercicio03;

import entidades.Alojamiento;
import entidades.Camping;
import entidades.Hotel;
import entidades.Hotel4;
import entidades.Hotel5;
import entidades.Residencia;
import enumeraciones.Gimnacio;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import utilidades.Comparadores;

/**
 *
 * @author usuario
 */
public class TurismoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Alojamiento> lista = new ArrayList<>();

        boolean band = true;
        /* Comentando para crear base de datos en main sin paso por pantalla
        // Creando Base de datos de alojamientos
        boolean band = true;
        int auxAloja;

        //Creando base de datos de alojamientos
        System.out.println("*********Creando Base de Datos de Alojamientos***************");
        System.out.println("");
        while (band) {
            System.out.println("***********Menú de Ingreso de Alojamientos a Base de Datos***************");
            System.out.println("Indique qué tipo de alojaminto desea crear");
            System.out.println("1:Hotel 5 estrellas");
            System.out.println("2:Hotel 4 estrellas");
            System.out.println("3:Hotel Camping");
            System.out.println("4:Residencia");
            auxAloja = leer.nextInt();

            switch (auxAloja) {
                case 1:
                    Hotel5 h5 = new Hotel5();
                    h5.crearHotel5(h5);
                    h5.mostrarHotel5(h5);
                    lista.add(h5);
                    break;
                case 2:
                    Hotel4 h4 = new Hotel4();
                    h4.crearHotel4(h4);
                    h4.mostrarHotel4(h4);
                    lista.add(h4);
                    break;
                case 3:
                    Camping c = new Camping();
                    c.crearCamping(c);
                    c.mostrarCamping(c);
                    lista.add(c);
                    break;
                case 4:
                    Residencia r = new Residencia();
                    r.crearResidencia(r);
                    r.mostrarResidencia(r);
                    lista.add(r);

            }
            System.out.println("¿Desea continuar creando alojamientos?(S/N)");
            String aux = leer.next();
            band = !aux.equalsIgnoreCase("N");

        }
        
         */

        //Creando alojamientos en Main
        //Hoteles 5 estrellas
        Hotel5 h5_1 = new Hotel5();
        h5_1.setNombre("Llanos");
        h5_1.setCantHabitaciones(150);
        h5_1.setCapaciadRes(60);
        h5_1.setTipoGin(Gimnacio.A);
        h5_1.setCantSuites(10);
        h5_1.setCantSalonesConf(6);
        h5_1.setCantLimosinas(5);
        h5_1.setPrecioHab(h5_1.calcularPrecio(h5_1));
        lista.add(h5_1);

        Hotel5 h5_2 = new Hotel5();
        h5_2.setNombre("Las lomas");
        h5_2.setCantHabitaciones(50);
        h5_2.setCapaciadRes(20);
        h5_2.setTipoGin(Gimnacio.B);
        h5_2.setCantSuites(2);
        h5_2.setCantSalonesConf(4);
        h5_2.setCantLimosinas(1);
        h5_2.setPrecioHab(h5_2.calcularPrecio(h5_2));
        lista.add(h5_2);

        Hotel5 h5_3 = new Hotel5();
        h5_3.setNombre("Hiton");
        h5_3.setCantHabitaciones(180);
        h5_3.setCapaciadRes(50);
        h5_3.setTipoGin(Gimnacio.A);
        h5_3.setCantSuites(10);
        h5_3.setCantSalonesConf(8);
        h5_3.setCantLimosinas(4);
        h5_3.setPrecioHab(h5_3.calcularPrecio(h5_3));
        lista.add(h5_3);

        Hotel5 h5_4 = new Hotel5();
        h5_4.setNombre("Eco Inn");
        h5_4.setCantHabitaciones(50);
        h5_4.setCapaciadRes(10);
        h5_4.setTipoGin(Gimnacio.A);
        h5_4.setCantSuites(2);
        h5_4.setCantSalonesConf(1);
        h5_4.setCantLimosinas(2);
        h5_4.setPrecioHab(h5_4.calcularPrecio(h5_4));
        lista.add(h5_4);

        //Hoteles 4 estrellas
        Hotel4 h4_1 = new Hotel4();
        h4_1.setNombre("Los cocos");
        h4_1.setCantHabitaciones(100);
        h4_1.setCapaciadRes(40);
        h4_1.setTipoGin(Gimnacio.A);
        h4_1.setPrecioHab(h4_1.calcularPrecio(h4_1));
        lista.add(h4_1);

        Hotel4 h4_2 = new Hotel4();
        h4_2.setNombre("Guaparo Inn");
        h4_2.setCantHabitaciones(800);
        h4_2.setCapaciadRes(120);
        h4_2.setTipoGin(Gimnacio.A);
        h4_2.setPrecioHab(h4_2.calcularPrecio(h4_2));
        lista.add(h4_2);

        Hotel4 h4_3 = new Hotel4();
        h4_3.setNombre("Los Atlas");
        h4_3.setCantHabitaciones(600);
        h4_3.setCapaciadRes(100);
        h4_3.setTipoGin(Gimnacio.B);
        h4_3.setPrecioHab(h4_3.calcularPrecio(h4_3));
        lista.add(h4_3);
                
        Hotel4 h4_4 = new Hotel4();
        h4_4.setNombre("La Cumbre");
        h4_4.setCantHabitaciones(800);
        h4_4.setCapaciadRes(200);
        h4_4.setTipoGin(Gimnacio.A);
        h4_4.setPrecioHab(h4_4.calcularPrecio(h4_4));
        lista.add(h4_4);
        
        //Campings
        Camping c1 = new Camping();
        c1.setNombre("Kama merú");
        c1.setRestautante(true);
        lista.add(c1);
        
        Camping c2 = new Camping();
        c2.setNombre("Quédate aquí");
        c2.setRestautante(true);
        lista.add(c2);
        
        Camping c3 = new Camping();
        c3.setNombre("La curvita");
        c3.setRestautante(false);
        lista.add(c3);
        
        Camping c4 = new Camping();
        c4.setNombre("La loma");
        c4.setRestautante(true);
        lista.add(c4);
        
        Camping c5 = new Camping();
        c5.setNombre("La compañía");
        c5.setRestautante(false);
        lista.add(c5);
        
        //Creando Residencias
        
        Residencia r1 = new Residencia();
        r1.setNombre("Las americas");
        r1.setDescuentos(true);
        lista.add(r1);
        
        Residencia r2 = new Residencia();
        r2.setNombre("Millonarios");
        r2.setDescuentos(false);
        lista.add(r2);

        Residencia r3 = new Residencia();
        r3.setNombre("Minas");
        r3.setDescuentos(true);
        lista.add(r3);
        
        System.out.println("La lista tiene " + lista.size() + " alojamientos.");
        System.out.println("");

        /*
        Realizar un programa en el que se representen todas las relaciones
descriptas.
Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento. 
         */
        band = true;
        int auxMenu;
        while (band) {
            System.out.println("********Menú de Consulta***********");
            System.out.println("¿Como desea realizar la consulta de los alojamientos?");
            System.out.println("1: Mostrar todos los alojamientos (Nombre/Tipo)");
            System.out.println("2: Mostrar solo los hoteles por precio -del mas caro al mas barato- (Nombre/precio)");
            System.out.println("3: Mostrar los camping que tienen Restaurante (Nombre)");
            System.out.println("4: Mostrar las residencias que cuentan con descuanto (Nombre)");
            auxMenu = leer.nextInt();

            switch (auxMenu) {
                case 1:
                    System.out.println("********Mostrando Alojamintos****************");
                    if (lista.isEmpty()) {
                        System.out.println("No hay alojamientos en la Base de datos");
                    }
                    for (Alojamiento aloja : lista) {
                        if (aloja instanceof Hotel5) {
                            System.out.println(aloja.getNombre() + " / Hotel 5 estrellas");
                            continue;
                        }
                        if (aloja instanceof Hotel4) {
                            System.out.println(aloja.getNombre() + " / Hotel 4 estrellas");
                            continue;
                        }
                        if (aloja instanceof Camping) {
                            System.out.println(aloja.getNombre() + " / Camping");
                            continue;
                        }
                        if (aloja instanceof Residencia) {
                            System.out.println(aloja.getNombre() + " / Residencia");
                        }
                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("*********Mostrando Hoteles ordenados por precio***************");
                    ArrayList<Hotel> auxHotel = new ArrayList<>();

                    for (Alojamiento aloja : lista) {
                        if (aloja instanceof Hotel4) {
                            auxHotel.add((Hotel) aloja);
                            continue;
                        }
                        if (aloja instanceof Hotel5) {
                            auxHotel.add((Hotel) aloja);
                        }
                    }
                    Collections.sort(auxHotel, Comparadores.ordenarPorPrecio); //ordenamos
                    for (Hotel al : auxHotel) { //Mostramos
                        System.out.println(al.getNombre() + " / " + al.getPrecioHab());
                    }
                    if (auxHotel.isEmpty()) {
                        System.out.println("No hay hoteles para mostrar");
                    }
                    System.out.println("");
                    break;

                case 3:
                    boolean ban = true;
                    System.out.println("*********Mostrando Campins con Restaurantes***************");
                    for (Alojamiento aloja : lista) {
                        if (aloja instanceof Camping) {
                            if (((Camping) aloja).getRestautante()) {
                                System.out.println(aloja.getNombre() + " tiene restaurante.");
                                ban = false;
                            }
                        }
                    }
                    if (ban) {
                        System.out.println("No hay Campins con Restaurantes");
                    }

                    System.out.println("");
                    break;

                case 4:
                    boolean ban1 = true;
                    System.out.println("*************Mostrado residencias con descuentos para el gremio*****************");
                    for (Alojamiento aloja : lista) {
                        if (aloja instanceof Residencia) {
                            if (((Residencia) aloja).getDescuentos()) {
                                System.out.println(aloja.getNombre() + " tiene descuentos para el gremio.");
                                ban1 = false;
                            }
                        }
                    }
                    if (ban1) {
                        System.out.println("No hay Residencias con descuentos");
                    }
                    System.out.println("");
                    break;
            }

            System.out.println("¿Desea realizar otra consulta?(S/N)");
            String aux = leer.next();
            band = !aux.equalsIgnoreCase("N");
        }

    }

}
