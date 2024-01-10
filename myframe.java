import java.awt.event.*;

import javax.swing.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.*;



public class myframe extends JFrame implements ActionListener {
JButton button1;
JButton button2;
JButton button3;
JButton button4;
JButton button5;
JButton button6;
JButton button7;
JButton button8;
JButton button9;
int count = 0;
ImageIcon o = new ImageIcon("src/o.png");
ImageIcon x = new ImageIcon("src/x.png");






    myframe(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();

        button1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        button2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        button3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        button4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        button5.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        button6.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        button7.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        button8.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        button9.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);


        button1.setBounds(0, 0,300,300);
        button2.setBounds(300,0,300,300);
        button3.setBounds(600,0,300,300);
        button4.setBounds(0,300,300,300);
        button5.setBounds(300,300,300,300);
        button6.setBounds(600,300,300,300);
        button7.setBounds(0,600,300,300);
        button8.setBounds(300,600,300,300);
        button9.setBounds(600,600,300,300);
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(button5);
        this.add(button6);
        this.add(button7);
        this.add(button8);
        this.add(button9);


        this.setSize(new Dimension(900,900));
        this.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        if(e.getSource() == button1){
            if (count%2==1){
                button1.setIcon(x);
            }
            else {
                button1.setIcon(o);    
            }
            //button1.setEnabled(false);      
            }      
         else if(e.getSource() == button2){
            if (count%2==1){
                button2.setIcon(x);       
            }
            else {
                button2.setIcon(o);
            }
            //button2.setEnabled(false); 
            //button2.setDisabledIcon(x);
        }
        else if(e.getSource() == button3){
            if (count%2==1){
                button3.setIcon(x);
            }
            else {
                button3.setIcon(o);    
            }
            //button3.setEnabled(false);  
        }
        else if(e.getSource() == button4){
            if (count%2==1){
                button4.setIcon(x);
            }
            else {
                button4.setIcon(o);    
            }
            //button4.setEnabled(false);  
        }
        else if(e.getSource() == button5){
            if (count%2==1){
                button5.setIcon(x);
            }
            else {
                button5.setIcon(o);    
            }
            //button5.setEnabled(false);  
        }
        else if(e.getSource() == button6){
            if (count%2==1){
                button6.setIcon(x);
            }
            else {
                button6.setIcon(o);    
            }
            //button6.setEnabled(false);  
        }
        else if(e.getSource() == button7){
            if (count%2==1){
                button7.setIcon(x);
            }
            else {
                button7.setIcon(o);    
            }
            //button7.setEnabled(false);  
        }
        else if(e.getSource() == button8){
            if (count%2==1){
                button8.setIcon(x);
            }
            else {
                button8.setIcon(o);    
            }
            //button8.setEnabled(false);  
        }
        else if(e.getSource() == button9){
            if (count%2==1){
                button9.setIcon(x);
            }
            else {
                button9.setIcon(o);    
            }
            //button9.setEnabled(false);  
        }
        
    }
}