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
public class Truck extends Automobile {

    private boolean hasTailGate;
    private int carryingCapacity;

    public Truck(String make, String model, int year, String color,
            int carryingCapacity, boolean hasTailGate) {

        super(make, model, year, color);
        this.carryingCapacity = carryingCapacity;
        this.hasTailGate = hasTailGate;
    }

    public Truck(String make, String model, int year, String color,
            int carryingCapacity) {

        super(make, model, year, color);
        this.carryingCapacity = carryingCapacity;
    }

    public Truck(String make, String model, int carryingCapacity) {
        super(make, model);
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public void accelerate() {
        speed += 7;
    }

    public boolean isHasTailGate() {
        return hasTailGate;
    }

    public void setHasTailGate(boolean hasTailGate) {
        this.hasTailGate = hasTailGate;
    }

    public int getCaryingCapacity() {
        return carryingCapacity;
    }

    public void setCaryingCapacity(int caryingCapacity) {
        this.carryingCapacity = caryingCapacity;
    }

}
