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
	//ViewModel vm;
	
	public GUIFrame(GameEngine engine, ViewModel vm) {
		//this.vm = vm;
		vm.setGui(this);
		
		/*
		 * Frame layout
		 */
		setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
		graphics = new GUIPanel();
		text = new GUIText(vm);
		add(graphics);
		add(text);
		
		/*
		 * Frame size and options
		 */
		setTitle("Hat-Man Chronicles");
		setBounds(100, 100, 800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		/*
		 * Starts the game
		 */
		vm.newScene();
	}
	
	/*
	 * Updates the GUI with new visuals and/or text
	 */
	public void newScene(String visuals, List<Word> list) {
//		System.out.println(visuals);
//		System.out.println(list);
		text.addText(list);
		graphics.changeText(visuals);
		revalidate();
	}
}
