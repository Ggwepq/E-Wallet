import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;

public class ATM{
    
    public static ATMFrame atm;
    public static MainPanel mp;

    public static void exit(){
        atm.exit(); 
    }

    public static void main(String[] args){
        FlatLaf.setup(new FlatMacLightLaf());

        atm = new ATMFrame();
        mp = new MainPanel();
        atm.setVisible(true);
    }

}