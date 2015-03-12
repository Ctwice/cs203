/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3d3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Buttons {

    public static void main(String[] args) {
        Buttons buttons = new Buttons();
        buttons.go();
    }

    public void go() {

        
        JPanel top = new JPanel();
        JPanel bottom = new JPanel();
        JFrame frame = new JFrame();

        JButton buttonA = new JButton(" A ");
        JButton buttonB = new JButton(" B ");
        JButton buttonC = new JButton(" C ");
        JButton buttonD = new JButton(" D ");

        

        top.add(buttonA);
        top.add(buttonB);
        bottom.add(buttonC);
        bottom.add(buttonD);

        buttonA.addActionListener(new ClickA());
        buttonB.addActionListener(new ClickB());
        buttonC.addActionListener(new ClickC());
        buttonD.addActionListener(new ClickD());

        frame.getContentPane().add(BorderLayout.NORTH, top);
        frame.getContentPane().add(BorderLayout.SOUTH, bottom);
        frame.setSize(350, 350);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private class ClickA implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println("Button A was pressed.");
        }

    }

    private class ClickB implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println("Button B was pressed.");
        }

    }

    private class ClickC implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println("Button C was pressed.");
        }

    }

    private class ClickD implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println("Button D was pressed.");
        }

    }
}