package com.triscorp;

/**
 * Created with IntelliJ IDEA.
 * User: tristian2
 * Date: 19/01/2013
 * Time: 17:29
 * To change this template use File | Settings | File Templates.
 */
public class Entry {


    private static int consoleWidth = 40;

    public static void main(String[] args) {
        System.out.println("Hello Application starting!"); // Display the string.



        for (double  i=0;i<2*Math.PI; i=i+0.1)
        {
            System.out.println(aLine(Math.sin(i)));
        }
    }


    public static void sineCurve() {

    }


    public static String aLine(double ratio)
    {

        StringBuilder line = new StringBuilder();
        for (int i=0;i<consoleWidth*ratio;i++) {
            line.append("*");
        }
        return line.toString();
    }


}

