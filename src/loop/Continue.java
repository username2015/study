package loop;

public class Continue {
    public static void main(String[] args) {
        // 1 부터 5까지 증가하는 숫자를 출력하는데 숫자 2를 제외하고 출력해보자
        int i =1;

        while(i<=5){
            if(i==2){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
/*
while(조건식){
코드1;
continue;
코드2;
}
continue를 만나면 코드2가 실행되지 않고 다시 조건식으로 이동한다. 조건식이 참이면 while문을 실행한다.

 */