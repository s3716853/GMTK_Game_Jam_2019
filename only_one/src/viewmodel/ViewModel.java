package viewmodel;

import model.GameEngine;
import view.GUIFrame;

public class ViewModel {
	GUIFrame gui;
	GameEngine engine;
	
	public ViewModel() {

	}
	
	public void setEngine(GameEngine engine) {
		this.engine = engine;
	}
	
	public void setGui(GUIFrame gui) {
		this.gui = gui;
	}

	public void wordSelected(int wordNumber) {
		engine.wordSelected(wordNumber);
		gui.newScene(engine.getSceneImage(), engine.getSceneText());
	}
	
	public void initilise() {
		gui.newScene(engine.getSceneImage(), engine.getSceneText());
	}
	
}
