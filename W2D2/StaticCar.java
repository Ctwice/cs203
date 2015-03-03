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
public class StaticCar {

    private int x = 0;
    private int y = 0;

    public static void moveUp(StaticCar This) {
        This.y += 1;
    }

    public static void moveDown(StaticCar This) {
        This.y -= 1;
    }

    public static void moveRight(StaticCar This) {
        This.x += 1;
    }

    public static void moveLeft(StaticCar This) {
        This.x -= 1;
    }

    public static void printLocation(StaticCar This) {
        System.out.println(StaticCar.printLocation() + "I'm at location " + This.x + " " + This.y);
    }
}
