package first;

import java.util.ArrayList;
import java.util.List;

public class Entropy {
	private String word;
	private String first;
	private String second;
	private String third;
	private String fourth;
	private String fifth;
	private List<String> wordleList = new ArrayList<String>();
	private List<String> duplicate = new ArrayList<String>();
	private double counter;
	
	public Entropy(List<String> wordleList, String word) {
		this.wordleList = wordleList;
		this.word = word;
	}
	
	public void update(List<String> wordleList, String word) {
		this.wordleList = wordleList;
		this.word = word;
	}
	
	public void resetCounter() {
		counter = 0;
	}
	
	public double calculate() {
		first = word.substring(0,1);
		second = word.substring(1,2);
		third = word.substring(2,3);
		fourth = word.substring(3,4);
		fifth = word.substring(4,5);
		
		for(int i = 0; i < wordleList.size(); i ++) {
			if(!wordleList.get(i).contains(first)){
				counter++;
				duplicate.add(first);
			}
			if(!wordleList.get(i).contains(second)) {
				if(!duplicate.contains(second)) {
					counter++;
				}
				duplicate.add(second);
			}
			if(!wordleList.get(i).contains(third)) {
				if(!duplicate.contains(third)) {
					counter++;
				}
				duplicate.add(third);
			}
			if(!wordleList.get(i).contains(fourth)) {
				if(!duplicate.contains(fourth)) {
					counter++;
				}
				duplicate.add(fourth);
			}
			if(!wordleList.get(i).contains(fifth)) {
				if(!duplicate.contains(fifth)) {
					counter++;
				}
			}
		}
		duplicate.removeAll(duplicate);
		return (counter / 5) / wordleList.size();
	}
}
