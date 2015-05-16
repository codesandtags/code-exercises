package org.codesandtags.cstutoringcenter;

public class Problem38 {
	
	public static void main(String[] args) {
		
		Problem38 solve = new Problem38();
		System.out.println(solve.getAge());
	}
	
	public int getAge(){
		
		int age = 1;
		
		while(age < 100){
			
			if( age % 3 == 1 &&
				age % 4 == 2 &&
				age % 5 == 4)
			{
			
				System.out.println(age + " => " + age % 3 + " : " + age % 4 + " : " + age % 5 );
			}
			
			age++;
		}
		
		return age;
	}
}
