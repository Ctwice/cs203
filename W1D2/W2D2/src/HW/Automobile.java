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
public class Automobile {

    private String make;
    private String model;
    private int year;
    private String color;
    protected int speed;

    public void move() {
        System.out.println("Vroom Vroom");

    }

    public int accelerate() {
        this.speed = this.speed + 10;
        return this.speed;
    }

    public int brake() {
        this.speed = this.speed - 10;
        if (this.speed < 0) {
            this.speed = 0;
        }

        return speed;
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

    public String toString() {
        return make;
    }
}
