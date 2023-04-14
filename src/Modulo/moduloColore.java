package Modulo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class moduloColore extends JFrame implements ActionListener {
	
	JButton rosso = new JButton ("ROSSO");
	
	JButton verde = new JButton ("VERDE");
	
	JButton blu = new JButton ("BLU");
	
	public moduloColore() {
		Container c = this.getContentPane();
		c.setLayout((new FlowLayout()));
		
		c.add(rosso);
		rosso.addActionListener(e -> red());
		
		c.add(verde);
		verde.addActionListener(e -> green());
		
		c.add(blu);
		blu.addActionListener(e -> blue());
		
		setSize(400,200);
		setVisible(true);
		setResizable(false);
				
	}

	private void red() { getContentPane().setBackground(Color.red);}

	
	private void green() { getContentPane().setBackground(Color.green);}


	private void blue() { getContentPane().setBackground(Color.blue);}



	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==rosso) {
			red();
		}
		if(e.getSource()==verde) {
			green();
		}
		if(e.getSource()==blu) {
			blue();
		}
		
		
	}
	
	

}
