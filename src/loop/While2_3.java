package loop;

public class While2_3 {
    public static void main(String[] args) {
        int sum = 0 ;
        int i = 1;
        int Num= 3;

        while(i <= Num){
            sum = sum  + i;
            System.out.println("i=" + i + "sum = " + sum);
            i++;
        }
    }
}
/*
while문에서 i<=endNum 조건을 통해 i 가 endNum이 될때 까지 코드 블럭을 실행한다
i 가 endNum보다 크면 while문을 종료한다.
sum = 0 i = 1 Num = 3
첫 번째 반복
while (i(1) <= Num(3)) -> true(참)
sum(0) + i(1) -> sum (1)
i(1)++ -> i(2)
두 번째 반복
while (i(2) <= Num(3)) -> true(참)
sum(1) + i(2) -> sum (3)
i(2)++ -> i(3)
세 번째 반복
while (i(3) <= Num(3)) -> true(참)
sum(3) + i(3) -> sum (6)
i(3)++ -> i(4)

네 번째 루프
while(i(4)) <= Num(3)) -> false(거짓)

 */