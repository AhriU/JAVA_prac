
public class OperatorEx13 {

	public static void main(String[] args) {
		char c1 = 'a';
		
		//char c2 = c1 + 1;    <- 컴파일 에러, c1 + 1은 int형인데 char형의 변수에 넣으려 시도
		char c2 = 'a' + 1;    // 리터럴간의 계산은 컴파일 시 진행 되기 떄문에 c2에는 'b'가 들어가서 오류가 발생하지 않는다
		
		System.out.println(c2);

	}

}
