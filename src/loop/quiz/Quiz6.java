package loop.quiz;

public class Quiz6 {

	public static void main(String[] args) {
		
		int i;
		int sum = 0;
		
		for(i = 1; i <= 100; i++) {
			sum = sum + i;
			if(sum > 500) {
				break;
			}
		} System.out.print("i의 값: " + i);
		  System.out.println("sum의 값: " + sum);
			
			
		}

}


