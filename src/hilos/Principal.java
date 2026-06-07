/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hilos;

/**
 *
 * @author jaziel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cuenta cuenta1 = new Cuenta(100); //se crea la cuenta unica
        
        retiro retiro1 = new retiro(cuenta1, "Cajero banorte", 70); //se realiza el primer retiro
        retiro retiro2 = new retiro(cuenta1, "Cajero banorte 2", 70);//se realiza el segundo retiro
        
        Thread hilo1 = new Thread(retiro1);//Se asigna cada retiro a un hilo
        Thread hilo2 = new Thread(retiro2);
        
        hilo1.start();//se inician los hilos
        hilo2.start();
    }
    
}
