/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;

/**
 *
 * @author Pandoras_Box
 */
public class Local {
    
    
    String city;
    String state;
    int radi;
    
    String w = String.format("/maps/place/%f%,%f%", city, state);
    
    String https_url = "https://www.google.com" + w;
    
    URL url;
                try {

                    url = new URL(https_url);
                    HttpsURLConnection con = (HttpsURLConnection) url.openConnection();


                    BufferedReader br
                            = new BufferedReader(
                                    new InputStreamReader(con.U));

    
    
    
    
}
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