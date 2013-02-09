package com.triscorp.ScientificCalculator;

/**
 * Created with IntelliJ IDEA.
 * User: tristian2
 * Date: 03/02/2013
 * Time: 21:21
 * To change this template use File | Settings | File Templates.
 */
abstract class BaseGraph implements Graph {


    protected int consoleWidth = 40;
    protected String GraphBody;

    public String GraphBody(double ratio) {
        return null;
    }

    public String aLine(double ratio)
    {

        StringBuilder line = new StringBuilder();
        for (int i=0;i<consoleWidth+consoleWidth*ratio;i++) {
            line.append("*");
        }

        line.append("\n");
        return line.toString();
    }
}
