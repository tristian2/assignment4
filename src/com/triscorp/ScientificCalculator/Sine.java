package com.triscorp.ScientificCalculator;

import sun.tools.tree.SuperExpression;

/**
 * Created with IntelliJ IDEA.
 * User: tristian2
 * Date: 03/02/2013
 * Time: 20:57
 * To change this template use File | Settings | File Templates.
 * produces a sine wave
 */
public class Sine extends BaseGraph {

    public Sine() {
        setGraphLabel("A sine wave");
    }

    public String graph() {

        StringBuilder sb = new StringBuilder();

        sb.append(getGraphLabel()+"\n");
        for (double i = 0; i < 2 * Math.PI; i = i + 0.1) {
            sb.append(aLine(Math.sin(i)));
        }

        return sb.toString();

    }


}
