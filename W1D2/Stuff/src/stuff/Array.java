/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stuff;

import java.util.ArrayList;

/**
 *
 * @author Pandoras_Box
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 100; i++) {

            nums.add((int) (Math.random() * 100));

            System.out.println(nums);

        }

        int sum = 0;
        int ave;

        for (int e = 0; e < nums.size(); e++) {

            sum = sum + nums.get(e);
//                for (int w = 0; w < nums.length; i++) {
//                    if (nums[w] == ave) {
//                        System.out.println(nums.contains());
//
//                    }
//                }

        }
        
        ave = sum / 100;
        System.out.println("The average of the list is " + ave);

        System.out.println(nums.contains(ave));

    }
}
