package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.WordListener;
import model.Word;
import viewmodel.ViewModel;

@SuppressWarnings("serial")
public class GUIText extends JPanel {
	ViewModel vm;
	public GUIText(ViewModel vm)
	{
		this.vm = vm;
		setLayout(new FlowLayout(FlowLayout.LEADING, 5, 4));
		setBackground(Color.BLACK);
	}

	public void addText(List<Word> list)
	{
		/*
		 * Reset text field
		 */
		removeAll();
		
		for (Word word : list) {
			JLabel label = new JLabel();
			label.setText(word.getWord());
			label.setForeground(Color.WHITE);
			/*
			 * Add MouseListener to important words,
			 * and change their font for clarity
			 */
			if (word.isClickable()) {
				label.addMouseListener(new WordListener(vm, label, word.getIdentifier()));
				label.setFont(new Font("SansSerif", Font.ITALIC, 18));
			}
			else {
				label.setFont(new Font("SansSerif", Font.BOLD, 18));
			}
			add(label);
		}
	}

}
