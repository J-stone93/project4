package conditional.quiz;

public class Quiz1 {

	public static void main(String[] args) {
		
		int num = 2;
		
		if (num % 2 == 0 || num % 3 == 0 ) {
			System.out.println("num은 2 또는 3의 배수입니다: " + num);
		}
		
	}
	
}
