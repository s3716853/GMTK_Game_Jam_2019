package view;

import java.util.ArrayList;

import model.Engine;

public class ViewMainMethod {

	public static void main(String[] args) {
		Engine engine = new Engine();
		GUIFrame gui = new GUIFrame(engine);
		ArrayList<String> list = new ArrayList<String>();
		list.add("The");
		list.add("quick");
		list.add("brown");
		list.add("fox");
		list.add("jumped");
		list.add("over");
		list.add("the");
		list.add("lazy");
		list.add("dog.");
		list.add("The");
		list.add("quick");
		list.add("brown");
		list.add("fox");
		list.add("jumped");
		list.add("over");
		list.add("the");
		list.add("lazy");
		list.add("dog.");
		list.add("The");
		list.add("quick");
		list.add("brown");
		list.add("fox");
		list.add("jumped");
		list.add("over");
		list.add("the");
		list.add("lazy");
		list.add("dog.");
		list.add("The");
		list.add("quick");
		list.add("brown");
		list.add("fox");
		list.add("jumped");
		list.add("over");
		list.add("the");
		list.add("lazy");
		list.add("dog.");
		list.add("The");
		list.add("quick");
		list.add("brown");
		list.add("fox");
		list.add("jumped");
		list.add("over");
		list.add("the");
		list.add("lazy");
		list.add("dog.");
		list.add("The");
		list.add("quick");
		list.add("brown");
		list.add("fox");
		list.add("jumped");
		list.add("over");
		list.add("the");
		list.add("lazy");
		list.add("dog.");
		String visuals =
	    "         111111111111\n" +
		"     11111111111111111111\n" +
	    "1111111111111111111111111111111\n" +
	    "       11111      11111\n" +
	    "       1  11      1  11\n" +
	    "       11111      11111\n" +
	    "             1111      \n" +
	    "\n" +
	    "\n" +
        "          1111111111   ";
		gui.newScene(visuals, list);

	}

}
