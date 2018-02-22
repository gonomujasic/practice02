package prob3;


public class CommaConverter {

	public static void replaceSpace(char a[]) {
		
		for(int i = 0; i< a.length; i++) {
			
			if(a[i] == ' ') {
				a[i] = ',';
			}
		}
	}
	
}
