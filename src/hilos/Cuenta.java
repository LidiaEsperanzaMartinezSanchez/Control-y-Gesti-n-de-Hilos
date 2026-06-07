/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos;

/**
 *
 * @author jaziel
 */
public class Cuenta {
    
    private int saldo = 100;
    
    public Cuenta(int saldo){
        this.saldo = saldo;
    }
    
    public Cuenta(){}
    
    public int getSaldo(){
        return saldo;
    }
    
    public void setSaldo (int saldo){
        this.saldo = saldo;
    }
    
    //Metodo para retirar y probar los hilos
    public synchronized void retirar(String nombreCajero, int cantidad) {
    System.out.println(nombreCajero + " consulta saldo actual: " + saldo);
    
    if (saldo >= cantidad) {
        System.out.println(nombreCajero + " esta procesando el retiro de: " + cantidad);
        try {//preuba el tiempo de espera del cajero
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
            
        saldo -= cantidad; 
        System.out.println(nombreCajero + " realizo el retiro, Saldo restante: " + saldo);
    } else {
        System.out.println(nombreCajero + ":Errr: Saldo insuficiente");
        }
    }
    
}
