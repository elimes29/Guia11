/*
Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo
 */
package entidades;

/**
 *
 * @author usuario
 */
public final class Residencia extends ExtraHotel {

    private Integer cantHab;
    private Boolean descuentos;
    private Boolean campoDeportvo;

    public Residencia() {
    }

    public Residencia(Integer cantHab, Boolean descuentos, Boolean campoDeportvo) {
        this.cantHab = cantHab;
        this.descuentos = descuentos;
        this.campoDeportvo = campoDeportvo;
    }

    public Residencia(Integer cantHab, Boolean descuentos, Boolean campoDeportvo, Boolean privado, float cantMetros2, String nombre, String direccion, String localidad, String gerente) {
        super(privado, cantMetros2, nombre, direccion, localidad, gerente);
        this.cantHab = cantHab;
        this.descuentos = descuentos;
        this.campoDeportvo = campoDeportvo;
    }

    public Residencia(Integer cantHab, Boolean descuentos, Boolean campoDeportvo, Boolean privado, float cantMetros2) {
        super(privado, cantMetros2);
        this.cantHab = cantHab;
        this.descuentos = descuentos;
        this.campoDeportvo = campoDeportvo;
    }

    public Integer getCantHab() {
        return cantHab;
    }

    public void setCantHab(Integer cantHab) {
        this.cantHab = cantHab;
    }

    public Boolean getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(Boolean descuentos) {
        this.descuentos = descuentos;
    }

    public Boolean getCampoDeportvo() {
        return campoDeportvo;
    }

    public void setCampoDeportvo(Boolean campoDeportvo) {
        this.campoDeportvo = campoDeportvo;
    }

    public void crearResidencia(Residencia r) {
        super.crearExtraHotel(r);
        System.out.println("Ingrese la cantidad de habitaciones de la residencia");
        r.setCantHab(leer.nextInt());

        System.out.println("¿Cuenta con descuentos para el Gremio? (S/N)");
        String aux = leer.next();
        if (aux.equalsIgnoreCase("S")) {
            r.setDescuentos(true);
        } else {
            r.setDescuentos(false);
        }

        System.out.println("¿Cuenta con campos deportivos? (S/N)");
        aux = leer.next();
        if (aux.equalsIgnoreCase("S")) {
            r.setCampoDeportvo(true);
        } else {
            r.setCampoDeportvo(false);
        }

    }

    public void mostrarResidencia(Residencia r) {
        System.out.println("***********Residencia****************");
        System.out.println("************" + r.getNombre() + "************");
    }

}
