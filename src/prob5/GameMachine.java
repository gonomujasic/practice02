package prob5;

import java.util.Random;

public class GameMachine {

	private int val;
	private int maxNum = 100;
	private int minNum = 1;

	public void setMaxNum(int maxNum) {
		this.maxNum = maxNum;
	}

	public void setMinNum(int minNum) {
		this.minNum = minNum;
	}

	public void randomNumberExtractor() {

		Random r = new Random();
		
		this.val = r.nextInt(100) +1;

	}

	public boolean compareAndView(int num) {

		if (val > maxNum) {
			System.out.println("더 높게");
			System.out.println(minNum +"-"+ maxNum);
			maxNum = val;
			return false;
		} else if (val < minNum) {
			System.out.println("더 낮게");
			System.out.println(minNum +"-"+ maxNum);
			minNum = val;
			return false;
		} else {
			System.out.println("맞았습니다.");
			System.out.println("다시 하시겠습니까?(y/n)");
			return true;
		}

	}

}
