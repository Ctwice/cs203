/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author Pandoras_Box
 */
public class Array {

    import Math.random;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] nums = new int[100];

        for (int i = 0; i < nums.length; i++) {

            nums[i] = nums[Math.random()*100];

            int sum = 0;
            int ave;
            for (int e = 0; e < nums.length; i++) {

                sum = sum + nums[e];
                ave = sum / 100;
                System.out.println("The average of the list is " + ave);

                for (int w = 0; w < nums.length; i++) {
                    if (nums[w] == ave) {
                        System.out.println(nums.indexof(w));

                    }
                }
            }

        }
    }

}

}
