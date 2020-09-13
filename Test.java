package com.company;

import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int vCount = 0, cCount = 0;

        System.out.print("Enter String : ");
        String s=sc.next();

        s = s.toLowerCase();

        for(int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == 'a' || s.charAt(i) == 'e'||
               s.charAt(i) == 'i' || s.charAt(i) == 'o' ||
            s.charAt(i) == 'u')
            {
                vCount++;
            }
            else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                cCount++;
            }
        }
        System.out.println("Number of vowels: " + vCount);
        System.out.println("Number of consonants: " + cCount);
    }
}

