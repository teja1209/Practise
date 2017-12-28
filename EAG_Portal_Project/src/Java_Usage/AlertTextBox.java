package Java_Usage;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AlertTextBox

{
public static void main(String args[])
{
	JFrame frame = new JFrame();
    String message = "message";
    String text = JOptionPane.showInputDialog(frame, message);
   if(text!=null)
   {
	 System.out.println(text);  
   }
   else if(text==null)
   {
	   
   }
    /*if (text == null) {
      // User clicked cancel
    }*/
}
}
