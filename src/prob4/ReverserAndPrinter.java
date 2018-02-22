package prob4;

public class ReverserAndPrinter {

	public static char[] reverse(String str) {
		
		char[] charArray = str.toCharArray();
		char[] reversedCharArray = new char[charArray.length];
		int temp = charArray.length-1;
		
		for(int i = 0; i < charArray.length; i++) {
			reversedCharArray[i] = charArray[temp-i];
		}
		return reversedCharArray;
		
	}
	
	public static void printCharArray(char[] charArray) {
		
		for(int j = 0; j< charArray.length; j++) {
			System.out.print(charArray[j]);
		}
	}
}
