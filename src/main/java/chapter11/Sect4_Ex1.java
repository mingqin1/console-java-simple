package chapter11;

import java.util.Optional;
public class Sect4_Ex1
{
    public static void main(String[] args)
    {

        String t=null, u="Hello2";

        String s = Optional.ofNullable(t)   // Optional has null
                .orElse(u);      // Optional has "Hello"

        System.out.println( s);

        String s2 = Optional.ofNullable(t)         // null
                .orElseGet( () -> u);  // "Hello"

        System.out.println( s2);
    }
}