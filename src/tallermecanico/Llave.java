/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallermecanico;

/**
 *
 * @author JULIAN
 * @param <T> El tipo de medida para la llave. 
 */
public class Llave<T> {
    private final T medida; //Tamaño en milimetros de la llave

    public Llave(T Medida) {
        this.medida = Medida;
    }
    
    @Override
    public String toString(){
        return "el tamaño de la llave es: "+this.medida; 
    }   
}
