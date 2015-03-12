/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W2D2;

/**
 *
 * @author Pandoras_Box
 */
public class StaticPerson {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public static void sayHello(StaticPerson This){
        System.out.println(name + " says Hello");
    }
    
}
