package prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {

		GameMachine gm = new GameMachine();
		gm.randomNumberExtractor();
		System.out.println("수를 결정하였습니다. 맞추어 보세요.");
		System.out.println("1-100");
		
		Scanner scan = new Scanner(System.in);
		boolean isTrue = false;
		
		while(true) {
			isTrue = gm.compareAndView(scan.nextInt());
			
			if(isTrue == true) {
				if(scan.nextLine() != "y") {
					break;
				} else {
					gm.randomNumberExtractor();
					gm.setMaxNum(100);
					gm.setMinNum(1);
					isTrue = false;
				}
			}
		}
	}
}