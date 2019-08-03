package view;

import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.util.List;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GUIText extends JPanel {
	
	public GUIText()
	{
		this.setLayout(new FlowLayout(FlowLayout.LEADING, 5, 4));
	}
	
	public void addText(List<String> list)
	{
		int i = 0;
		for (String word : list) {
			add(new LabelIndex(word, i));
			++i;
		}
	}

}
