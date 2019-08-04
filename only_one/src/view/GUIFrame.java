package view;

import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

import model.GameEngine;
import model.Word;
import viewmodel.ViewModel;

@SuppressWarnings("serial")
public class GUIFrame extends JFrame {

	GUIPanel graphics;
	GUIText text;
	ViewModel vm;
	
	public GUIFrame(GameEngine engine, ViewModel vm) {
		this.vm = vm;
		this.setTitle("Hat-Man Chronicles");
		vm.setGui(this);
		setBounds(100, 100, 800, 600);
		setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
		graphics = new GUIPanel();
		text = new GUIText(vm);
		add(graphics);
		add(text);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		vm.newScene();
	}
	
	public void newScene(String visuals, List<Word> list) {
		System.out.println(visuals);
		System.out.println(list);
		text.addText(list);
		graphics.changeText(visuals);
		revalidate();
	}
}
