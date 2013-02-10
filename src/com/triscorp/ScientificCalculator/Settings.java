package com.triscorp.ScientificCalculator;

/**
 * Created with IntelliJ IDEA.
 * User: tristian2
 * Date: 10/02/2013
 * Time: 14:14
 * To change this template use File | Settings | File Templates.
 * settings class - move this to a Java preferences
 */
public class Settings {

    private static int amplitudeFactor = 10;
    private static int consoleWidth = 40;
    protected static int amplitude = consoleWidth * ( amplitudeFactor / 10);

    public static void setAmplitudeFactor(int factor)
    {
        Settings.amplitudeFactor = factor;
    }


}