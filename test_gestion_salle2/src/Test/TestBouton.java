package Test;

import javax.swing.*;

import java.awt.event.*;

public class TestBouton extends JFrame
{
  private JButton btn1M, btn1A, btn2M, btn2A, btn3M, btn3A, btn4M, btn4A, btn5M, btn5A; //ou faire un arraylist
  private JLabel label;
  
  public static void main(String[] args) {
    new TestBouton();
    new MyCustomButton("valider");
  }

  public TestBouton()
  {
    this.setSize(350,300);
 
        
    Clicklistener click = new Clicklistener();
    getRootPane().setLayout(null);
    
    JPanel panel = new JPanel();
    panel.setBounds(231, 6, 721, 356);
    getRootPane().add(panel);
    panel.setLayout(null);
    
    label = new JLabel();
    label.setBounds(100, 281, 370, 29);
    panel.add(label);
        btn2A = new JButton ("Salle 2, après-midi");
        btn2A.setBounds(302, 87, 168, 29);
        panel.add(btn2A);
        
  //SALLE 3
        btn3M = new JButton ("Salle 3, matin");
        btn3M.setBounds(135, 133, 129, 29);
        panel.add(btn3M);
        btn3A = new JButton ("Salle 3, après-midi");
        btn3A.setBounds(307, 133, 163, 29);
        panel.add(btn3A);
        
  //SALLE 4
        btn4M = new JButton ("Salle 4, matin");
        btn4M.setBounds(135, 174, 129, 29);
        panel.add(btn4M);
        btn4A = new JButton ("Salle 4, après-midi");
        btn4A.setBounds(307, 174, 163, 29);
        panel.add(btn4A);
        
  //SALLE 5
        btn5M = new JButton ("Salle 5, matin");
        btn5M.setBounds(135, 215, 129, 29);
        panel.add(btn5M);
        
        //SALLE 1
        btn1M = new JButton ("Salle 1, matin");
        btn1M.setBounds(135, 46, 129, 29);
        panel.add(btn1M);
        btn1A = new JButton ("Salle 1, après-midi");
        btn1A.setBounds(307, 46, 163, 29);
        panel.add(btn1A);
        
            //SALLE 2
            btn2M = new JButton ("Salle 2, matin");
            btn2M.setBounds(135, 87, 129, 29);
            panel.add(btn2M);
            btn5A = new JButton ("Salle 5, après-midi");
            btn5A.setBounds(307, 215, 163, 29);
            panel.add(btn5A);
            btn5A.addActionListener(click);
            btn2M.addActionListener(click);
            btn1A.addActionListener(click);
            btn1M.addActionListener(click);
            btn5M.addActionListener(click);
            btn4A.addActionListener(click);
            btn4M.addActionListener(click);
            btn3A.addActionListener(click);
            btn3M.addActionListener(click);
        btn2A.addActionListener(click);
    this.setVisible(true);
  }
    
  private class Clicklistener implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
    	
      if (e.getSource() == btn1M)
      {
        label.setText("Réservation Salle 1 matin confirmée");
      }
      
      if (e.getSource() == btn1A)
      {
        label.setText("Réservation Salle 1 après-midi confirmée");
      }
      
      if (e.getSource() == btn2M)
      {
        label.setText("Réservation Salle 2 matin confirmée");
      }
      
      if (e.getSource() == btn2A)
      {
        label.setText("Réservation Salle 2 après-midi confirmée");
      }
      
      if (e.getSource() == btn3M)
      {
        label.setText("Réservation Salle 3 matin confirmée");
      }
      
      if (e.getSource() == btn3A)
      {
        label.setText("Réservation Salle 3 après-midi confirmée");
      }
      
      if (e.getSource() == btn4M)
      {
        label.setText("Réservation Salle 4 matin confirmée");
      }
      
      if (e.getSource() == btn4A)
      {
        label.setText("Réservation Salle 4 après-midi confirmée");
      }
      
      if (e.getSource() == btn5M)
      {
        label.setText("Réservation Salle 5 matin confirmée");
      }
      
      if (e.getSource() == btn5A)
      {
        label.setText("Réservation Salle 5 après-midi confirmée");
      }
    }
  }
  
}