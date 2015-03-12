/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author Pandoras_Box
 */
public class StaticCarTestDriver {

    public static void main(String[] args) {

        StaticCar c1 = new StaticCar();
        StaticCar c2 = new StaticCar();

        StaticCar.moveUp(c1);
        StaticCar.moveUp(c1);
        StaticCar.moveRight(c1);

        StaticCar.moveDown(c2);
        StaticCar.moveLeft(c2);
        StaticCar.moveLeft(c2);

        StaticCar.printLocation(c1);
        StaticCar.printLocation(c2);

    }

}


