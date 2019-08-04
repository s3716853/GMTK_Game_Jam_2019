package app;

import model.GameEngine;
import model.Engine;
import view.GUIFrame;
import viewmodel.ViewModel;

public class Driver {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ViewModel vm = new ViewModel();
		GameEngine testEngine = new Engine(vm);
		GUIFrame gui = new GUIFrame(testEngine, vm);
	}

}
