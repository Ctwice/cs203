/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW;

/**
 *
 * @author Pandoras_Box
 */
public class MyExceptionTest 

    throws MyException {
    
    public static void main(String[] args) {

       

    public static void doThingA() {
        doThingB();
    }

    public static void doThingB() {
        doThingC();
    }

    public static void doThingC() {
        doThingD();
    }

    public static void doThingD() throws MyException {
        throw new MyException (“a message”);}
       
       }
    
    }
