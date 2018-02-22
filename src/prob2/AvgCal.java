package prob2;

public class AvgCal {

	
	
	public void average(int[] intArray) {
		
		double sum = 0;
		
		for(int i:intArray) {
			sum = sum + i;
		}
		show(sum/intArray.length);
	}
	
	public void show(double avg) {
		System.out.println("평균은 "+avg+ " 입니다.");
	}
	
}
