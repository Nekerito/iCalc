package calculadora;
import javax.swing.UIManager;


public class ejecutable {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new CasiCalculadora();
		}
		catch (Exception e) {
		}
	}
}

