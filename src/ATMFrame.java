import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;

public class ATMFrame extends JFrame{
    
    public ATMFrame(){
        this.setTitle("Home Page");
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

    }


    
    public static void main(String[] args){

        FlatLightLaf.setup(new FlatMacDarkLaf());

        new ATMFrame().setVisible(true);
    }
    
}
