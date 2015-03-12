/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW1;

/**
 *
 * @author Pandoras_Box
 */
public class Automobile {
    private String make;
    private String model;
    private int year;
    private String color;
    protected int speed;
    
    public Automobile(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public Automobile(String make, String model, String color) {
        this(make, model, 2015, color);
    }

    public Automobile(String make, String model) {
        this(make, model, 2015, "unknown");
    }    
    
    
    public void accelerate() {
        speed += 10;
    }
    
    public void brake() {
        speed -= 10;
        if (speed < 0) {
            speed = 0;
        }
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    
}