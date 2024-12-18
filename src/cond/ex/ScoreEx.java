package cond.ex;

public class ScoreEx {
    public static void main(String[] args) {
        int score = 80;

        if(score >= 90){
            System.out.println("학점은 A입니다");
        }else if(score>=80){
            System.out.println("학점은 b 입니다");
        } else if (score>=70) {
            System.out.println("학점은 c 입니다");
        } else if (score>=60) {
            System.out.println("학점은 d 입니다");
        } else {
            System.out.println("학점은 f 입니다");
        }
    }
}
