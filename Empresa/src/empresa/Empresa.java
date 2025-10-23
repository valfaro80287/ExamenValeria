/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresa;

import javax.swing.JOptionPane;

/**
 *
 * @author valer
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido al sistema de control de facturas!");

        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        int cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su número de cédula:"));
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su código:"));
        String sucursal = JOptionPane.showInputDialog("Ingrese sucursal a la que pertenece:");
        String cPropio = JOptionPane.showInputDialog("Tiene carro propio (si/no)?:");
        
        Vendedor vendedor = new Vendedor(nombre, cedula, codigo, sucursal, cPropio);
        
        String continuar = "si";

        while (continuar.equals("si") || continuar.equals("SI") || continuar.equals("Si")) {
            JOptionPane.showMessageDialog(null, "Bienvenido al sistema de registro de facturas:");

            String nombreC = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
            int cedulaC = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cédula del cliente:"));
            int codigoF = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código de la factura:"));
            double montoF = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la factura:"));
            int mesF = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del mes (1-12):"));
            

            while (mesF < 1 || mesF > 12) {
                mesF = Integer.parseInt(JOptionPane.showInputDialog("Mes inválido. Ingrese un número entre 1 y 12:"));
            }
            
            int producElec = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de productos eléctricos que hay en la factura:"));
            int producAuto = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de productos automotrices que hay en la factura:"));
            int producCons = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de productos de construcción que hay en la factura:"));

            continuar = JOptionPane.showInputDialog("Desea registrar otra factura? (si/no):");
        }
    
    String mensage = "El agente vendedor "+nombre+" código: "+codigo+"en el mes de :\n\n" +"Vendió un total de: "+"en facturas.\n"+"Obtuvo un total en comisiones de: \n"+"El agente vendedor ___ logro el objetivo de llegar al bono extra. \n"+"Puntos obtenidos por el vendedor"+"El agente vendedor ____ cuenta con vehículo propio. \n"+"Sucursal: ____";
    JOptionPane.showMessageDialog(null, mensage);
    
    }

}
