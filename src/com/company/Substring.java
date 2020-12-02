package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Substring {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
//        String subStr = "";
//        for (int i = start; i <= end; i++) {
        System.out.println(S.substring(start,end));


    }
}
