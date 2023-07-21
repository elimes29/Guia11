/*
El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación. A
continuación, debe programar las clases definidas en las que, además de los constructores,
hay que desarrollar los métodos correspondientes a las siguientes operaciones:

• Cambio del estado civil de una persona.
• Reasignación de despacho a un empleado.
• Matriculación de un estudiante en un nuevo curso.
• Cambio de departamento de un profesor.
• Traslado de sección de un empleado del personal de servicio.
• Imprimir toda la información de cada tipo de individuo. 
Incluya un programa de prueba
que instancie objetos de los distintos tipos y pruebe los métodos desarrollados. 
 */
package ejercico04;

import entidades.Empleado;
import entidades.Estudiante;
import entidades.Persona;
import entidades.PersonalServicio;
import entidades.Profesor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class SistemaFacultad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Scanner leer1 = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Persona> listaPersonas = new ArrayList();
        boolean band = true;

        //Creando base de datos de personas
        System.out.println("*********Creando Base de Datos de Perosnas en la facultad***************");
        System.out.println("");
        while (band) {
            System.out.println("***********Menú de Ingreso de Personas***************");
            System.out.println("Indique qué tipo de persona desea ingresar");
            System.out.println("1:Estudiante");
            System.out.println("2:Profesor");
            System.out.println("3:Personal de Servicio");
            int auxPer = leer.nextInt();

            switch (auxPer) {
                case 1:
                    Estudiante es = new Estudiante();
                    es.crearEstudiante(es);
                    listaPersonas.add(es);
                    break;
                case 2:
                    Profesor pr = new Profesor();
                    pr.crearProfesor(pr);
                    listaPersonas.add(pr);
                    break;
                case 3:
                    PersonalServicio ps = new PersonalServicio();
                    ps.crearPersonalServicio(ps);
                    listaPersonas.add(ps);
                    break;
            }
            System.out.println("¿Desea continuar agreando personas?(S/N)");
            String aux = leer.next();
            band = !aux.equalsIgnoreCase("N");

        }

        //Probando los métodos
        /*
        • Cambio del estado civil de una persona.
• Reasignación de despacho a un empleado.
• Matriculación de un estudiante en un nuevo curso.
• Cambio de departamento de un profesor.
• Traslado de sección de un empleado del personal de servicio.
• Imprimir toda la información de cada tipo de individuo. 
         */
        band = true;
        int auxMenu;
        System.out.println("*********Menú de métodos***************");
        System.out.println("");

        while (band) {
            System.out.println("¿Qué desea realizar?");
            System.out.println("1: Cambiar el estado civil de una persona.");
            System.out.println("2: Reasignar el número de despaho de un empleado.");
            System.out.println("3: Matricular a un estudiante en un curso.");
            System.out.println("4: Cambiar de departamento a un profesor.");
            System.out.println("5: Trasladar de sección a un personal de servicio.");
            System.out.println("6: Imprimier toda la información de cada tipo de individio.");
            System.out.println("Otro: nada.");
            auxMenu = leer.nextInt();
            switch (auxMenu) {
                case 1:
                    boolean cont = true;
                    for (Persona aux : listaPersonas) {
                        String ban;
                        System.out.println("Desea cambiar el estado civil de: ");
                        aux.mostrarPersona(aux);
                        System.out.println("S/N");
                        ban = leer1.nextLine();
                        if (ban.equalsIgnoreCase("S")) {
                            aux.cambioEstadiCIvil(aux);
                            cont = false;
                            break;
                        }
                    }
                    if (cont) {
                        System.out.println("Se terminó la lista de personas y no se hizo cambio de estado civil a ninuno");
                        System.out.println("");
                    }
                    break;
                case 2:
                    cont = true;
                    for (Persona aux : listaPersonas) {
                        
                        if (aux instanceof Profesor) {
                            String ban;
                            System.out.println("Reasignar el número de despaho de: ");
                            aux.mostrarPersona(aux);
                            System.out.println("S/N");
                            ban = leer1.nextLine();
                            if (ban.equalsIgnoreCase("S")) {
                                ((Empleado) aux).reasignacionNumDespacho((Empleado) aux);
                                cont = false;
                                break;
                            }
                        }else if (aux instanceof PersonalServicio) {
                            String ban;
                            System.out.println("Reasignar el número de despaho de: ");
                            aux.mostrarPersona(aux);
                            System.out.println("S/N");
                            ban = leer1.nextLine();
                            if (ban.equalsIgnoreCase("S")) {
                                ((Empleado) aux).reasignacionNumDespacho((Empleado) aux);
                                cont = false;
                                break;
                            }
                        }
                    }
                    if (cont) {
                        System.out.println("Se terminó la lista de personas y no se hizo reasinación de número de despacho");
                        System.out.println("");
                    }
                    break;
                case 3:
                    
                      cont = true;
                    for (Persona aux : listaPersonas) {
                        
                        if (aux instanceof Estudiante) {
                            String ban;
                            System.out.println("Desea matricular en algun curso al estudiante: ");
                            aux.mostrarPersona(aux);
                            System.out.println("S/N");
                            ban = leer1.nextLine();
                            if (ban.equalsIgnoreCase("S")) {
                                ((Estudiante) aux).matriculacionCurso((Estudiante) aux);
                                cont = false;
                                break;
                            }
                        
                        }
                    }
                    if (cont) {
                        System.out.println("Se terminó la lista de personas y no se matriculó a ningún estudiante");
                        System.out.println("");
                    }
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }

            System.out.println("¿Desea realizar otra consulta?(S/N)");
            String aux = leer.next();
            band = !aux.equalsIgnoreCase("N");
        }

    }

}
