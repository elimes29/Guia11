/*
 Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class BarcoMotor extends Barco {

    protected Float potenciaCV;

    public BarcoMotor() {
    }

    public BarcoMotor(Float potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public BarcoMotor(Float potenciaCV, String matricula, Integer eslora, Integer anoFabricacion) {
        super(matricula, eslora, anoFabricacion);
        this.potenciaCV = potenciaCV;
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
        return "BarcoMotor{" + "potenciaCV=" + potenciaCV + '}';
    }

    public void crearBarcoMotor(BarcoMotor bm) {
        super.crearBarco(bm);
        System.out.println("Ingrese potencia del barco en CV");
        bm.setPotenciaCV(leer.nextFloat());
        
    }
    
    public Float moduloBarcoMotor(BarcoMotor bm){
        return potenciaCV + super.modulobarco(bm);
    }

}
