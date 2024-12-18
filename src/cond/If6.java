package cond;

public class If6 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if(price > 10000){
            discount = discount + 1000;
            System.out.println("100000원 이상 구매 시 1000원 할인");
        }
       else if(age <= 10){
            discount = discount + 10000;
            System.out.println("10000원 이상 구매시 1000원 할인");
        }else{
            System.out.println("할인 없음");
        }
        System.out.println("총 할인 금액: " + discount + "원");

    }
}
/*
참고 if문에 실행할 명령이 하나만 있을 경우에는 {}중괄호를 생략할 수 있다
if 문의 명령이 한개만 있을 경우에도 다음과 같은 이유로 중괄호를 사용하는 것이 좋다
가독성: 중괄호를 사용하면 코드를 더 읽기 쉽게 만들어 주고 범위가 명확하게 보여지므로 코드를 더 쉽게 이해 할 수 있다
유지보수성: 중괄호를 사용하면 나중에 코드를 수정할 때 오류를 덜 발생시킬 수 있다  if문에 또 다른 코드를 추가하려고하면 중괄호가 없으면 이 코드가 if문의
일부라는 것이 명확하지 않을 수 있기 때문이다
 */