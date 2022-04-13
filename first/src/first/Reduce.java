package first;

import java.util.ArrayList;
import java.util.List;

public class Reduce {
	private String first;
	private String second;
	private String third;
	private String fourth;
	private String fifth;
	private int one;
	private int two;
	private int three;
	private int four;
	private int five;
	private String word;
	private List<String> wordleList = new ArrayList<String>();
	private List<String> green = new ArrayList<String>();
	
	public Reduce(String word, List<String> wordleList, int one, int two, int three, int four, int five) {
		this.word = word;
		this.wordleList = wordleList;
		this.one = one;
		this.two = two;
		this.three = three;
		this.four = four;
		this.five = five;
	}
	
	public void update(String word, List<String> wordleList, int one, int two, int three, int four, int five) {
		this.word = word;
		this.wordleList = wordleList;
		this.one = one;
		this.two = two;
		this.three = three;
		this.four = four;
		this.five = five;
	}
	
	public String getWord() {
		return word;
	}
	
	public List<String> getGreen(){
		return green;
	}
	
	public void resetGreen() {
		green.removeAll(green);
	}
	
	public List<String> reduceSize() {
		first = word.substring(0,1);
		second = word.substring(1,2);
		third = word.substring(2,3);
		fourth = word.substring(3,4);
		fifth = word.substring(4,5);
		//If all letters are green remove all words except the matching word from Arraylist
		
		if(one == 3 && two == 3 && three == 3 && four == 3 && five == 3) {
			for(int i = 0; i < wordleList.size();) {
				if(!(wordleList.get(i).equals(word))) {
					wordleList.remove(i);
				}
				else {
					i++;
				}
			}
		}		
		/* Checks if a letter is green and adds it to the green list, removes
		 *        all words that do not have that letter in that spot
		 */
		if(one == 3) {					
			if(!(green.contains(first))) {
				green.add(first);
			}
			for(int i = 0; i < wordleList.size();) {
				if(!wordleList.get(i).substring(0,1).equals(first)) {
					wordleList.remove(i);
				}
				else {
					i++;
				}
			}
		}
		if(two == 3) {					
			if(!(green.contains(second))) {
				green.add(second);
			}
			for(int i = 0; i < wordleList.size();) {
				if(!wordleList.get(i).substring(1,2).equals(second)) {
					wordleList.remove(i);
				}
				else {
					i++;
				}
			}
	
		}
		if(three == 3) {					
			if(!(green.contains(third))) {
				green.add(third);
			}
			for(int i = 0; i < wordleList.size();) {
				if(!wordleList.get(i).substring(2,3).equals(third)) {
					wordleList.remove(i);
				}
				else {
					i++;
				}
			}
		}
		if(four == 3) {					
			if(!(green.contains(fourth))) {
				green.add(fourth);
			}
			for(int i = 0; i < wordleList.size();) {
				if(!wordleList.get(i).substring(3,4).equals(fourth)) {
					wordleList.remove(i);
				}
				else {
					i++;
				}
			}
		}
		if(five == 3) {					
			if(!(green.contains(fifth))) {
				green.add(fifth);
			}
			for(int i = 0; i < wordleList.size();) {
				if(!wordleList.get(i).substring(4,5).equals(fifth)) {
					wordleList.remove(i);
				}
				else {
					i++;
				}
			}
		}
		/* Check if a letter is yellow and add it to green list, removes all words with
		 *       letter in that spot and all words who do not have that letter
		 */      
		if(one == 2) {
			if(!(green.contains(first))) {
				green.add(first);
			}
			for(int i = 0; i < wordleList.size();) {
				if(!(wordleList.get(i)).contains(first)) {
					wordleList.remove(i);
				}
				else {
					i++;
				}
			}
			for(int i = 0; i < wordleList.size();) {
				if((wordleList.get(i)).substring(0,1).equals(first)) {
					wordleList.remove(i);
				}
				else {
					i++;
				}
			}
		}
		if(two == 2) {
			if(!(green.contains(second))) {
				green.add(second);
			}
			for(int i = 0; i < wordleList.size();) {
				if(!(wordleList.get(i)).contains(second)) {
					wordleList.remove(i);
				}
				else {
					i++;
				}					
			}
			for(int i = 0; i < wordleList.size();) {
				if((wordleList.get(i)).substring(1,2).equals(second)) {
					wordleList.remove(i);
				}
				else {
					i++;
				}
			}
		}
		if(three == 2) {
			if(!(green.contains(third))) {
				green.add(third);
			}
			for(int i = 0; i < wordleList.size();) {
				if(!(wordleList.get(i)).contains(third)) {
					wordleList.remove(i);
				}
				else {
					i++;
				}					
			}
			for(int i = 0; i < wordleList.size();) {
				if((wordleList.get(i)).substring(2,3).equals(third)) {
					wordleList.remove(i);
				}
				else {
					i++;
				}
			}
		}
		if(four == 2) {
			if(!(green.contains(fourth))) {
				green.add(fourth);
			}
			for(int i = 0; i < wordleList.size();) {
				if(!(wordleList.get(i)).contains(fourth)) {
					wordleList.remove(i);
				}
				else {
					i++;
				}					
			}
			for(int i = 0; i < wordleList.size();) {
				if((wordleList.get(i)).substring(3,4).equals(fourth)) {
					wordleList.remove(i);
				}
				else {
					i++;
				}
			}
		}
		if(five == 2) {
			if(!(green.contains(fifth))) {
				green.add(fifth);
			}
			for(int i = 0; i < wordleList.size();) {
				if(!(wordleList.get(i)).contains(fifth)) {
					wordleList.remove(i);
				}
				else {
					i++;
				}					
			}
			for(int i = 0; i < wordleList.size();) {
				if((wordleList.get(i)).substring(4,5).equals(fifth)) {
					wordleList.remove(i);
				}
				else {
					i++;
				}
			}
		}
		/* Check if the gray letter is in green list, if it is in green list only remove
		 * the words with letters in that spot, if the letter is not in green list remove
		 *                      all words that have that letter
		 */
		if(one == 1) {
			for(int i = wordleList.size() - 1; i >= 0; i--) {
				if(wordleList.get(i).contains(first)) {
					if(green.contains(first)) {
						if(wordleList.get(i).substring(0,1).equals(first)) {
							wordleList.remove(i);
						}
					}
					else {
						wordleList.remove(i);
					}
				}
			}
		}
		if(two == 1) {
			for(int i = wordleList.size() - 1; i >= 0; i--) {
				if(wordleList.get(i).contains(second)) {
					if(green.contains(second)) {
						if(wordleList.get(i).substring(1,2).equals(second)) {
							wordleList.remove(i);
						}
					}
					else {
						wordleList.remove(i);
					}
				}
			}
		}
		if(three == 1) {
			for(int i = wordleList.size() - 1; i >= 0; i--) {
				if(wordleList.get(i).contains(third)) {
					if(green.contains(third)) {
						if(wordleList.get(i).substring(2,3).equals(third)) {
							wordleList.remove(i);
						}
					}
					else {
						wordleList.remove(i);
					}
				}
			}
		}			
		if(four == 1) {
			for(int i = wordleList.size() - 1; i >= 0; i--) {
				if(wordleList.get(i).contains(fourth)) {
					if(green.contains(fourth)) {
						if(wordleList.get(i).substring(3,4).equals(fourth)) {
							wordleList.remove(i);
						}
					}
					else {
						wordleList.remove(i);
					}
				}
			}
		}
		if(five == 1) {
			for(int i = wordleList.size() - 1; i >= 0; i--) {
				if(wordleList.get(i).contains(fifth)) {
					if(green.contains(fifth)) {
						if(wordleList.get(i).substring(4,5).equals(fifth)) {
							wordleList.remove(i);
						}
					}
					else {
						wordleList.remove(i);
					}
				}
			}
		}
		return wordleList;
	}
}