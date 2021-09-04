/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import datos.AccesoDatos;
import datos.AccesoDatosImpl;
import dominio.MdEmpleados;
import excepciones.AccesoDatosEx;
import excepciones.LecturaDatosEx;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ruldin
 */
public class PlanillaEmpleadosImpl implements PanillaEmpleados{
    
    private final AccesoDatos datos;
    
    public PlanillaEmpleadosImpl(){
        this.datos = new AccesoDatosImpl(); //poner * en el import datos.*
    }
    
    @Override
    public void agregarEmpleado(String nombreEmpleado, String ene, String feb, String mar, double prom, double total, String nombreArchivo){
        try {
            MdEmpleados empleado = new MdEmpleados(nombreEmpleado, ene, feb, mar, prom, total);
            boolean anexar = false;
            List<MdEmpleados> empleados = datos.listar(nombreArchivo);
            for(MdEmpleados empleadin : empleados){
                empleadin.totalM = (Double.parseDouble(empleadin.getEnero()) + Double.parseDouble(empleadin.getFebrero()) + Double.parseDouble(empleadin.getMarzo()));
                empleadin.promedio = empleadin.getTotalM() / 3;
            }
            try {
                anexar = datos.existe(nombreArchivo);//bandera si anexa o no
                datos.escribir(empleado, nombreArchivo, anexar);
            } catch (AccesoDatosEx ex) {
                System.out.println("Error de acceso a datos");
                ex.printStackTrace();
            }
        } catch (LecturaDatosEx ex) {
            Logger.getLogger(PlanillaEmpleadosImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void listarEmpleados(String nombreArchivo) {

        try {
            List<MdEmpleados> empleados = datos.listar(nombreArchivo);
            for(MdEmpleados empleado : empleados){
                System.out.println("Empleado: " + empleado);
            }
        } catch (LecturaDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace();
        }
        
    }

    @Override
    public void buscarEmpleados(String nombreArchivo, String buscar) {
        String resultado = null;
        try {
           
            resultado = datos.buscar(nombreArchivo, buscar);
        } catch (LecturaDatosEx ex) {
            System.out.println("Error al buscar al empleado");
        }
         System.out.println("Resultado Busqueda:"+resultado);
    }

    @Override
    public void iniciarArchivo(String nombreArchivo) {
        
        try {
            if(datos.existe(nombreArchivo)){
                datos.borrar(nombreArchivo);
                datos.crear(nombreArchivo);
            } else {
                //crearmos archivo
                datos.crear(nombreArchivo);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace();
        }

    }    
}
