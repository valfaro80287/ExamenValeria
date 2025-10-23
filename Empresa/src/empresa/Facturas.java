/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

/**
 *
 * @author valer
 */
public class Facturas {
    private int codigoF;
    private double montoF;
    private int mesF;
    private int producElec;
    private int producAuto;
    private int producCons;

    public Facturas(int codigoF, double montoF, int mesF, int electrico, int automotriz, int construccion) {
        this.codigoF = codigoF;
        this.montoF = montoF;
        this.mesF = mesF;
        this.producElec = producElec;
        this.producAuto = producAuto;
        this.producCons = producCons;
    }

    public int getCodigoF() {
        return codigoF;
    }

    public void setCodigoF(int codigoF) {
        this.codigoF = codigoF;
    }

    public double getMontoF() {
        return montoF;
    }

    public void setMontoF(double montoF) {
        this.montoF = montoF;
    }

    public int getMesF() {
        return mesF;
    }

    public void setMesF(int mesF) {
        this.mesF = mesF;
    }

    public int getProducElec() {
        return producElec;
    }

    public void setProducElec(int producElec) {
        this.producElec = producElec;
    }

    public int getProducAuto() {
        return producAuto;
    }

    public void setProducAuto(int producAuto) {
        this.producAuto = producAuto;
    }

    public int getProducCons() {
        return producCons;
    }

    public void setProducCons(int producCons) {
        this.producCons = producCons;
    }
    
    
    public void comisionesV(){
        double bono = 0;
        int puntosV = 0;
        if (producElec < 1 && producAuto < 1 && producCons <1 && montoF > 5000){
            bono += montoF * 0.010;
            puntosV += 3;
        }
        
        if (producElec >= 3){
            bono += montoF * 0.04;
            puntosV += 1;
        } else {
            bono += montoF * 0.02;
            puntosV += 1;
        }
        
        if (producAuto > 4){
            bono += montoF * 0.04;
            puntosV += 1;
        } else {
            bono += montoF * 0.02;
            puntosV += 1;
        }
        
        if (producCons > 1){
            bono += montoF * 0.08;
            puntosV += 2;
        }
        
        if (montoF > 50000){
            bono += montoF * 0.05;
            puntosV += 1; 
        }
        
    }
}
    
       
