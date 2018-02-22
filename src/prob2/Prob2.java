package prob2;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		int intArray[] = new int[5];

		System.out.println( "5개의 숫자를 입력하세요." );
		intArray[0] = scanner.nextInt();
		intArray[1] = scanner.nextInt();
		intArray[2] = scanner.nextInt();
		intArray[3] = scanner.nextInt();
		intArray[4] = scanner.nextInt();

		AvgCal ac = new AvgCal();
		ac.average(intArray);
		
		scanner.close();
		
	
	}
}
