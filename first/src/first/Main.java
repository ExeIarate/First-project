package first;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	static double entropy;
	static int one = 1;
	static int two = 1;
	static int three = 1;
	static int four = 1;
	static int five = 1;
	static double minSize = 999999;
	static String word = "salet";
	static List<String> wordleList = new ArrayList<String>();
	static Reduce list = new Reduce(word, wordleList, one, two, three, four, five);
	static Entropy calc = new Entropy(wordleList, word);
	
	public static String setWord(){
		list.update(word, wordleList, one, two, three, four, five);
		wordleList = list.reduceSize();
		for(int i = 0; i < wordleList.size(); i++) {
			calc.update(wordleList, wordleList.get(i));
			entropy = calc.calculate();
			if(entropy < minSize) {
				word = wordleList.get(i);
				minSize = entropy;
			}
			calc.resetCounter();
		}
		minSize = 999999;
		return word;
	}
	
	public static void resetWord() {
		word = "salet";
	}
	
	public static List<String> getGreen(){
		return list.getGreen();
	}
	
	public static String getWord() {
		return word;
	}
	
	public static List<String> getWordleList(){
		return wordleList;
	}
	
	public static int getLength() {
		return wordleList.size();
	}
	
	public static void setOne(int one) {
		Main.one = one;
	}
	
	public static int getOne() {
		return one;
	}
	
	public static void setTwo(int two) {
		Main.two = two;
	}
	
	public static int getTwo() {
		return two;
	}
	
	public static void setThree(int three) {
		Main.three = three;
	}
	
	public static int getThree() {
		return three;
	}
	
	public static void setFour(int four) {
		Main.four = four;
	}
	
	public static int getFour() {
		return four;
	}
	
	public static void setFive(int five) {
		Main.five = five;
	}
	
	public static int getFive() {
		return five;
	}
	
	public static void setUp() throws IOException{
		String replace = "";
		//Reads the complete wordle answer list
		Scanner fileOne = new Scanner(new File("WordleList.txt"));
		//While loop to fill in answers to array
		while(fileOne.hasNext()) {
			replace = fileOne.next();
			wordleList.add(replace);
		}
		list.resetGreen();
		word = "salet";
	}
	
	/*public static void inputColors() {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the color of the first square? (1 for gray, 2 for yellow, 3 for green)");
	    one = input.nextInt();
		System.out.println("What is the color of the second square? (1 for gray, 2 for yellow, 3 for green)");
		two = input.nextInt();
		System.out.println("What is the color of the third square? (1 for gray, 2 for yellow, 3 for green)");
		three = input.nextInt();
		System.out.println("What is the color of the fourth square? (1 for gray, 2 for yellow, 3 for green)");
		four = input.nextInt();
		System.out.println("What is the color of the fifth square? (1 for gray, 2 for yellow, 3 for green)");
		five = input.nextInt();
	}*/
}
