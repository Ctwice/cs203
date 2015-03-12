/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import java.util.Calendar;

/**
 *
 * @author Pandoras_Box
 */
public class CalendarDriver {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(1991, 6, 3, 20, 59);

        String s = String.format("I was born: %tA %<tB %<td %<tY %<tc", c.getTime());                                                                                          
                            
                System.out.println(s);
    }
}
