package model;

import java.io.FileNotFoundException;
import java.util.List;


public interface Scene {
	
	public List<String> getText() throws FileNotFoundException;
	
	public String getImage() throws FileNotFoundException;
	
	public String getSceneFileName(int wordLocation);
	
	/**
	 * Return signifies whether a scene continues down a path, or returns
	 * to the main path afterwards.
	 * eg. jokes response scenes that return to main scene after
	 * @return 
	 */
	public boolean getReturn();
	
	
}
