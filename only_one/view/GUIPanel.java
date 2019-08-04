package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextPane;

@SuppressWarnings("serial")
public class GUIPanel extends JPanel {

	JTextPane graphics = new JTextPane();
	
	public GUIPanel() {
		graphics.setEditable(false);
		graphics.setFont(new Font("Monospaced", Font.BOLD, 14));
		setBackground(Color.WHITE);
		add(graphics);
	}
	
	public void changeText(String text) {
		graphics.setText(text);
	}
}
