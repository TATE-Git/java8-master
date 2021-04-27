package me.whiteship.java8to11;

import java.util.Locale;

public class DefaultFoo implements Foo
{
    String name;

    public DefaultFoo(String name){
        this.name = name;
    }

    @Override
    public void printNameUpperCase(){
        System.out.println(this.name.toUpperCase());
    }

    @Override
    public void printName(){
        //sout 단축키
//        System.out.println("DefaultFoo");
        System.out.println(this.name);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
