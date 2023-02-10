import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ATMFrame extends JFrame{
    
    public ATMFrame(){
        this.setTitle("Main Menu");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1050, 700);
        this.setResizable(false);
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(rootPane);

        JPanel north = new JPanel();
        JPanel east = new JPanel();
        JPanel west = new JPanel();
        JPanel south = new JPanel();

        north.setPreferredSize(new Dimension(100, 80));
        north.setLayout(new FlowLayout());
        north.setBackground(Color.DARK_GRAY);

        this.add(new MainPanel(),BorderLayout.CENTER);
        this.add(east, BorderLayout.EAST);
        this.add(west, BorderLayout.WEST);
        this.add(south, BorderLayout.SOUTH);

        ImageIcon icon = new ImageIcon("assets\\img\\money.ico");
        this.setIconImage(icon.getImage());

    }

    public void exit(){
        this.dispose();
    }

    public static void main(String[] args){
        new ATMFrame();
    }
    
}
