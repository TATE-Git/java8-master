package me.whiteship.java8to11;

import java.util.function.*;

public class Foo_old {

    public static void main(String[] args){

        /*
        2. 함수형 인터페이스와 람다 표현식 소개

        함수형 인터페이스 (Functional Interface)
        ● 추상 메소드를 딱 하나만 가지고 있는 인터페이스
        ● SAM (Single Abstract Method) 인터페이스
        ● @FuncationInterface 애노테이션을 가지고 있는 인터페이스

        람다 표현식 (Lambda Expressions)
        ● 함수형 인터페이스의 인스턴스를 만드는 방법으로 쓰일 수 있다.
        ● 코드를 줄일 수 있다.
        ● 메소드 매개변수, 리턴 타입, 변수로 만들어 사용할 수도 있다.
        */

//        //익명 내부 클래스 anonymous inner class
//        RunSomething runSomething = new RunSomething() {
//            @Override
//            public void doIt() {
//                System.out.println("Hello");
//            }
//        };

//        //Lambda 1줄
//        RunSomething runSomething = () -> System.out.println("Hello");
//        runSomething.doIt();

//        //Lambda 2줄 이상
//        RunSomething runSomething = () -> {
//            System.out.println("Hello");
//            System.out.println("Lambda");
//        };

        /*
        2. 함수형 인터페이스와 람다 표현식 소개

        자바에서 함수형 프로그래밍
        ● 함수를 First class object로 사용할 수 있다.
        ● 순수 함수 (Pure function)
            ○ 사이드 이팩트가 없다. (함수 밖에 있는 값을 변경하지 않는다.)
            ○ 상태가 없다. (함수 밖에 있는 값을 사용하지 않는다.)
        ● 고차 함수 (Higher-Order Function)
            ○ 함수가 함수를 매개변수로 받을 수 있고 함수를 리턴할 수도 있다.
        ● 불변성
        */

//        //Lambda 연습
//        RunSomething runSomething = (number) -> {
//            return number + 10;
//        };
//        System.out.println(runSomething.doIt(1));


//        //Lambda 연습
//        int baseNumber = 10;
//        RunSomething runSomething = new RunSomething() {
//            @Override
//            public int doIt(int number) {
//                return number + baseNumber;
//            }
//        };

//        //Lambda 연습
//        int baseNumber = 10;
//        RunSomething runSomething = number -> number + baseNumber;

//        //예제 1
//        Plus10 plus10 = new Plus10();
//        System.out.println(plus10.apply(1));

//        // 예제 1 Lambda
//        Function<Integer, Integer> plus10 = (i) -> i + 10;
//        Function<Integer, Integer> multiply2 = (i) -> i * 2;
//        Function<Integer, Integer> multply2AndPlus10 = plus10.compose(multiply2);
//        System.out.println(plus10.apply(1));
//        plus10.compose(multiply2);
//        System.out.println(plus10.compose(multiply2));
//        System.out.println(plus10.compose(multply2AndPlus10.apply(2));
//        System.out.println(plus10.andThen(multiply2).apply(2));

//        Consumer<Integer> printT = (i) -> System.out.println(i);
//        printT.accept(10);
//        Supplier<Integer> get10 = () ->10;
//        System.out.println(get10);

//        Predicate<String> startsWithJava8 = (s) -> s.startsWith("Java8");
//        Predicate<Integer> isEven = (i) -> i%2 ==0;
//        startsWithJava8.and();

//        UnaryOperator<Integer> plus10 = (i) -> i + 10;
//        UnaryOperator<Integer> multiply2 = (i) -> i * 2;
//        System.out.println(plus10.andThen(multiply2).apply(2));


//        Supplier<Integer> get10 = () -> {
//            return 10;
//        };
//        Supplier<Integer> get10 = () ->  10;

//        BinaryOperator<Integer> sum = (a,b) ->  a + b;

        Foo_old foo = new Foo_old();
        foo.run();
    }

    private void run(){
        int baseNumber = 10;

        //로컬클래스
        class  LocalClass{
            void printBaseNumber(){
                System.out.println(baseNumber);
            }
        }

        //익명클래스
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(baseNumber);
            }
        };

        //람다
        IntConsumer printInt = (i) -> {
            System.out.println(i + baseNumber);
        };

        System.out.println(10);
    };

}
