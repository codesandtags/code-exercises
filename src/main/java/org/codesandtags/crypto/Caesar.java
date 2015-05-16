package org.codesandtags.crypto;

public class Caesar {

	public static void main(String[] args) {

		String msg = "JXU GKYSA RHEMD VEN ZKCFI ELUH JXU BQPO TEW EV SQUIQH QDT OEKH KDYGKU IEBKJYED YI STIIDCUXHFFV";
		String msg2 = "4E 49 43 45 20 53 57 45 41 54 45 52";

		for (int i = 1; i <= 1; i++) {
			//System.out.println(getCaesarASCII(msg2.split(" "), i));
			//System.out.println(getCaesar("KTB YAQSXR DO DQ", i));
			System.out.println(getCaesarASCII("110 101 120 120 131 040 102 111 122 124 110 104 101 131".split(" "), i));
		}

	}

	public static String getCaesar(String msg, int rot) {

		String result = "";
		String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		for (int i = 0; i < msg.length(); i++) {

			int index = charset.indexOf(msg.charAt(i));

			if (index < 0) {
				result += msg.charAt(i);
			} else {
				if ((index + rot) >= charset.length()) {
					index = (rot + index) - charset.length();
				} else {
					index = index + rot;
				}
				result += charset.charAt(index);
			}
		}

		return result;
	}

	public static String getCaesarASCII(String[] msg, int rot) {

		String result = "";
		String charset = "";

		// Fill charset
		for (int i = 1; i <= 128; i++) {
			charset += String.valueOf((char) i);
		}
		
		
		String resultascii = "";
		String resultletter = "";
		
		// Get Caesar trasposition
		for (int i = 0; i < msg.length; i++) {
		
			int ascii = Integer.valueOf(msg[i], 16);
			String letter = String.valueOf((char)ascii);
			int index = charset.indexOf(letter);
			
			//System.out.println(":::");
			System.out.print(letter + "");
			//resultletter += letter;
			
			if (letter.equals(" ")) {
				//result += "(" + letter + ":" + index + ")";
				result += letter;
			} else {
				if ((index + rot) >= charset.length()) {
					index = (rot + index) - charset.length();
				} else {
					index = index + rot;
				}
				
				if(index >= charset.length()){
					index -= charset.length();
				}
				
				result += charset.charAt(index);
				resultascii += charset.charAt(index) + " ";
			}
		}

		//System.out.println(charset);
		System.out.println(resultascii);
		//System.out.println(resultletter);
		return  rot + ":" + result;
	}

}
