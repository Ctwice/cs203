/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW;

import java.util.ArrayList;
/**
 *
 * @author Pandoras_Box
 */
public class AutomobileTest {
    public static void main(String[] args){
    
       ArrayList<Automobile> cars = new ArrayList<>();
      
      Automobile c1 = new car();
      c1.setMake("Toyota");
      Automobile c2 = new car();
      c2.setMake("Ford");
       
      Automobile t1 = new truck();
      Automobile t2 = new truck();
      Automobile t3 = new truck();
      
      cars.add(c1);
      cars.add(c2);
      cars.add(t1);
      cars.add(t2);
      cars.add(t3);
      
      for (Automobile item : cars){
          item.accelerate();
          item.accelerate();
          item.accelerate();
          item.brake();
          
          System.out.println(item + " is traveling "+ item.getSpeed() + "MPH");
          }
      
      }
      
    
    
       
    }