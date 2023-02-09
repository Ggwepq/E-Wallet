import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ATMFrame extends JFrame{
    
    public ATMFrame(){
        this.setTitle("Home Page");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1050, 700);
        this.setResizable(false);
        this.setLayout(new BorderLayout(0,10));

        JPanel north = new JPanel();
        JPanel east = new JPanel();
        JPanel west = new JPanel();
        JPanel south = new JPanel();
        JPanel center = new JPanel();

        north.setBackground(Color.CYAN);
        east.setBackground(Color.CYAN);
        west.setBackground(Color.CYAN);
        south.setBackground(Color.CYAN);
        center.setBackground(Color.GREEN);

        this.add(center, BorderLayout.CENTER);
        this.add(north, BorderLayout.NORTH);
        this.add(east, BorderLayout.EAST);
        this.add(west, BorderLayout.WEST);
        this.add(south, BorderLayout.SOUTH);

    }
    
    public static void main(String[] args){
        new ATMFrame().setVisible(true);
    }
    
}
