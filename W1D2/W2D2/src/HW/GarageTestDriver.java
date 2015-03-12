/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW;

/**
 *
 * @author Pandoras_Box
 */
public class GarageTestDriver {
    public static void main(String[] args){
        car c = new car();
        c.setMake("Honda");
        
        garage g = new garage();
        g.store(c);
        
        System.out.println(g.retrieve().getMake());
        
        truck t = new truck();
        t.setMake("Ford");
        
        
        
    }
    
}
