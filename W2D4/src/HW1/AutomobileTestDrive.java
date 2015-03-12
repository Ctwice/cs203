/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW1;

import java.util.ArrayList;

/**
 *
 *
 */
public class AutomobileTestDrive {
    public static void main(String[] args) {
        
        ArrayList<Automobile> autos = new ArrayList<>();
        
        

        Car c1 = new Car("Ford", "Torus", 2004, "Red", false, 3);
        autos.add(c1);
        Car c2 = new Car("Toyota", "Prius", 2013, "Magenta", 5);
        autos.add(c2);
        
        
        Truck t1 = new Truck("Toyota", "4-Runner", 2009, "White", 15, true);
        autos.add(t1);
        Truck t2 = new Truck("Ford", "F-150", 2001, "Blue", 25);
        autos.add(t2);
        
        
        for (Automobile a : autos) {
            a.accelerate(); 
            a.accelerate();
            a.accelerate();
            a.brake();
            System.out.println(a.speed); 
        }
    }
}