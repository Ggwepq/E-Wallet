import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Setup extends JFrame{

    public JPanel left = new JPanel(), logInPane = new JPanel();

    public Setup(){
        this.setTitle("Setup");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 700);
        this.setResizable(false);
        this.setLocationRelativeTo(rootPane);
        this.setLayout(new GridLayout(1,2));

        ImageIcon icon = new ImageIcon("assets\\img\\money.ico");
        this.setIconImage(icon.getImage());

        left.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 150)); 
        logInPane.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 50));

        logInPane.setBackground(new Color(0x1a1a1a));

        this.add(left);
        this.add(logInPane);

        leftPane();
        logInPanel();
   }

    // Left Side Panel (Images)
    public void leftPane(){
        JLabel icon = new JLabel(new ImageIcon(new ImageIcon("assets\\img\\Bank.png").getImage().getScaledInstance(450, 300 , Image.SCALE_DEFAULT)));

        left.add(icon);

    }

    public void logInPanel(){
        // General Panel
        JPanel account = new JPanel();
        
        account.setPreferredSize(new Dimension(450, 550));
        account.setLayout(new FlowLayout(FlowLayout.CENTER));
        account.setBackground(new Color(0x1a1a1a));

        logInPane.add(account);

        JPanel logIn = new JPanel();
        JPanel regIs = new JPanel();

        // Log In Panel
        logIn.setPreferredSize(new Dimension(400, 350));
        logIn.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 30));
        logIn.setBackground(new Color(0x1a1a1a));

        // Register Panel
        regIs.setPreferredSize(new Dimension(400, 180));
        regIs.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 20));
        regIs.setBackground(new Color(0x1a1a1a));
        regIs.setBorder(BorderFactory.createMatteBorder(3, 0,0,0, new Color(0x2a2a2a)));

        account.add(logIn);
        account.add(regIs);

        // Inside the LogIn Panel
        JTextField emailField = new JTextField();
        JPasswordField passField = new JPasswordField();
        JButton logInbtn = new JButton();
        JPanel fuckLayoutManager = new JPanel();
        
        emailField.setPreferredSize(new Dimension(350, 60));
        emailField.setFont(new Font("Arial", Font.PLAIN, 25));
        
        passField.setPreferredSize(new Dimension(350, 60));
        passField.setFont(new Font("Arial Black", Font.PLAIN, 25));

        fuckLayoutManager.setPreferredSize(new Dimension(400, 140));
        fuckLayoutManager.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 50));
        fuckLayoutManager.setBackground(logIn.getBackground());

        logIn.add(emailField);
        logIn.add(passField);
        logIn.add(fuckLayoutManager);

        logInbtn.setPreferredSize(new Dimension(350, 75));
        logInbtn.setText("Log In");
        logInbtn.setFont(new Font("Arial Black", Font.PLAIN, 25));
        logInbtn.setForeground(new Color(0xdde8fe));
        logInbtn.setBackground(new Color(0x6174c6));
        logInbtn.setFocusable(false);
        logInbtn.addActionListener(e -> logInButtonResponse(emailField, passField));

        fuckLayoutManager.add(logInbtn);

        // Inside the Register Panel
        JButton register = new JButton();
        register.setPreferredSize(new Dimension(350, 75));
        register.setText("Register");
        register.setFont(new Font("Arial Black", Font.PLAIN, 25));
        register.setForeground(new Color(0x565656));
        register.setBackground(new Color(0xdde8fe));
        register.setFocusable(false);
        
        // #565656
        // dddddd

        regIs.add(register);

    }

    public void logInButtonResponse(JTextField email, JPasswordField password){
        confirmAcc(email, password);
    }

    public void confirmAcc(JTextField email, JPasswordField password){
        String none = email.getText();
        char pwd[] = password.getPassword();
        
        if (!none.isBlank()){
            ATM.logConfirm();
        }

    }

    public static void main(String[] args){
        new Setup();
    }
}