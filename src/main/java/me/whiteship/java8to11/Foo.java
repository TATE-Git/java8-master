package me.whiteship.java8to11;

import java.util.Locale;

public interface Foo {

    void  printName();

    /*@implSpec 이 구현체는 getName()으로 가져온 문자열을 대문자로 출력한다.*/
    default void printNameUpperCase(){
//        System.out.println("FOO");
//        System.out.println(getName());
        System.out.println(getName().toUpperCase());
    };

    static void printAnything(){
        System.out.println("Foo");
    }

    String toString();
    String getName();
}
