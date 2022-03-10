package first;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	static int one;
	static int two;
	static int three;
	static int four;
	static int five;
	static char first;
	static char second;
	static char third;
	static char fourth;
	static char fifth;
	
	public static void main(String[] args) throws IOException{
		String replace = "";
		//Reads the complete wordle answer list
		Scanner fileOne = new Scanner(new File("WordleList.txt"));
		//Creates a Arraylist for answer sheet to fill
		List<String> wordleList = new ArrayList<String>();
		
		//While loop to fill in answers to array
		while(fileOne.hasNext()) {
			replace = fileOne.next();
			wordleList.add(replace);
		}
		fileOne.close();
		
		//Always the starting word
		System.out.println("Try salet");
		String word = "salet";
		String guess = "";
		//Test
		System.out.println(wordleList.size());
		while(true) {
			inputColors();
			first = word.charAt(0);
			second = word.charAt(1);
			third = word.charAt(2);
			fourth = word.charAt(3);
			fifth = word.charAt(4);
			//Removing all words with same first letters
			if(one == 1) {
				for(int i = 0; i < wordleList.size() - 1; i++) {
					if(wordleList.get(i).charAt(0) == first) {
						wordleList.remove(i);
					}
				}
			}
			System.out.println(wordleList.size());
		}
		
	}
	
	public static void inputColors() {
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
	}
}
