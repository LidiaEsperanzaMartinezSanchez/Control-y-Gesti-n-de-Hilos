/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilolento;

/**
 *
 * @author jaziel
 */
class microondas implements Runnable {
    @Override
    public void run() {
        
        while (!Thread.currentThread().isInterrupted()) {
            try {
                
                
                for (int i = 5; i > 0; i--) {
                    System.out.println("Tiempo restante: " + i + " segundos...");
                    
                    //duerme el hilo un segundo por vuelta
                    Thread.sleep(1000); 
                }
                System.out.println("calentamiento listo");
                break;
                
            } catch (InterruptedException e) {
                System.out.println("calentamiento cancelado");
                
                
                Thread.currentThread().interrupt();
            }
        }
        
    }
}