/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hilorapido;

/**
 *
 * @author jaziel
 */
public class Principal {
    public static void main(String[] args) {
        //creamos hilos 
        
        Thread hilo1 = new Thread(new cargar("Personajes"));
        Thread hilo2 = new Thread(new cargar("Habilidades"));
        
        //iniciamos los hilos en paralelo
        hilo1.start();
        hilo2.start();
    }
}