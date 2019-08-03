package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SceneImpl implements Scene{
	
	String imageLocation;
	String textLocation;
	String musicLocation;
	
	String imageFileName;
	String textFileName;
	String musicFileName;
	
	Map<Integer, String> wordToScene;
	
	public SceneImpl(String imageFile, String textFile) {
		
		wordToScene = new HashMap<Integer, String>();
		
		imageFileName = imageFile;
		textFileName = textFile;
		musicFileName = null;
		
		imageLocation = "images/";
		textLocation = "text/";
		musicLocation = null;
		
	}
	
	
	public List<String> getText() throws FileNotFoundException {
		FileReader fileReader = new FileReader(textLocation + textFileName);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line = null;
		String text = "";
		try {
			while((line = bufferedReader.readLine()) != null) {
				text = text + line + "\n";
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		String[] textArray = text.split(" ");
		List<String> wordList = new ArrayList<String>();
		
		int i = 0;
		for(String string : textArray) {
			if(string.charAt(0) != '{' ) {
				wordList.add(string);
				++i;
			}else {
				String filename = string.substring(1, string.indexOf('}'));
				wordToScene.put(i-1, filename);
			}
		}
		
		return wordList;
	}
	
	public String getImage() throws FileNotFoundException {
		FileReader fileReader = new FileReader(imageLocation + imageFileName);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line = null;
		String image = "";
		try {
			while((line = bufferedReader.readLine()) != null) {
			    image = image + line + "\n";
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return image;
	}
	
	public String getSceneFileName(int wordLocation) {
		return wordToScene.get(wordLocation);
	}
	
}
