package model;

import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

import viewmodel.ViewModel;

public class Engine implements GameEngine{
	
	/*
	 * backlog of scenes when you go into a conversation line
	 * that does not go down its own path, but returns you to the
	 * main conversation after
	 */
	Deque<Scene> sceneBacklog;
	Scene currentScene = null;
	
	
	public Engine(ViewModel vm) {
		sceneBacklog = new ArrayDeque<Scene>();
		currentScene = new SceneImpl("test_text");
		
		vm.setEngine(this);
	}
	
	@Override
	public String getSceneImage() {
		String image = "";
		try {
			image = currentScene.getImage();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return image;
	}


	@Override
	public List<Word> getSceneText() {
		List<Word> text = null;
		
		try {
			text = currentScene.getText();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return text;
	}

	@Override
	public void wordSelected(int wordNumber) {
		String filename = currentScene.getSceneFileName(wordNumber);
		Scene nextScene = new SceneImpl(filename);
		if(nextScene.getReturn()) {
			sceneBacklog.add(currentScene);
		}
		
		currentScene = nextScene;
	}
	
	
}
