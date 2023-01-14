
public class OperatorEx8 {

	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 2_000_000;
		
		long c = a * b;
		
		System.out.println(c);	// 이미 a*b를 하는 시점에서 int의 범위를 넘어 오버 플로가 발생했기 때문에 long형인 c에 넣는다고 해도 다른 값이됨
	}

}
