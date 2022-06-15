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
public class DataSet {

//    private double[][] data = {
//                {23, 651}, 
//                {26, 762},
//                {30, 856}, 
//                {34, 1063},
//                {43, 1190},
//                {48, 1298}, 
//                {52, 1421}, 
//                {57, 1440}, 
//                {58, 1518}
//            };
    
     
    private double[] x = {23, 26, 30, 34, 43, 48, 52, 57, 58};
    private double[] y = {651, 762, 856, 1063, 1190, 1298, 1421, 1440, 1518};

    public double[] getX() {
        return x;
    }

    public void setX(double[] x) {
        this.x = x;
    }

    public double[] getY() {
        return y;
    }

    public void setY(double[] y) {
        this.y = y;
    }
}
