package Operator;

public class Comp1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        //결과를 boolean 변수에 담을 수 있다
        boolean result = a == b;
        System.out.println(result);

    /*
    비교 연산자를 사용하면 참 또는 거짓 이라는 결과가나온다 참 거짓은 boolean형을 사용한다
    여기서 주의할점은 =와 ==이 다르다는 점이다
     = 대입 연산자 변수에 값을 대입한다
     == 동등한지 확인하는 비교 연산자
     불일치 연산자는 !=를 사용한다 !는 반대라는 뜻이다

     문자열이 같은지 비교할 때는 ==이 아니라 .equals()메서드를 사용해야 한다

     */
    }
}
