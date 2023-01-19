/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallermecanico;

/**
 *
 * @author JULIAN
 */
public class Pulgadas {
    private final int numerador;
    private final int denominador;

    public Pulgadas(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    @Override
    public String toString(){
        return this.numerador+"/"+this.denominador+" pulgadas";
    }
    
}
