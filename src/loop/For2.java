package loop;

public class For2 {
    public static void main(String[] args) {
        int sum = 0;
        int num = 3;

        for(int i = 1; i< num; i++){
            sum= sum + i;
            System.out.println("i=" + i + "sum=" + sum);
        }
    }
}
/*
for문과 while문을 비교했을때 for문이 더 깔끔하다는 느낌을 받았습니다 for문은 초기화, 조건검사, 반복후 작업등이 규칙적으로 한줄에 모두
있어서 코드를 이해하기가 더 쉬웠습니다 반복을 위해 값 증가 카운터 변수를 다른 부분과 구분이 쉬웠습니다.


 */