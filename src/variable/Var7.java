package variable;

public class Var7 {
    public static void main(String[] args) {
        int a = 100; //정수
        double b = 10.5; //실수
        boolean c  = true ; // 불리언(boolean) true, false 입력 가능
        char d ='a' ; // 문자 하나 작은따옴표를 사용해야한다
        String e ="Hello Java"; // 문자열, 문자열을 다루기 위한 특별한 타입

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
/*
 변수는 데이터를 다루는 종류에 따라 다양한 형식이 존재함 참고로 String은 첫 글자가 대문자로 시작하는 특별한 타입이다

 int a ="백원"; 정수타입 문자열 x
 int a = "100"; 정수 타입에 문자열 x 숫자 100이 아니라 문자열 "100"이다 문자를 나타내는 쌍따옴표로 감싸져 있다
 int a = 100; 정수 타입에 정수 100 o


 리터럴 이라는 단어의 어원이 문자 또는 글자를 의미한다
 코드에서 개발자가 직접적은 고정된 값을 프로그래밍 용어로 리터럴이라고 한다
 */