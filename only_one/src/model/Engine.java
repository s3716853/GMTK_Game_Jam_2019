package model;

import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

import javafx.scene.media.MediaPlayer;
import viewmodel.ViewModel;

public class Engine implements GameEngine{
	
	Scene currentScene = null;
	SoundManager sceneMusicPlayer;
	SoundManager sceneEffectPlayer;
	
	public Engine(ViewModel vm) {
		currentScene = new SceneImpl("main_menu");
		sceneMusicPlayer = new SoundManagerImpl();
		sceneEffectPlayer = new SoundManagerImpl();
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
	
	public void playWordSelectSound() {
		sceneEffectPlayer.playEffect("sound_effects/word_click.wav");
	}

	@Override
	public void wordSelected(int wordNumber) {
		String filename = currentScene.getSceneFileName(wordNumber);
		Scene nextScene = new SceneImpl(filename);
		playWordSelectSound();
		
		currentScene = nextScene;
		
		if(!currentScene.getMusicFileName().equals("same")) {
			System.out.println("THIS IS RUNNING");
			sceneMusicPlayer.playMusic(currentScene.getMusicFile());
		}
		
	}
	
	
}
