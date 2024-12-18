package cond;

public class Switch1 {
    public static void main(String[] args) {
        int grade = 2;
        int coupon ;

        if(grade == 1){
            coupon = 1000;
        } else if (grade == 2) {
            coupon = 2000;
        }else if (grade == 3){
            coupon = 3000;
        }else {
            coupon = 500;
        }
        System.out.println("발급 받은 쿠폰 " + coupon);
    }
    /*
    if 문은 비교 연산자를 사용할 수 있지만 , switch문은 단순히 값이 같은지만 비교할 수 있다.
    조건식의 결과 값이 어떤 case의 값과 일치하면 해당 case의 코드를 실행한다
    break 문은 현재 실행 중인 코드를 끝내고 switch문을 빠져져나가개 하는 역할을 한다.
    만약 break 문이 없으면 일치하는 case 이후의 모든 case 코드들이 순서대로 실행이된다
    default는 조건식의 결과 값이 모든 case의 값과 일치하지 않을 때 실행된다 if문의 else와 같다. default 구문은 선택이다.
     */
}
