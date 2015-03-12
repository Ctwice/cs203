/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizz;

/**
 *
 * @author Pandoras_Box
 */
public class fizzbuzz {

   
    public static void main(String[] args) {
        String word1 = "fizz";
        String word2 = "buzz";
        String word3 = "fizzbuzz";

        for (int i = 1; i <= 100; ++i) {
            if (i % 3 == 0 & i % 5 ==0) {
                System.out.println(i + " " + word3);
            }
            else if (i % 5 == 0) {
                System.out.println(i + " " + word2);

            } else if (i % 3 == 0) {

                System.out.println(i + " " + word1);
            }
        }
    }
}
