package com.company;
import java.io.*;
import java.util.*;


public class Strings {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

//TODO: Sum the lengths of A and B.
        System.out.println(A.length()+B.length());
//TODO: Determine if A is lexicographically larger than B (i.e.: does  come before  in the dictionary?).
        System.out.println(A.compareTo(B)>0?"Yes":"No");
//TODO: Capitalize the first letter in  and  and print them on a single line, separated by a space.
        System.out.println((A.substring(0, 1).toUpperCase() + A.substring(1)) +" "+ (B.substring(0, 1).toUpperCase() + B.substring(1)));

    }

}
