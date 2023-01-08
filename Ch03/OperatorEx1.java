
public class OperatorEx1 {

	public static void main(String[] args) {
		
		// 수식이 아닌 단독으로 사용할 시 전위, 후위 모두 값이 변경됨이 확인
		int i = 5;
		i++;
		System.out.println(i);
		
		i = 5;
		++i;
		System.out.println(i);
	

	}

}
