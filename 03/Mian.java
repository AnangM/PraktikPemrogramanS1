import javax.swing.JOptionPane;
import Division.class;

public class Mian {
  public static void main(String[] argv) throws Exception {

    String[] buttons = { "Yes", "Yes to all", "No", "Cancel" };
	
    int rc = JOptionPane.showOptionDialog(null, "Question ?", "Confirmation",
        JOptionPane.WARNING_MESSAGE, 0, null, buttons);
	System.out.println(Division.getDiv1());
    System.out.println(rc);

  }
}