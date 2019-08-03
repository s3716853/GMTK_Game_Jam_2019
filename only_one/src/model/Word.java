package model;

public class Word {
	
	int identifier;
	String word;
	boolean clickable;
	
	public Word(String word, int identifier) {
		this.word = word;
		this.clickable = false;
		this.identifier = identifier;
	}
	
	public int getIdentifier() {
		return identifier;
	}
	
	public String getWord() {
		return word;
	}
	
	public boolean isClickable() {
		return clickable;
	}
	
	public void setClickable() {
		clickable = true;
	}

}
