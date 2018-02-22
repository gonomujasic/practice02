package prob1;

public class CalculatingMachine {

	private int fiftyThousand;
	private int tenThousand;
	private int fiveThousand;
	private int thousand;
	private int fiveHundred;
	private int hundred;
	private int fifty;
	private int ten;
	private int five;
	private int one;

	public int getFiftyThousand() {
		return fiftyThousand;
	}

	public int getTenThousand() {
		return tenThousand;
	}

	public int getFiveThousand() {
		return fiveThousand;
	}

	public int getThousand() {
		return thousand;
	}

	public int getFiveHundred() {
		return fiveHundred;
	}

	public int getHundred() {
		return hundred;
	}

	public int getFifty() {
		return fifty;
	}

	public int getTen() {
		return ten;
	}

	public int getFive() {
		return five;
	}

	public int getOne() {
		return one;
	}

	public void calculate(int money) {
		
		fiftyThousand = money/50000;
		money = money - 50000 * fiftyThousand;

		tenThousand = money/10000;
		money = money - 10000 * tenThousand;
		
		fiveThousand = money/5000;
		money = money - 5000 * fiveThousand;
		
		thousand = money/1000;
		money = money - 1000 * thousand;
		
		fiveHundred = money/500;
		money = money - 500 * fiveHundred;
		
		hundred = money/100;
		money = money - 100 * hundred;
		
		fifty = money/50;
		money = money - 50 * fifty;
		
		ten = money/10;
		money = money - 10 * ten;
		
		five = money/5;
		money = money - 5 * five;
		
		one = money/1;
		
	}
	
	public void show() {
		
		System.out.println("50000원: "+fiftyThousand+"개");
		System.out.println("10000원: "+tenThousand+"개");
		System.out.println("5000원: "+fiveThousand+"개");
		System.out.println("1000원: "+thousand+"개");
		System.out.println("500원: "+fiveHundred+"개");
		System.out.println("100원: "+hundred+"개");
		System.out.println("50원: "+fifty+"개");
		System.out.println("10원: "+ten+"개");
		System.out.println("5원: "+five+"개");
		System.out.println("1원: "+one+"개");
	}

}
