package Modulo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Registrazione extends JFrame implements ActionListener{
	
	JTextArea Nome=new JTextArea();
    JTextArea Cognome= new JTextArea();
    JTextArea Indirizzo= new JTextArea();
    JButton Registra=new JButton("Registra");
    JButton Stampa=new JButton("Stampa");
    JLabel n=new JLabel("nome: ");
    JLabel cognome=new JLabel("cognome: ");
    JLabel i=new JLabel("indirizzo: ");
    JTextArea risultato= new JTextArea();
    JLabel ris=new JLabel("persona: ");
    ArrayList a= new ArrayList ();
		public Registrazione() {
			
				super("Calcolo Area Rettangolo");
		        Container c = this.getContentPane();
		        c.setLayout(new FlowLayout());
		        c.add(n);
		        c.add(Nome);
		        Nome.setPreferredSize(new Dimension(150,15));
		        c.add(cognome);
		        c.add(Cognome);
		        Cognome.setPreferredSize(new Dimension(150,15));
		        c.add(i);
		        c.add(Indirizzo);
		        Indirizzo.setPreferredSize(new Dimension(150,15));
		        c.add(Registra);
		        Registra.addActionListener(e -> reg());
		        setSize(400, 400);
		        c.add(Stampa);
		        Stampa.addActionListener(e -> Stampa());
		        setVisible(true);
		        this.a=a;
			}
			
		

		public void reg() 
		{
			a.add(Nome.getText());
			a.add(Cognome.getText());
			a.add(Indirizzo.getText());
		}
		public void Stampa() 
		{
			for(int i=0; i<a.size(); i++) 
			{
				if(i%3==0)
				{
					System.out.println(" ");
				}
				System.out.println(a.get(i));
			}
		}
		
		

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==Registra){
	            reg();
			}
	            
	        if(e.getSource()==Stampa){
	            Stampa();
		}
	}
}
	
	
