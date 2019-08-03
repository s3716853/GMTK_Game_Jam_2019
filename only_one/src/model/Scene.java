package model;

import java.io.FileNotFoundException;
import java.util.List;


public interface Scene {
	
	public List<String> getText() throws FileNotFoundException;
	
	public String getImage() throws FileNotFoundException;
	
	public String getSceneFileName(int wordLocation);
	
}
