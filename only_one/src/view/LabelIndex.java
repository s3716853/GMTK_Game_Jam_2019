package view;

import java.awt.Font;

import javax.swing.JLabel;

import controller.WordListener;

@SuppressWarnings("serial")
public class LabelIndex extends JLabel {

	int index;
	
	public LabelIndex(String text, int index) {
		setText(text);
		this.setFont(new Font("SansSerif", Font.BOLD, 18));
		this.index = index;
		this.addMouseListener(new WordListener(this));
	}
}
