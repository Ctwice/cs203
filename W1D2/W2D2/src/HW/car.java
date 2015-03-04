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
public class car extends Automobile {

    private boolean convertible;
    private int trunkCapacity;

    @Override
    public int accelerate() {
        this.speed = this.speed + 12;
        return this.speed;

    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public int getTrunkCapacity() {
        return trunkCapacity;
    }

    public void setTrunkCapacity(int trunkCapacity) {
        this.trunkCapacity = trunkCapacity;
    }
    
    public String toString() {
        return super.toString() + " is a car";
    }

}
