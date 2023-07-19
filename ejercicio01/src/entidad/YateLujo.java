/*
 Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
 */
package entidad;

/**
 *
 * @author usuario
 */
public class YateLujo extends BarcoMotor {
    protected Integer numCamarotes;

    public YateLujo() {
    }

    public YateLujo(Integer numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    public YateLujo(Integer numCamarotes, Float potenciaCV) {
        super(potenciaCV);
        this.numCamarotes = numCamarotes;
    }

    public YateLujo(Integer numCamarotes, Float potenciaCV, String matricula, Integer eslora, Integer anoFabricacion) {
        super(potenciaCV, matricula, eslora, anoFabricacion);
        this.numCamarotes = numCamarotes;
    }

    public Integer getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(Integer numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    public Float getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(Float potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Integer getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setAnoFabricacion(Integer anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }

    @Override
    public String toString() {
        return "YateLujo{" + "numCamarotes=" + numCamarotes + '}';
    }

    

    public void crearYate(YateLujo y){
        super.crearBarcoMotor(y);
        System.out.println("Ingrese el número de Camarotes");
        y.setNumCamarotes(leer.nextInt());
        
    }
    
    public Float moduloYate(YateLujo yl){
        float aux = super.moduloBarcoMotor(yl);
        aux = aux + (float)numCamarotes;
        System.out.println("Modulo del yate" + aux);
       return aux; 
    }
    
}
