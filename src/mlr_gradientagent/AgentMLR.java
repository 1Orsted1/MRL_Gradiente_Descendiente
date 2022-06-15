/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mlr_gradientagent;
import jade.core.behaviours.OneShotBehaviour;
import jade.core.Agent;

/**
 *
 * @author ftm
 */
public class AgentMLR extends Agent{
    protected void setup() {
       
        System.out.println(" __  ___       __  ___         __           __   ___      ___ \n"
                + "/__`  |   /\\  |__)  |  | |\\ | / _`     /\\  / _` |__  |\\ |  |  \n"
                + ".__/  |  /~~\\ |  \\  |  | | \\| \\__>    /~~\\ \\__> |___ | \\|  |  \n"
                + "                                                              ");
        
        // Create and show the GUI
        Gui myGui = new Gui(this);
        myGui.showGui();
        
    }

    public void getInputData(final String x) {
        addBehaviour(new OneShotBehaviour() {
            public void action() {
                DataSet data = new DataSet();
                GradientMath GSLR = new GradientMath(data.getX(), data.getY());
                System.out.println("y = "+GSLR.getB0()+" + "+GSLR.getB1()+"X");
                System.out.print("y:");
                System.out.print(GSLR.getB0()+GSLR.getB1()*Double.parseDouble(x) + "\n");
                //myAgent.doDelete();
            }
        });

    }
    
    
        public void getInputData2(final String x1, final String x2) {
        addBehaviour(new OneShotBehaviour() {
            public void action() {
                DataSetMultiple data = new DataSetMultiple();
                GradientMathMultiple GMSLR = new GradientMathMultiple(data.getX1(), data.getX2(), data.getY());
                System.out.println("y = "+GMSLR.getB0()+" + "+GMSLR.getB1()+"(X1 ="+x1+") + " + GMSLR.getB2()+"(X2 ="+x2+" )");
                System.out.print("y:");
                System.out.print(GMSLR.getB0()+GMSLR.getB1()*Double.parseDouble(x1)+GMSLR.getB2()*Double.parseDouble(x2));
                //myAgent.doDelete();
            }
        });

    }
}
