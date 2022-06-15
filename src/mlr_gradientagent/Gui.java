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
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Gui extends JFrame {
	private AgentMLR myAgent;

	private JTextField slr_x;
        private JTextField mlr_x1;
        private JTextField mlr_x2;

	Gui(AgentMLR a) {
		super(a.getLocalName());
		
		myAgent = a;
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(15, 2));
		p.add(new JLabel("GRADIENTE DECENDIENTE (SLR)"));
                p.add(new JLabel("Valor de X"));
		slr_x = new JTextField(15);
		p.add(slr_x);
                
                p.add(new JLabel("Valor de x1"));
		mlr_x1 = new JTextField(15);
		p.add(mlr_x1);
                p.add(new JLabel("Valor de x2"));
		mlr_x2 = new JTextField(15);
		p.add(mlr_x2);
                
                

		getContentPane().add(p, BorderLayout.CENTER);
		
                //button 1
		JButton addButton = new JButton("Calcular SLR");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				try {
					myAgent.getInputData(slr_x.getText().trim());
				}
				catch (Exception e) {
					JOptionPane.showMessageDialog(Gui.this, "Invalid value. "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		} );
		p = new JPanel();
		p.add(addButton);
                
               
                //button 2
                JButton addButton2 = new JButton("Calcular MLR");
		addButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				try {
					myAgent.getInputData2(mlr_x1.getText().trim(), mlr_x2.getText().trim());
				}
				catch (Exception e) {
					JOptionPane.showMessageDialog(Gui.this, "Invalid value. "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		} );

		p.add(addButton2);
                     
                
		getContentPane().add(p, BorderLayout.SOUTH);
		
		// Make the agent terminate when the user closes 
		// the GUI using the button on the upper right corner	
		addWindowListener(new	WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				myAgent.doDelete();
			}
		} );
		
		setResizable(false);
	}
	
	public void showGui() {
		pack();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int centerX = (int)screenSize.getWidth() / 2;
		int centerY = (int)screenSize.getHeight() / 2;
		setLocation(centerX - getWidth() / 2, centerY - getHeight() / 2);
		super.setVisible(true);
	}	
}
