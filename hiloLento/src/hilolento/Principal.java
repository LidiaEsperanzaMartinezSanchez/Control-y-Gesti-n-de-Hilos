/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hilolento;

/**
 *
 * @author jaziel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Thread hiloMicroondas = new Thread(new microondas());
        hiloMicroondas.start(); // Encendemos el microondas

        //hacemos quee el usuario vea 2 segundos el microondas
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        //para cancelar el calentamiento        

        hiloMicroondas.interrupt(); //se manda la señal de interrupcion del hilo lento 
    }
}
