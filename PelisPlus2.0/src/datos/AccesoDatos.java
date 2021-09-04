/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import dominio.MdEmpleados;
import excepciones.*;
import java.util.List;

/**
 *
 * @author Ruldin
 */
public interface AccesoDatos {
    boolean existe(String nombreArchivo) throws AccesoDatosEx;
    public List<MdEmpleados> listar (String nombreArchivo) throws LecturaDatosEx;
    void escribir(MdEmpleados empleado, String nombreArchivo, boolean anexar) throws EscrituraDatosEx;
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx;
    public void crear(String nombreArchivo) throws AccesoDatosEx;
    public void borrar(String nombreArchivo) throws AccesoDatosEx;
    
}
