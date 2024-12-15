package Operator;

public class Logical2 {
    public static void main(String[] args) {
        int a = 15;
        // a는 10보다 크고 20보다 작다
        boolean result = a > 10 && a < 20; // (a>10) &&(a<20)
        System.out.println("result =" +result);

        /*
        대입연산자(=)는 값을 변수에 할당하는 연산자다. 이 연산자를 사용하면 변수에 값을 할당한다
        축약(복합) 대입 연산자
        산술 연산자와 대입 연산자를 한번에 축약해서 사용할 수 있는데, 이것을 축약(복합) 대입 연산자라 한다
        연산자 종류 : +=,-+,*=,/+,%=
        i = i+3 -> i+=3
         */
    }
}
