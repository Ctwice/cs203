/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3d2;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Pandoras_Box
 */
public class GUITest2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Awesome Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        
        JButton button = new JButton("I'm a button");
        
        frame.getContentPane().add(button);
        
        frame.setVisible(true);
    }
    
}
