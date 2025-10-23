/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

/**
 *
 * @author valer
 */
public class Vendedor {
    private String nombre;
    private int cedula;
    private int codigo;
    private String sucursal;
    private String cPropio;
    
    public Vendedor(String nombreA, int cedulaA, int codigoA, String sucursalA,String carropropio) {
        this.nombre = nombreA;
        this.cedula = cedulaA;
        this.codigo = codigoA;
        this.sucursal = sucursalA;
        this.cPropio = cPropio;
    }

    public String getNombreA() {
        return nombre;
    }

    public void setNombreA(String nombre) {
        this.nombre = nombre;
    }

    public int getCedulaA() {
        return cedula;
    }

    public void setCedulaA(int cedula) {
        this.cedula = cedula;
    }

    public int getCodigoA() {
        return codigo;
    }

    public void setCodigoA(int codigo) {
        this.codigo = codigo;
    }

    public String getSucursalA() {
        return sucursal;
    }

    public void setSucursalA(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getcPropio() {
        return cPropio;
    }

    public void setCarropropio(String cPropio) {
        this.cPropio = cPropio;
    }
    
}
