package view;

import java.awt.Font;

import javax.swing.JLabel;

import controller.WordListener;
import model.Word;
import viewmodel.ViewModel;

@SuppressWarnings("serial")
public class LabelIndex extends JLabel {

	int index;
	public LabelIndex(ViewModel vm, Word word, int index) {
		setText(word.getWord());
		this.setFont(new Font("SansSerif", Font.BOLD, 18));
		this.index = index;
		this.addMouseListener(new WordListener(vm, this, index));
	}
}
