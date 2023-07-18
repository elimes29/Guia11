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
public class Velero extends Barco  {
    protected Integer numMastil;

    public Velero() {
    }

    public Velero(Integer numMastil) {
        this.numMastil = numMastil;
    }

    public Velero(Integer numMastil, String matricula, Integer eslora, Integer anoFabricacion) {
        super(matricula, eslora, anoFabricacion);
        this.numMastil = numMastil;
    }

    public Integer getNumMastil() {
        return numMastil;
    }

    public void setNumMastil(Integer numMastil) {
        this.numMastil = numMastil;
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
        return "Velero{" + "numMastil=" + numMastil + '}';
    }

    public void crearVelero(Velero v){
        super.crearBarco(v);
        System.out.println("Indique el número de mastiles");
        v.setNumMastil(leer.nextInt());
        
    }
    
    public Float moduloVelero(Velero v){
        return (float)numMastil+super.modulobarco(v);
    }
    
}
