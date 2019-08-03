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
	
	boolean returnScene;
	List<Word> text;
	String image;
	
	Map<Integer, String> wordToScene;
	
	public SceneImpl(String textFile) {
		
		imageLocation = "images/";
		textLocation = "text/";
		musicLocation = null;
		
		List<String> details = getSceneDetails(textFile);
		wordToScene = new HashMap<Integer, String>();
		returnScene = Boolean.parseBoolean(details.get(1).substring(1, details.get(1).length()-1));
		
		text = textStringToList(details.get(2));
		image = loadImage(details.get(0).substring(1, details.get(0).length()-1));
		
	}
	
	public List<Word> getText() throws FileNotFoundException {
		return text;
	}
	
	public String getImage() {
		return image;
	}
	
	public String getSceneFileName(int wordLocation) {
		return wordToScene.get(wordLocation);
	}
	
	private List<String> getSceneDetails(String filename) {
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(textLocation + filename);
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		List<String> sceneDetails = new ArrayList<String>();
		try {
			sceneDetails.add(bufferedReader.readLine());
			sceneDetails.add(bufferedReader.readLine());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
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
		sceneDetails.add(text);
		
		return sceneDetails;
		
	}
	
	private String loadImage(String imageFileName) {
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(imageLocation + imageFileName);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
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
	
	private List<Word> textStringToList(String text) {
		
		String[] textArray = text.split(" ");
		List<Word> wordList = new ArrayList<Word>();
		
		int i = 0;
		for(String string : textArray) {
			if(string.charAt(0) != '{' ) {
				wordList.add(new Word(string, i));
				++i;
			}else {
				String filename = string.substring(1, string.indexOf('}'));
				wordToScene.put(i-1, filename);
			}
		}
		
		return wordList;
		
	}

	@Override
	public boolean getReturn() {
		return returnScene;
	}
}
