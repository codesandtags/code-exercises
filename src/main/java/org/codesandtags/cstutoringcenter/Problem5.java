package org.codesandtags.cstutoringcenter;

public class Problem5 {
	
	String[][] letters = {
			{"a","26"},{"b","25"},{"c","24"},{"d","23"},	
			{"e","22"},{"f","21"},{"g","20"},{"h","19"},
			{"i","18"},{"j","17"},{"k","16"},{"l","15"},
			{"m","14"},{"n","13"},{"o","12"},{"p","11"},
			{"q","10"},{"r","9"},{"s","8"},{"t","7"},
			{"u","6"},{"v","5"},{"w","4"},{"x","3"},
			{"y","2"},{"z","1"}
	};
	
	
	public static void main(String[] args) {
		
		Problem5 solve = new Problem5();
		String msg = "the quick brown fox jumped over the cow";
		System.out.println(solve.getSum(msg));
		
	}
	
	public int getSum(String msg){
		int sum = 0;
		
		for (int i = 0; i < msg.length(); i++) {
			String letter = String.valueOf(msg.charAt(i));
			for (int j = 0; j < letters.length; j++) {
				if(letter.equals(letters[j][0])){
					System.out.println(letter + ":" + letters[j][1]);
					sum += Integer.parseInt(letters[j][1]);
				}
			}
		}
		
		return sum;
	}

}
