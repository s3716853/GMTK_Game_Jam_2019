package viewmodel;

import model.GameEngine;
import view.GUIFrame;

public class ViewModel {
	GUIFrame gui;
	GameEngine engine;
	
	public void setEngine(GameEngine engine) {
		this.engine = engine;
	}
	
	public void setGui(GUIFrame gui) {
		this.gui = gui;
	}

	/*
	 * Sends the ID for the selected word, and sends
	 * the resulting scene back to the GUI
	 */
	public void wordSelected(int wordNumber) {
		engine.wordSelected(wordNumber);
		newScene();
	}
	
	public void newScene() {
		gui.newScene(engine.getSceneImage(), engine.getSceneText());
	}
	
}
