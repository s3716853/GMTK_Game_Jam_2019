package view;

import java.awt.GridLayout;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class GUIFrame extends JFrame {

	GUIPanel graphics = new GUIPanel();
	GUIText text = new GUIText();
	
	public GUIFrame() {
		setBounds(100, 100, 800, 600);
		setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
		add(graphics);
		add(text);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void newScene(String visuals, List<String> speech) {
		text.addText(speech);
		graphics.changeText(visuals);
		revalidate();
	}
}
