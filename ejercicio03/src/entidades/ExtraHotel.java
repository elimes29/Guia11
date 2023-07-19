/*
En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa. 
Existen dos tipos de alojamientos extrahoteleros: los Camping y las
Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo. Realizar un programa en el que se representen todas las relaciones
descriptas.
 */
package entidades;

/**
 *
 * @author usuario
 */
public class ExtraHotel extends Alojamiento {
    protected Boolean privado;
    protected float cantMetros2;

    public ExtraHotel() {
    }

    public ExtraHotel(Boolean privado, float cantMetros2, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.cantMetros2 = cantMetros2;
    }

    public ExtraHotel(Boolean privado, float cantMetros2) {
        this.privado = privado;
        this.cantMetros2 = cantMetros2;
    }

    public Boolean getPrivado() {
        return privado;
    }

    public void setPrivado(Boolean privado) {
        this.privado = privado;
    }

    public float getCantMetros2() {
        return cantMetros2;
    }

    public void setCantMetros2(float cantMetros2) {
        this.cantMetros2 = cantMetros2;
    }

    public void crearExtraHotel(ExtraHotel eh){
        super.crearAlojamiento(eh);
        System.out.println("¿El alojamiento extrahotelero es privado? (S/N)");
        String aux = leer.next();
        if (aux.equalsIgnoreCase("S")){
            eh.setPrivado(true);
        } else {
            eh.setPrivado(false);
        }
        
        System.out.println("Ingrese la cantidad de metros cuadrados del alojamiento extrahotelero");
        eh.setCantMetros2(leer.nextFloat());
    }

    
}
