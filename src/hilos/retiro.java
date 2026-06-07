/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos;

/**
 *
 * @author jaziel
 */
public class retiro {
    private Cuenta cuentaCompartida;
    private String nombreCajero;
    private int CR;
    
    public retiro (){}
    
    public retiro (Cuenta cuentaCompartida, String nombreCajero, int CR){
        this.cuentaCompartida = cuentaCompartida;
        this.nombreCajero = nombreCajero;
        this.CR = CR;
    }
    
    public Cuenta getCuentaCompartida(){
        return cuentaCompartida;
    }
    public String getNombreCajero(){
        return nombreCajero;
    }
    public int CR(){
        return CR;
    }
    
    public void setCuentaCompartida(Cuenta cuentaCompartida){
        this.cuentaCompartida = cuentaCompartida;
    }
    
    public void setNombreCajero(String nombreCajero){
        this.nombreCajero = nombreCajero;
    }
    public void setCR(int CR){
        this.CR = CR;
    }
}
