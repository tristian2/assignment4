    package com.triscorp.ScientificCalculator;

/**
 * Created with IntelliJ IDEA.
 * User: tristian2
 * Date: 03/02/2013
 * Time: 20:57
 * To change this template use File | Settings | File Templates.
 */
public class Cosine extends BaseGraph  {


    public String graph()
    {

        StringBuilder sb = new StringBuilder();

        for (double  i=0;i<2*Math.PI; i=i+0.1)
        {
            sb.append(aLine(Math.cos(i)));
        }

        return sb.toString();

    }
}
