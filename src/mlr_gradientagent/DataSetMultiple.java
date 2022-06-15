/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mlr_gradientagent;

/**
 *
 * @author ftm
 */
public class DataSetMultiple {

//    private double[][] dataSet = new double[][]{
//        {41.9, 29.1, 251.3},
//        {43.4, 29.3, 251.3},
//        {43.9, 29.5, 248.3},
//        {44.5, 29.7, 267.5},
//        {47.3, 29.9, 273},
//        {47.5, 30.3, 276.5},
//        {47.9, 30.5, 270.3},
//        {50.2, 30.7, 274.9},
//        {52.8, 30.8, 285},
//        {53.2, 30.9, 290},
//        {56.7, 31.5, 297},
//        {57, 31.7, 302.5},
//        {63.5, 31.9, 304.5},
//        {65.3, 32, 309.3},
//        {71.1, 32.1, 321.7},
//        {77, 32.5, 330.7},
//        {77.8, 32.9, 349}
//    };
    private double[] x1 = {41.9, 43.4, 43.9, 44.5, 47.3, 47.5, 47.9, 50.2, 52.8, 53.2, 56.7, 57, 63.5, 65.3, 71.1, 77, 77.8};
    private double[] x2 = {29.1, 29.3, 29.5, 29.7, 29.9, 30.3, 30.5, 30.7, 30.8, 30.9, 31.5, 31.7, 31.9, 32, 32.1, 32.5, 32.9};
    private double[] y = {251.3, 251.3, 248.3, 267.5, 273, 276.5, 270.3, 274.9, 285, 290, 297, 302.5, 304.5, 309.3, 321.7, 330.7, 349};

    public double[] getX1() {
        return x1;
    }

    public double[] getX2() {
        return x2;
    }

    public double[] getY() {
        return y;
    }

}
