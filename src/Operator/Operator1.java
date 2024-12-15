package Operator;

public class Operator1 {
    public static void main(String[] args) {
        //변수 초기화
        int a = 5;
        int b = 2;

        //덧셈
        int sum = a+b;
        System.out.println("a + b = " +sum);


        // 뺄셈
        int diff = a - b ;
        System.out.println("a - b =" + diff);

        //곱셈
        int multi = a *b;
        System.out.println("a * b  = " + multi);

        //나눗셈
        int div = a/b;
        System.out.println("a / b = " + div);

        //나머지
        int mod = a %b ;
        System.out.println("a % b = " + mod);
    }
}
/*
자바에서 같은 int형끼리 계산하면 계산 결과도 같은 int 형을 사용한다 int 형은 정수이기 때문에 소수점 이하를 포함할수 없다

 */