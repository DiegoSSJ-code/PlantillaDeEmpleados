/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author Ruldin
 */
public interface PanillaEmpleados {
    public void agregarEmpleado(String nombreEmpleado, String ene, String feb, String mar, double prom, double total, String nombreArchivo);
    public void listarEmpleados(String nombreArchivo);
    public void buscarEmpleados(String nombreArchivo, String buscar);
    public void iniciarArchivo(String nombreArchivo);
    
}
