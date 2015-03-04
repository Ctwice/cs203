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
public class truck extends Automobile {

    private int carryingCapactiy;
    private boolean hasTailGate;

    @Override
    public int accelerate() {
        this.speed = this.speed + 7;
        return this.speed;

    }

    public int getCarryingCapactiy() {
        return carryingCapactiy;
    }

    public void setCarryingCapactiy(int carryingCapactiy) {
        this.carryingCapactiy = carryingCapactiy;
    }

    public boolean getHasTailGate() {
        return hasTailGate;
    }

    public void setHasTailGate(boolean hasTailGate) {
        this.hasTailGate = hasTailGate;
    }

}
