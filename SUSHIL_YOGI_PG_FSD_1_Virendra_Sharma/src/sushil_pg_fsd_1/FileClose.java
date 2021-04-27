package sushil_pg_fsd_1;

import java.awt.event.*;
import javax.swing.*;

public class FileClose {

	public static void main(String[] a) {
	      JFrame f = new JFrame();
	      f.setTitle("Closing Frame with Window Listener");
	      f.setBounds(100,50,500,300);
	      f.addWindowListener(new MyWindowListener());
	      f.setVisible(true);
	   }
	   static class MyWindowListener extends WindowAdapter {
	      public void windowClosing(WindowEvent e) {
	         System.exit(1);
	      }
	   }

}
