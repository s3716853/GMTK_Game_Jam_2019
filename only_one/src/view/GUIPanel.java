package view;

import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextPane;

@SuppressWarnings("serial")
public class GUIPanel extends JPanel {

	JTextPane graphics = new JTextPane();
	
	public GUIPanel() {
		add(graphics);
		graphics.setEditable(false);
		graphics.setFont(new Font("Monospaced", Font.BOLD, 14));
	}
	
	public void changeText(String text) {
		graphics.setText(text);
	}
}
