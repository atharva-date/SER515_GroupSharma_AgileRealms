package Player;
import java.awt.EventQueue;

//Launch the application.

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run(){
				try {
					NewUser frame = new NewUser();
					frame.setTitle("New User Registration");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
}
