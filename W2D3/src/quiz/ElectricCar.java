/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w2d3;

/**
 *
 * @author Pandoras_Box
 */
public class ElectricCar extends car {

    private int batteryPower;

    @Override
    public void accerate(int amount) {

        speed += amount;
        batteryPower -= amount;

    }

    public void brake(int amount) {
        if (speed < 0) {
            speed = 0;
        }
    }
    batteryPower += amount / 4.0
    
}
