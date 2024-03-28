package conditional.quiz;

public class Quiz8 {

	public static void main(String[] args) {
		
//		int score = 99;
//		
//		switch (score) {
//		case 90:
//		case 91:
//		case 92:
//		case 93:
//		case 94:
//		case 95:
//		case 96:
//		case 97:
//		case 98:
//		case 99:
//			System.out.println("수");
//			break;
//		case 80:
//		case 81:
//		case 82:
//		case 83:
//		case 84:
//		case 85:
//		case 86:
//		case 87:
//		case 88:
//		case 89:
//			System.out.println("우");
//			break;
//		case 70:
//		case 71:
//		case 72:
//		case 73:
//		case 74:
//		case 75:
//		case 76:
//		case 77:
//		case 78:
//		case 79:
//			System.out.println("미");
//			break;
//		default:
//			System.out.println("양");
//			break;
//			
//		}
		int score = 88;
		int value = score / 10;

		switch (value) {
		case 9: // 90~99
			System.out.println("수");
			break;
		case 8: // 80~89
			System.out.println("우");
			break;
		case 7: // 70~79
			System.out.println("미");
			break;
		default:
			System.out.println("양");
			break;
		}
	}

}
