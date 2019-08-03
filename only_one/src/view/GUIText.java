package view;

import java.awt.FlowLayout;
import java.util.List;

import javax.swing.JPanel;

import viewmodel.ViewModel;

@SuppressWarnings("serial")
public class GUIText extends JPanel {
	ViewModel vm;
	public GUIText(ViewModel vm)
	{
		this.vm = vm;
		this.setLayout(new FlowLayout(FlowLayout.LEADING, 5, 4));
	}
	
	public void addText(List<String> list)
	{
		System.out.println("TEST");
		int i = 0;
		for (String word : list) {
			add(new LabelIndex(vm, word, i));
			++i;
		}
	}

}
