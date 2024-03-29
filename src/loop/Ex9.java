package loop;

public class Ex9 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i;
		
		for(i = 1; i <= 20; i++) {
			
			sum = sum + i;
			System.out.println("i: " + i + " , sum: " + sum);
			
			if(sum >= 100) { //합이 100을 넘으면 break로 인해 for문 종료
				break;
			}
		}
		System.out.print("i: " + i +"   ");
		System.out.println("sum: " + sum);
		
		}
		
	}


