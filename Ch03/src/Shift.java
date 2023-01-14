
public class Shift {

	public static void main(String[] args) {
		int x = 8;
		
		for(int i = 0; i <= 33; i++) {
			System.out.printf("x<<%d \t%s%n", i, toBinaryString(x<<i)); // i가 32가 되면 값이 그대로 돌아오는 것을 확인
		}

		

	}
	static String toBinaryString(int x) {
		String zero = "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);
		return tmp.substring(tmp.length()-32);
	}

}
