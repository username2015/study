package cond;

public class Switch3 {
    public static void main(String[] args) {
        int grade = 2;
        int coupon;
        switch (grade){
            case 1:
                coupon = 1000;
                break;
            case 2:
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
                break;
        }
        System.out.println("발급 받은 쿠폰 " + coupon);
    }
}
// 2등급하고 3등급이 3000원 쿠폰을 받는다

/*
if vs switch
switch문의 조건식을 넣는 부분을 잘보면 참 거짓의 결과가 나오는 조건이 아니라 단순히 값만 넣을 수 있다
switch문은 조건식이 특정 case와 같은지 만 체크할 수 있다. 쉽게 이야기해서 값이 같은지 확인하는 연산만 가능하다(문자도 가능)
반면에 if문은 참 거짓의 결과가 나오는 조건식을 자유롭게 적을 수 있다
 */