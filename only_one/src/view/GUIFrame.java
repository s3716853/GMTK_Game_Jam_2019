package view;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.util.List;

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
		setLayout(new GridLayout(2, 1));
		graphics = new GUIPanel();
		text = new GUIText(vm);
		add(graphics);
		add(text);
		
		/*
		 * Frame size and options
		 */
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setTitle("0utsider");
		setBounds((screenSize.width - (int)(screenSize.width/1.4)) / 2,
				(screenSize.height - (int)(screenSize.height/1.3)) / 2,
				(int)(screenSize.width/1.4), (int)(screenSize.height/1.3));
		//setBounds(180, 100, 1000, 600);
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
		validate();
		repaint();
	}
}
