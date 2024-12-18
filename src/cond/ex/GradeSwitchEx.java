package cond.ex;

public class GradeSwitchEx {
    public static void main(String[] args) {
        String grade = "b";

        switch (grade){
            case "a":
                System.out.println("탁월한 성과입니다");
                break;
            case "b":
                System.out.println("좋은 성과입니다");
                break;
            case "c":
                System.out.println("준수한 성과입니다");
                break;
            case "d":
                System.out.println("향상 성과입니다");
                break;
            case "f":
                System.out.println("불합격입니다");
                break;
            default:
                System.out.println("잘못된 성적입니다");
        }


    }
}
