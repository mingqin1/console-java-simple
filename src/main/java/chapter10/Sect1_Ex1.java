/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/


package chapter10;
import java.util.Comparator;
public class Sect1_Ex1 
{
    public static String removeVowels(String s) 
    {
        return s.replaceAll("[aeiou]","");
    }
    public static void main(String[] args)
    {
        Comparator<String> byConsonants = (x,y) -> 
                   removeVowels(x).compareTo(removeVowels(y));
        System.out.println(byConsonants.compare("Larry", "Libby"));  
    }
}

