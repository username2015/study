package Operator;

public class OperatoraAdd1 {
    public static void main(String[] args) {
        int a = 0;

        a = a + 1;
        System.out.println("a = " + a); //1

         a = a + 1;
        System.out.println("a = " + a); //2

        //증감 연산자
        ++a; // a=a+1
        System.out.println("a = " + a);//3
        ++a; // a=a+1
        System.out.println("a = " + a);//4
        /*
        변수 a의 값을 하나 증가하려면 a =a +1 연산을 수행해야 한다. 자기 자신에 1을 더하고 그 결과를 자신에게 다시 저장해야 한다
        a = a + 1 을 ++a로 간단히 표현할 수 있는 것이 바로 증감 연산자이다.
        정리하면 해당 변수에 들어있는 숫자 값을 하나 증가하는 것이다
        ++(증가) --(감소)
        전위,후위 증감 연산자
        증감 연산자는 피연산자 앞에 두거나 뒤에 둘 수 있으며, 연산자의 위치에 따라 연산이 수행되는 시점이 달라진다
        ++a: 증감 연산자를 피연산자 앞에 둘 수 있다. 이것을 앞에 있다고 해서 전위 증감 연산자라 한다
        a++: 증감 연산자를 피연산자 뒤에 둘 수 있다. 이것을 뒤에 있다고 해서 후위 증감 연산자라 한다
         */

    }


}
