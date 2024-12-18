package cond;

public class If4 {
    public static void main(String[] args) {
        int age = 14;

        if (age <= 7) {
            System.out.println("미취학");
        } else if (age <= 13) {
            System.out.println("초등학생");
        } else if (age <= 16) {
            System.out.println("중학생");
        } else if (age <= 19) {
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }
    }
}

/*
if(condition1){
작업1수행}
else if(condition2){
작업 2 수행
}
if(condition1){
작업1 수행
}
if(condition2){
작업2 수행
}
if - else if 는 작업 1, 작업 2 둘중 하나만 수행된다. 그런데 if - if 는 조건만 맞다면 둘다 수행이 될수 있다

if 문에 여러 조건이 있다고 항상 if-else로 묶어서 사용할 수 있는 것은 아니다. 조건이 서로 영향이 주지 않고 각각 수행해야 하는 경우에는 else if 문을
사용하면 안되고, 대신에 여러 if 문을 분리해서 사용해야 한다
 */


