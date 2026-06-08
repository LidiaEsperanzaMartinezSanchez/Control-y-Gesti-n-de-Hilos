/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilorapido;

/**
 *
 * @author jaziel
 */
class cargar implements Runnable {
    private String elemento;

    public cargar(String elemento) {
        this.elemento = elemento;
    }
    public cargar(){}
    
    public String getElemento(){
        return elemento;
    }
    public void setElemento(String elemento){
        this.elemento = elemento;
    }

    //metodo para ejecutar el hilo rapido
    @Override
    public void run() {
        System.out.println("Iniciando.... " + elemento);
        
        for (int i = 1; i <= 3; i++) {
            System.out.println("Cargando.... " + elemento + " -> " + i);
        }
        
        System.out.println("Terminado " + elemento + " inicio con exito");
    }
}