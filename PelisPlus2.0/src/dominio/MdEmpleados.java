/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author Ruldin
 */
public class MdEmpleados {
    private String nombre;
    private String enero;
    private String febrero;
    private String marzo;
    public double promedio;
    public double totalM;
    
    public MdEmpleados (String nombreE, String eneroE, String febreroE, String marzoE, double promedioE, double totalE){
    this.nombre = nombreE;
    this.enero = eneroE;
    this.febrero = febreroE;
    this.marzo = marzoE;
    this.promedio = promedioE;
    this.totalM = totalE;
    }
    
    @Override
    public String toString(){
        return this.getNombre() + ";" + this.getEnero() + ";" + this.getFebrero()+ ";" + this.getMarzo() + ";" + this.getTotalM() + ";" + this.getPromedio();
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the enero
     */
    public String getEnero() {
        return enero;
    }

    /**
     * @param enero the enero to set
     */
    public void setEnero(String enero) {
        this.enero = enero;
    }

    /**
     * @return the febrero
     */
    public String getFebrero() {
        return febrero;
    }

    /**
     * @param febrero the febrero to set
     */
    public void setFebrero(String febrero) {
        this.febrero = febrero;
    }

    /**
     * @return the marzo
     */
    public String getMarzo() {
        return marzo;
    }

    /**
     * @param marzo the marzo to set
     */
    public void setMarzo(String marzo) {
        this.marzo = marzo;
    }

    /**
     * @return the promedio
     */
    public double getPromedio() {
        return promedio;
    }

    /**
     * @param promedio the promedio to set
     */
    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    /**
     * @return the totalM
     */
    public double getTotalM() {
        return totalM;
    }

    /**
     * @param totalM the totalM to set
     */
    public void setTotalM(int totalM) {
        this.totalM = totalM;
    }
}
