package viewmodel;

import model.GameEngine;
import view.GUIFrame;

public class ViewModel {
	GUIFrame gui;
	GameEngine engine;
	
	public ViewModel(GUIFrame gui, GameEngine engine) {
		this.gui = gui;
		this.engine = engine;
	}

	public void wordSelected(int wordNumber) {
		engine.wordSelected(wordNumber);
		gui.newScene(engine.getSceneImage(), engine.getSceneText());
	}
	
}
