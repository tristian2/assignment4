package com.triscorp.ScientificCalculator;

/**
 * Created with IntelliJ IDEA.
 * User: tristian2
 * Date: 19/01/2013
 * Time: 17:29
 * To change this template use File | Settings | File Templates.
 */
public class Entry {


    public static void main(String[] args) {
        System.out.println("Hello Application starting!"); // Display the string.

        Sine sine = new Sine();
        System.out.println(sine.graph());

        Cosine cosine = new Cosine();
        System.out.println(cosine.graph());

        Tan tan = new Tan();
        System.out.println(tan.graph());


    }




}

