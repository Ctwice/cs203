/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW;

import java.util.ArrayList;

/**
 *
 * @author Pandoras_Box
 */
public class garage {

    private Automobile a;
    private ArrayList items = new ArrayList<>();

    public void store(Automobile a) {
        this.a = a;

    }

    public Automobile retrieve() {
        return a;
    }

    public void store(item i) {
        items.add(i);

    }

    public item retrieve(int i) {
        return items.get(i);
    }

}
