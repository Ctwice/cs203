package connection;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pandoras_Box
 */
public class GUI {

    JButton button;
    JLabel llat;
    JLabel llong;
    JLabel lrad;

    JTextArea area;
    JTextField field;
    JTextField field2;
    JTextField field3;
    
    

    public static void main(String[] args) {
        GUI gui = new GUI();

        gui.go();
    }

    public void go() {
        
        

        JFrame frame = new JFrame();
        frame.setSize(1100, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField field = new JTextField();
        field.setPreferredSize(new Dimension(200,20));
        JTextField field1 = new JTextField();
        field1.setPreferredSize(new Dimension(200,20));
        JTextField field2 = new JTextField();
        field2.setPreferredSize(new Dimension(200,20));

        
        area = new JTextArea();
        
        

        button = new JButton("Get Users");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double lat = Double.parseDouble(field.getText());
                double lng = Double.parseDouble(field1.getText());
                double rad = Double.parseDouble(field2.getText());

                String q = String.format("/search?q=geocode%%3A%f%%2C%f%%2C%fkm", lat, lng, rad);

                String https_url = "https://twitter.com" + q;
                URL url;
                try {

                    url = new URL(https_url);
                    HttpsURLConnection con = (HttpsURLConnection) url.openConnection();


                    BufferedReader br
                            = new BufferedReader(
                                    new InputStreamReader(con.getInputStream()));

                    String input;

                    Pattern p = Pattern.compile(".*data-screen-name=\"(.*?)\".*");
                    while ((input = br.readLine()) != null) {
                        Matcher matcher = p.matcher(input);
                        if (matcher.matches()) {

                            area.append(matcher.group(1) + "\n");
                        }
                        //System.out.println(input);
                    }
                    br.close();
                } catch (MalformedURLException ex) {
                    ex.printStackTrace();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        
        JScrollPane scrollPane = new JScrollPane(area);
//        JPanel panel3 = new JPanel();
//        JPanel panel4 = new JPanel();
        
        panel.add(button);

        llat = new JLabel("Latitude: ");
        llong = new JLabel("Longitude: ");
        lrad = new JLabel("Radius: ");
        

        panel2.add(llat);
        panel2.add(field);
        panel2.add(scrollPane);
        

        panel2.add(llong);
        panel2.add(field1);

        panel2.add(lrad);
        panel2.add(field2);

        //field = new JTextField("lat");
        
        frame.getContentPane().add(BorderLayout.CENTER, area);
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, panel2);
//        frame.getContentPane().add(panel3)
//         frame.getContentPane().add(panel4);
       
         frame.setVisible(true);
    }
    
    
}
