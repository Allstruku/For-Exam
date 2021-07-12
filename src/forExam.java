
public class forExam {

	public static void main(String[] args) {
		int total = 0;
		for(int value = 1; value <= 100; value ++) {
		// for문 다음의 괄호 첫 번째 칸에는 변수를 설정한다. 두 번째 칸에는 조건 condition을 설정한다. 세번째 칸에는 infinite loop을 막기위한, 변수를 변경
		// 해주는 code를 넣는다.
		// for문 다음의 괄호 첫 번째 칸의 code는 딱 한번만 실행이 된다. 두 번째의 칸에 있는 code, 정확히는 조건 condition은 true 결과로 result가 난다면
		// for문의 block of code는 계속 실행이된다. 세 번째 칸의 변수를 변경해주는 값에서 계속 변경이되면서 조건 condition이 만족을 할때까지 loop가 진행이된다.
			total = total + value;
		}
		System.out.println(total);
		
		int eventotal = 0;
		for(int value = 1; value <= 100; value ++) {
			if(value % 2 == 0) {
			// 위 if conditional statement 다음의 조건 condition을 만족시켜주는 정수는 짝수만 있다.
			// 그럴 시에만 밑에 있는 code가 실행이 되기 때문에 홀수는 더해지지 않는다.
			eventotal = eventotal + value;
			}
		}
		System.out.println(eventotal);


		int eventotal2 = 0;
		for(int value = 1; value <= 100; value ++) {
			if(value % 2 != 0) {
			// 위 if conditional statement 다음의 조건 condition을 만족시켜주는 정수는 수만 있다.
			// 밑에 있는 continue;는 그 밑의 code (eventotal2 = eventotal2 + value;)가 실행이 안되게 한다. 바로 다시 for문으로 올라가서 다 
			// value가 들어가게 한다.
				continue;
			}
			eventotal2 = eventotal2 + value;
		}
		System.out.println(eventotal2);
	
		int total50 = 0;
		for(int value = 1; value <= 100; value ++) {
			total50 = total50 + value;
			// 똑같이 total50에 1씩 늘어나는 value의 값을 더해준다.
			if(value == 50) {
			// 하지만 value가 50에 도달하는 순간 break; code를 실행한다. 
				break;
			// break; code를 만나는 지점부터 아예 반복문을 나가게 된다.
			}		
		}
			System.out.println(total50);

	}
}
// break와 continue의 차이점은 continue는 그 아래의 code가 실행이 되지는 않지만, 다시 시작으로 가 반복을 계속 진행을 한다. 하지만 break;는 아예 그
// 반복문을 나가게 된다.