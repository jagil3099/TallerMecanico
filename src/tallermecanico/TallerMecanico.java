/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallermecanico;

/**
 *
 * @author JULIAN
 */
public class TallerMecanico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Llave<Integer> x1 = new Llave<>(10);
        Llave<String> x2= new Llave<>("otro tipo!");
        Llave<Pulgadas> x3= new Llave<>(new Pulgadas(3, 8));
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        
    }
    
}
