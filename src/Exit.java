public class Exit {
    final static ATMFrame atm = new ATMFrame();

    public static void exit(){
        atm.setVisible(false);
        atm.dispose();
    }

    public static void main(String[] args) {
    }
    
}
