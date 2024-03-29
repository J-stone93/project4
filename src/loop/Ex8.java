package loop;

public class Ex8 {

	public static void main(String[] args) {
		
		int sum = 0; //합계를 저장할 변수
		
		for(int i = 1; i <= 10; i++) {
			
			if(i % 2 == 0) { // i가 짝수라면 
				continue;	 // 코드를 수행하지 않고 스킵
			}
			sum = sum + i; //i가 홀수만 남고 sum에 더하고 sum에 대입 
		}
		System.out.println("1부터 10까지 홀수들의 합은 " + sum + "입니다");
			
		}
		
	}


