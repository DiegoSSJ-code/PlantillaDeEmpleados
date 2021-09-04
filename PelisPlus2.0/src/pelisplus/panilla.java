/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelisplus;

import java.util.Scanner;
import negocio.PanillaEmpleados;
import negocio.PlanillaEmpleadosImpl;

/**
 *
 * @author Ruldin
 */
public class panilla {

    private static final Scanner scanner = new Scanner(System.in);
    private static int opcion = -1;
    private static final String nombreArchivo = "C:\\Users\\Win10\\OneDrive - Universidad Mariano Gálvez\\Escritorio\\empleados";
    private static final PanillaEmpleados planilla = new PlanillaEmpleadosImpl();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Mientras la opcion elegida sea 0, preguntamos al usuario
        while (opcion != 0) {
            try {
                System.out.println("Elige opcion:\n1.- Iniciar planilla de empleados"
                        + "\n2.- Agregar empleado\n"
                        + "3.- Listar empleados\n"
                        + "4.- Buscar empleados\n"
                        + "0.- Salir");

                opcion = Integer.parseInt(scanner.nextLine());

                //Ejemplo de switch case en Java
                switch (opcion) {
                    case 1:
                        //1. Creamos el objeto que administra el catalogo de personas
                        //La creacion del archivo es opcional, de todas maneras se creara 
                        //al escribir por primera vez en el archivo
                        planilla.iniciarArchivo(nombreArchivo);
                        break;
                    case 2:
                        //2. agregar informacion archivo
                        System.out.println("Introduce el nombre de un empleado a agregar: ");
                        String nombre = scanner.nextLine();
                        System.out.println("Introduce las ventas de enero: ");
                        String ene = scanner.nextLine();
                        System.out.println("Introduce las ventas de febrero: ");
                        String feb = scanner.nextLine();
                        System.out.println("Introduce las ventas de marzo: ");
                        String mar = scanner.nextLine();
                        Double prom = 0.0;
                        Double total = 0.0;
                        planilla.agregarEmpleado(nombreArchivo, ene, feb, mar, prom, total, nombreArchivo);
                        break;
                    case 3:
                        //3. listar catalogo completo
                        planilla.listarEmpleados(nombreArchivo);
                        break;
                    case 4:
                        //4. Buscar pelicula
                        System.out.println("Introduce el nombre de un empleado a buscar:");
                        String buscar = scanner.nextLine();
                        planilla.buscarEmpleados(nombreArchivo, buscar);
                        break;
                    case 0:
                        System.out.println("!Hasta pronto!");
                        break;
                    default:
                        System.out.println("Opcion no reconocida");
                        break;
                }
                System.out.println("\n");

            } catch (Exception e) {
                System.out.println("Error!");
            }
        }

    }
}
