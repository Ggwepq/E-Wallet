import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPanel extends JPanel{

        public JPanel balancePane = new JPanel();
        public JPanel btnsPane = new JPanel();
        public JPanel northPane = new JPanel();
        final String img = "assets\\img\\";

    
    public MainPanel(){
        this.setLayout(new FlowLayout());

        balancePane.setPreferredSize(new Dimension(500, 170));
        balancePane.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 0));

        btnsPane.setPreferredSize(new Dimension(800, 380));
        btnsPane.setLayout(new GridLayout(2, 3, 10, 10));

        northPane.setPreferredSize(new Dimension(850, 80));
        northPane.setLayout(new GridLayout(1,2,30, 10));

        this.add(northPane);
        this.add(balancePane);
        this.add(btnsPane);

        topPane();
        balance();
        btns();

    }

    public void topPane(){
        JPanel rleftPane = new JPanel();
        JPanel lleftPane = new JPanel();

        rleftPane.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10));

        lleftPane.setLayout(new FlowLayout(FlowLayout.LEFT));

        northPane.add(lleftPane);
        northPane.add(rleftPane);

        JButton notif = new JButton();
        JButton settings = new JButton();

        notif.setPreferredSize(new Dimension(60, 60));
        notif.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
        notif.setFocusable(false);
        settings.setPreferredSize(new Dimension(60, 60));
        settings.setLayout(new FlowLayout(FlowLayout.CENTER, 0,0));
        settings.setFocusable(false);

        rleftPane.add(notif);
        rleftPane.add(settings);

        // Button Images

        JLabel settingIcon = new JLabel(new ImageIcon(new ImageIcon(img+"gear.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));

        JLabel notifIcon = new JLabel(new ImageIcon(new ImageIcon(img+"bell.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));

        notif.add(notifIcon);
        settings.add(settingIcon);

    }

    public void balance(){
        JPanel curPane = new JPanel();
        JLabel balance = new JLabel();
        JLabel current = new JLabel();

        current.setText("Available Balance:");
        current.setBackground(Color.DARK_GRAY);
        current.setFont(new Font("Comfortaa", Font.PLAIN, 13));

        balance.setText("0.00");
        balance.setFont(new Font("Comfortaa", Font.BOLD, 100));

        curPane.setPreferredSize(new Dimension(500, 20));
        curPane.setLayout(new FlowLayout(FlowLayout.CENTER));

        curPane.add(current);
        balancePane.add(curPane);
        balancePane.add(balance);
    }

    public void btns(){
        // Panels
        JPanel withdrawPane = new JPanel();
        JPanel depMonPane = new JPanel();
        JPanel historyPane = new JPanel();
        JPanel fundsPane = new JPanel();
        JPanel loansPane = new JPanel();
        JPanel exitPane = new JPanel();

        withdrawPane.setLayout(new FlowLayout());
        depMonPane.setLayout(new FlowLayout());
        historyPane.setLayout(new FlowLayout());
        fundsPane.setLayout(new FlowLayout());
        loansPane.setLayout(new FlowLayout());
        exitPane.setLayout(new FlowLayout());

        // Add Panels to the Main Panel
        btnsPane.add(withdrawPane);
        btnsPane.add(depMonPane);
        btnsPane.add(fundsPane);
        btnsPane.add(loansPane);
        btnsPane.add(historyPane);
        btnsPane.add(exitPane);

        // Buttons
        JButton withdraw = new JButton();
        JButton deposit = new JButton();
        JButton funds = new JButton();
        JButton loans = new JButton();
        JButton history = new JButton();
        JButton exit = new JButton();

        // default width and height of the buttons
        int wid = 240;
        int hei = 150;

        withdraw.setPreferredSize(new Dimension(wid, hei));
        deposit.setPreferredSize(new Dimension(wid, hei));
        funds.setPreferredSize(new Dimension(wid, hei));
        loans.setPreferredSize(new Dimension(wid, hei));
        history.setPreferredSize(new Dimension(wid, hei));
        exit.setPreferredSize(new Dimension(wid, hei));

        withdraw.setLayout(new FlowLayout(FlowLayout.CENTER, 0,0));
        deposit.setLayout(new FlowLayout(FlowLayout.CENTER, 0,0));
        funds.setLayout(new FlowLayout(FlowLayout.CENTER, 0,0));
        loans.setLayout(new FlowLayout(FlowLayout.CENTER, 0,0));
        history.setLayout(new FlowLayout(FlowLayout.CENTER, 0,0));
        exit.setLayout(new FlowLayout(FlowLayout.CENTER, 0,0));

        withdraw.setFocusable(false);
        deposit.setFocusable(false);
        funds.setFocusable(false);
        loans.setFocusable(false);
        history.setFocusable(false);
        exit.setFocusable(false);

        // Add Buttons to the Panel
        withdrawPane.add(withdraw);
        depMonPane.add(deposit);
        fundsPane.add(funds);
        loansPane.add(loans);
        historyPane.add(history);
        exitPane.add(exit);

        // Buttons Label

        JLabel withdrawLabel = new JLabel("Withdraw Money");
        JLabel depLabel = new JLabel("Deposit Money");
        JLabel fundsLabel = new JLabel("Send Money");
        JLabel loansLabel = new JLabel("Manage Loans");
        JLabel historyLabel = new JLabel("Transaction History");
        JLabel exitLabel = new JLabel("Exit");
        
        // fonts
        withdrawLabel.setFont(new Font("Comfortaa", Font.PLAIN,18));
        depLabel.setFont(new Font("Comfortaa", Font.PLAIN,18));
        fundsLabel.setFont(new Font("Comfortaa", Font.PLAIN, 18));
        loansLabel.setFont(new Font("Comfortaa", Font.PLAIN,18));
        historyLabel.setFont(new Font("Comfortaa", Font.PLAIN,18));
        exitLabel.setFont(new Font("Comfortaa", Font.PLAIN,18));

        // Add buttons to their respective panels
        withdrawPane.add(withdrawLabel);
        depMonPane.add(depLabel);
        fundsPane.add(fundsLabel);
        loansPane.add(loansLabel);
        historyPane.add(historyLabel);
        exitPane.add(exitLabel);

        // Images
        int w = 140, h = 140;

        ImageIcon withdrawImg = new ImageIcon(new ImageIcon(img+"cash-withdrawal.png").getImage().getScaledInstance(w,h, Image.SCALE_DEFAULT));
        ImageIcon depositImg = new ImageIcon(new ImageIcon(img+"arrow.png").getImage().getScaledInstance(w,h, Image.SCALE_DEFAULT));
        ImageIcon sendImg = new ImageIcon(new ImageIcon(img+"transfer.png").getImage().getScaledInstance(w, h, Image.SCALE_DEFAULT));
        ImageIcon loanImg = new ImageIcon(new ImageIcon(img+"loan.png").getImage().getScaledInstance(w, h, Image.SCALE_DEFAULT));
        ImageIcon histImg = new ImageIcon(new ImageIcon(img+"time-management.png").getImage().getScaledInstance(w, h, Image.SCALE_DEFAULT));
        JLabel exitIcon = new JLabel(new ImageIcon(new ImageIcon(img+"cancel.png").getImage().getScaledInstance(w,h, Image.SCALE_DEFAULT)));

        JLabel wthIcon = new JLabel(withdrawImg);
        JLabel depIcon = new JLabel(depositImg);
        JLabel transferImg = new JLabel(sendImg);
        JLabel loanIcon = new JLabel(loanImg);
        JLabel histIcon = new JLabel(histImg);

        withdraw.add(wthIcon);
        deposit.add(depIcon);
        funds.add(transferImg);
        loans.add(loanIcon);
        history.add(histIcon);
        exit.add(exitIcon);

        // Events

        exit.addActionListener(e -> exitEvent());

    }

    public void exitEvent(){
        ATM.exit(); 
    }

}
