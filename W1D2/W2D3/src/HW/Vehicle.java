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
public abstract class Vehicle {
    private int x;
    private int y;
    protected int speed;
    private int direction;
    
    
    public abstract void move(int amount);
    public abstract void turn(int amount);
    public abstract void accelerate();
    public abstract void brake();
            
    
            
    
}
