package model;

import java.util.List;

public interface GameEngine {

	public String getSceneImage();
	
	public List<Word> getSceneText();
	
	public void wordSelected(int wordNumber);
	
}
