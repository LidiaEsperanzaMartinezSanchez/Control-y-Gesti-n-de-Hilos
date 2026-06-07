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
    
}
