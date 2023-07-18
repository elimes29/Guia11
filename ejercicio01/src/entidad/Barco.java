/*
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
 */
package entidad;

import java.util.Scanner;


/**
 *
 * @author usuario
 */
public class Barco {
    protected String matricula;
    protected Integer eslora;
    protected Integer anoFabricacion;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Barco() {
    }

    public Barco(String matricula, Integer eslora, Integer anoFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anoFabricacion = anoFabricacion;
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
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", anoFabricacion=" + anoFabricacion + '}';
    }

    public void crearBarco(Barco b){
        
        System.out.println("Ingrese la Matricula");
        b.setMatricula(leer.nextLine());
        System.out.println("Ingrese la estola (m)");
        b.setEslora(leer.nextInt());
        System.out.println("Ingrese el año de fabricación");
        b.setAnoFabricacion(leer.nextInt());      
    }
    
    public float modulobarco(Barco b){
        return (float)10*eslora;
    }

    
}
