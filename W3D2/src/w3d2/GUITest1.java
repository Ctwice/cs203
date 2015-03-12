package w3d2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUITest1 {

    private JLabel label;
    private JButton hello;
    private JButton goodbye;
    private JFrame frame;

    public static void main(String[] args) {

        GUITest1 h = new GUITest1();

        h.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        hello = new JButton("Hello");
        frame.getContentPane().add(BorderLayout.NORTH, hello);
        hello.addActionListener(new HelloListener());

        goodbye = new JButton("Goodbye");
        frame.getContentPane().add(BorderLayout.SOUTH, goodbye);
        goodbye.addActionListener(new GoodbyeListener());

        label = new JLabel("Nothing Yet");
        frame.getContentPane().add(BorderLayout.CENTER, label);

        frame.setVisible(true);
    }

    private class HelloListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            hello.setText("Hello");
        }

    }

    private class GoodbyeListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            goodbye.setText("Goodbye");
        }

    }

    public class Hello_goodbye {

    }
}
