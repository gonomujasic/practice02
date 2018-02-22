package prob3;

public class Prob3 {
	public static void main(String args[]) {
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.' };

		// 원래 배열 원소 출력
		PrintProb3.printCharArray(c);

		// 공백 문자 바꾸기
		CommaConverter.replaceSpace(c);

		// 수정된 배열 원소 출력
		PrintProb3.printCharArray(c);
	}
}
