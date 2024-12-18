package cond;

public class CondOp2 {
    public static void main(String[] args) {
        int age = 18;
        String status = (age >= 18) ? "성인" :"미성년자" ;
        System.out.println("age = " + age + "status = " +status);
    }
}
/*
삼항 연산자
(조건) ? 참_표현식 : 거짓_표현식
삼항 연산자는 항이 3개라는 뜻이다. 조건, 참_표현식, 거짓_표현식 이렇게 항이 3개이다. 자바에서 유일하게 항이 3개인 연산자여서 삼항 연산자라고 한다
또는 특정 조건에 따라 결과가 나오기 때문에 조건 연산자라고도 한다
조건에 만족하면 참_표현식이 실행되고, 조건에 만족하지 않으면 거짓_표현식이 실행된다. 앞의 if,else문과 유사하다.
if문 처럼 코드 블럭을 넣을 수 있는 것이 아니라 단순한 표현식만 넣을 수 있다.

 */
