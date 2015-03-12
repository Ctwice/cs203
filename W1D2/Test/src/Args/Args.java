/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Args;

/**
 *
 * @author Pandoras_Box
 */
public class Args {
    public static void main(String[] args) {
        System.out.println(args[0]);
        
        for (String s : args) {
            System.out.println(s);
        }
        
    }
}
