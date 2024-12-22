package loop;

public class Break1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while(true){
            sum = sum + i;
            if(sum > 10){
                System.out.println("합이 10보다 크면 종료 : i =" + i + "sum=" +sum );
                break;
            }
            i++;
        }
    }
}

/*
조건식을 잘 보면 ture라고 되어있다. 조건이 항상 참이기 때문에 이렇게 두면 while문은 무한 반복된다. 그래서 break문이 있기 때문에 중간에
빠져나올수 있다
break와 contunue는 반복문에서 사용할 수 있는 키워드다.
break는 반복문을 즉시 종료하고 나간다. continue는 반복문의 나머지 부분을 건너뛰고 다음 반복으로 진행하는데 사용된다.

while(조건식){
코드1;
break;
코드2;
}
break를 만나면 코드2가 실행도지 않고 while문이 종료된다

*/