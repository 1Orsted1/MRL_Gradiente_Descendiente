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
public class GradientMathMultiple {

    private double[] x1;
    private double[] x2;

    private double[] y;
    private double B0 = 0;
    private double B1 = 0;
    private double B2 = 0;

    private double alpha = 0.0005;
    private double precision = 0.0001;
    private double learningRate = 0.0001;
    private int nVariables = 17;

    public GradientMathMultiple(double[] x1, double[] x2, double[] y) {
        this.x1 = x1;
        this.x2 = x2;
        this.y = y;
        calculate();

    }

    public void setX1(double[] x) {
        this.x1 = x;
        calculate();
    }
    
      public void setX2(double[] x) {
        this.x2 = x;
        calculate();
    }

    public void setY(double[] y) {
        this.y = y;
        calculate();
    }

    public double getB0() {
        return B0;
    }

    public double getB1() {
        return B1;
    }
    
     public double getB2() {
        return B2;
    }

    public double calculateError() {

        double E = 0;
        for (int i = 0; i < x1.length; i++) {
            E = E + (y[i] - (B0 + (B1 * x1[i]) + (B2 * x2[i])));
        }

        return (E * E) * 1.0 / nVariables;
    }

    public double calculateDB0() {

        double DB0 = 0;
        for (int i = 0; i < x1.length; i++) {
            DB0 += (y[i] - (B0 + B1 * x1[i]) + (B2 * x2[i]));
        }

        return (-2.0 / nVariables) * DB0;
    }

    public double calculateDB1() {

        double DB1 = 0;
        for (int i = 0; i < x1.length; i++) {
            DB1 += x1[i] * (y[i] - (B0 + B1 * x1[i] + B2 * x2[i]));
        }

        return (-2.0 / nVariables) * DB1;
    }
    
    public double calculateDB2() {

        double DB2 = 0;
        for (int i = 0; i < x1.length; i++) {
            DB2 += x2[i] * (y[i] - (B0 + B1 * x1[i] + B2 * x2[i]));
        }

        return (-2.0 / nVariables) * DB2;
    }

    public void calculate() {
        //int count = 0;
        while (calculateError() > precision) {
            B0 -= (calculateDB0() * alpha);

            B1 -= (calculateDB1() * alpha);
            
            B2 -= (calculateDB2() * alpha);
            //System.out.println(calculateError());
            //count++;
        }

        //System.out.println("Number of itertions:"+count+"\nPresision:"+precision+"\n :"+calculateError());
    }

}
