import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class chlenix{
	public static void main(String args[]){
		kleee k = new kleee("Крестики-нолики");
		k.setVisible(true);
		k.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		k.setSize(325, 347);
		k.setResizable(false);
		k.setLocationRelativeTo(null);
	}
}
