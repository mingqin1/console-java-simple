/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter10;
import java.util.Comparator;
public class Sect2_Ex2 
{
    public static void main(String[] args)
    {
        Comparator<String> reversed = Comparator.reverseOrder();

        System.out.println(reversed.compare("Larry", "Libby"));
    }
}

