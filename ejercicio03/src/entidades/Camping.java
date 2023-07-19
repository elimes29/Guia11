/*
 los Camping y las
Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones.
 */
package entidades;

/**
 *
 * @author usuario
 */
public final class Camping extends ExtraHotel {
    private Integer capMaxCarpa;
    private Integer cantBanosDisp;
    private Boolean restautante;

    public Camping() {
    }

    public Camping(Integer capMaxCarpa, Integer cantBanosDisp, Boolean restautante) {
        this.capMaxCarpa = capMaxCarpa;
        this.cantBanosDisp = cantBanosDisp;
        this.restautante = restautante;
    }

    public Camping(Integer capMaxCarpa, Integer cantBanosDisp, Boolean restautante, Boolean privado, float cantMetros2, String nombre, String direccion, String localidad, String gerente) {
        super(privado, cantMetros2, nombre, direccion, localidad, gerente);
        this.capMaxCarpa = capMaxCarpa;
        this.cantBanosDisp = cantBanosDisp;
        this.restautante = restautante;
    }

    public Camping(Integer capMaxCarpa, Integer cantBanosDisp, Boolean restautante, Boolean privado, float cantMetros2) {
        super(privado, cantMetros2);
        this.capMaxCarpa = capMaxCarpa;
        this.cantBanosDisp = cantBanosDisp;
        this.restautante = restautante;
    }

    public Integer getCapMaxCarpa() {
        return capMaxCarpa;
    }

    public void setCapMaxCarpa(Integer capMaxCarpa) {
        this.capMaxCarpa = capMaxCarpa;
    }

    public Integer getCantBanosDisp() {
        return cantBanosDisp;
    }

    public void setCantBanosDisp(Integer cantBanosDisp) {
        this.cantBanosDisp = cantBanosDisp;
    }

    public Boolean getRestautante() {
        return restautante;
    }

    public void setRestautante(Boolean restautante) {
        this.restautante = restautante;
    }
    

    public void crearCamping(Camping c){
        super.crearExtraHotel(c);
        
        System.out.println("Ingrese la capacidad máxima de carpas del Camping");
        c.setCapMaxCarpa(leer.nextInt());
        System.out.println("Ingrese la cantidad de baños del Camping");
        c.setCantBanosDisp(leer.nextInt());
        
        System.out.println("¿El Campin cuenta con restaurante? (S/N)");
        String aux = leer.next();
        if (aux.equalsIgnoreCase("S")){
            c.setRestautante(true);
        } else {
             c.setRestautante(false);
        }
    }
    
        public void mostrarCamping(Camping c){
        System.out.println("***********Camping****************");
        System.out.println("************"+c.getNombre()+"************");
    }

    
}

